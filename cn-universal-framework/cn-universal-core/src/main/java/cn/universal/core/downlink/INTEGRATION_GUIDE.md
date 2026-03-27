# 拦截器模式集成指南

## 📖 概述

本文档指导如何将现有的协议服务改造为支持拦截器模式的新架构。

## 🔄 改造步骤

### 步骤1：理解新架构

**改造前的流程**：
```
IDown.doAction() → AbstractDownService.convert() → XxxDownProcessorChain.process()
```

**改造后的流程**：
```
IDown.doAction() 
  → createContext()                    // 创建上下文
  → doActionWithInterceptors()         // 拦截器模板方法
    → PRE 拦截器                        // 前置拦截器
    → doProcess()                       // 核心处理（原来的逻辑）
      → convert()                       // 消息转换
      → MID 拦截器                      // 中置拦截器
      → ProcessorChain.process()        // 处理器链
    → POST 拦截器                       // 后置拦截器
    → afterCompletion 拦截器            // 完成拦截器
```

### 步骤2：改造协议服务类

以 `MQTTDownService` 为例，需要做以下改造：

#### 2.1 添加拦截器链依赖

```java
@Service("mqttDownService")
@Slf4j(topic = "mqtt")
public class MQTTDownService extends AbstractDownService<MQTTDownRequest> implements IDown {

  @Resource private MqttModuleInfo mqttModuleInfo;
  @Resource private MQTTDownProcessorChain mqttDownProcessorChain;
  
  // ✅ 新增：注入拦截器链
  @Resource private DownlinkInterceptorChain downlinkInterceptorChain;
  
  // ... 其他代码
}
```

#### 2.2 实现 createContext() 方法

```java
@Override
public DownlinkContext<?> createContext(Object msg) {
  DownlinkContext<MQTTDownRequest> context = new DownlinkContext<>();
  
  // 设置原始消息
  if (msg instanceof String) {
    context.setRawMessage((String) msg);
  } else if (msg instanceof JSONObject) {
    context.setJsonMessage((JSONObject) msg);
    context.setRawMessage(JSONUtil.toJsonStr(msg));
  }
  
  // 设置协议信息（已在 doActionWithInterceptors 中设置，这里可选）
  context.setProtocolCode(code());
  context.setProtocolName(name());
  
  return context;
}
```

#### 2.3 实现 doProcess() 方法

```java
@Override
public R doProcess(DownlinkContext<?> context) {
  try {
    // 1. 消息转换
    MQTTDownRequest downRequest;
    if (context.getRawMessage() != null) {
      downRequest = convert(context.getRawMessage());
    } else if (context.getJsonMessage() != null) {
      downRequest = doConvert(context.getJsonMessage());
    } else {
      return R.error("消息为空");
    }
    
    // 设置到上下文
    context.setDownRequest(downRequest);
    
    // 提取关键信息到上下文（供拦截器使用）
    if (downRequest != null) {
      context.setProductKey(downRequest.getProductKey());
      context.setDeviceId(downRequest.getDeviceId());
      context.setIotId(downRequest.getIotId());
    }
    
    // 2. 执行处理器链
    R result = mqttDownProcessorChain.process(downRequest);
    
    return result;
    
  } catch (Exception e) {
    log.error("[MQTT下行] 处理异常", e);
    return R.error("处理异常: " + e.getMessage());
  }
}
```

#### 2.4 实现 getInterceptorChain() 方法

```java
@Override
public DownlinkInterceptorChain getInterceptorChain() {
  return downlinkInterceptorChain;
}
```

#### 2.5 移除 doAction() 方法的重写（使用默认实现）

```java
// ❌ 删除以下方法（使用IDown接口的默认实现）
// @Override
// public R doAction(JSONObject msg) {
//   return mqttDownProcessorChain.process(doConvert(msg));
// }
//
// @Override
// public R doAction(String msg) {
//   log.info("mqtt down msg={}", msg);
//   return mqttDownProcessorChain.process(convert(msg));
// }
```

### 步骤3：完整改造后的代码

```java
package cn.universal.mqtt.protocol.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.universal.common.constant.IoTConstant.DownCmd;
import cn.universal.common.domain.R;
import cn.universal.core.downlink.DownlinkContext;
import cn.universal.core.downlink.DownlinkInterceptorChain;
import cn.universal.core.service.IDown;
import cn.universal.dm.device.service.AbstractDownService;
import cn.universal.mqtt.protocol.config.MqttModuleInfo;
import cn.universal.mqtt.protocol.entity.MQTTDownRequest;
import cn.universal.mqtt.protocol.processor.MQTTDownProcessorChain;
import cn.universal.persistence.dto.IoTDeviceDTO;
import cn.universal.persistence.entity.IoTProduct;
import cn.universal.persistence.query.IoTDeviceQuery;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 系统内置MQTT下行处理类
 *
 * @version 2.0（支持拦截器模式）
 * *
 *  22:19
 */
@Service("mqttDownService")
@Slf4j(topic = "mqtt")
public class MQTTDownService extends AbstractDownService<MQTTDownRequest> implements IDown {

  @Resource private MqttModuleInfo mqttModuleInfo;
  @Resource private MQTTDownProcessorChain mqttDownProcessorChain;
  @Resource private DownlinkInterceptorChain downlinkInterceptorChain;

  @Override
  public String code() {
    return mqttModuleInfo.getCode();
  }

  @Override
  public String name() {
    return mqttModuleInfo.getName();
  }

  @Override
  public DownlinkContext<?> createContext(Object msg) {
    DownlinkContext<MQTTDownRequest> context = new DownlinkContext<>();
    
    // 设置原始消息
    if (msg instanceof String) {
      context.setRawMessage((String) msg);
    } else if (msg instanceof JSONObject) {
      context.setJsonMessage((JSONObject) msg);
      context.setRawMessage(JSONUtil.toJsonStr(msg));
    }
    
    return context;
  }

  @Override
  public R doProcess(DownlinkContext<?> context) {
    try {
      // 1. 消息转换
      MQTTDownRequest downRequest;
      if (context.getRawMessage() != null) {
        downRequest = convert(context.getRawMessage());
      } else if (context.getJsonMessage() != null) {
        downRequest = doConvert(context.getJsonMessage());
      } else {
        return R.error("消息为空");
      }
      
      // 设置到上下文
      context.setDownRequest(downRequest);
      
      // 提取关键信息到上下文
      if (downRequest != null) {
        context.setProductKey(downRequest.getProductKey());
        context.setDeviceId(downRequest.getDeviceId());
        context.setIotId(downRequest.getIotId());
      }
      
      // 2. 执行处理器链
      R result = mqttDownProcessorChain.process(downRequest);
      
      return result;
      
    } catch (Exception e) {
      log.error("[MQTT下行] 处理异常", e);
      return R.error("处理异常: " + e.getMessage());
    }
  }

  @Override
  public DownlinkInterceptorChain getInterceptorChain() {
    return downlinkInterceptorChain;
  }

  @Override
  protected MQTTDownRequest convert(String request) {
    return doConvert(request);
  }

  private MQTTDownRequest doConvert(Object request) {
    MQTTDownRequest value = null;
    if (request instanceof JSONObject) {
      value = JSONUtil.toBean((JSONObject) request, MQTTDownRequest.class);
    } else if (request instanceof String) {
      value = JSONUtil.toBean((String) request, MQTTDownRequest.class);
    } else {
      value = JSONUtil.toBean(JSONUtil.toJsonStr(request), MQTTDownRequest.class);
    }
    
    IoTProduct ioTProduct = getProduct(value.getProductKey());
    value.setIoTProduct(ioTProduct);
    
    // 设置IoTDeviceDTO
    IoTDeviceDTO ioTDeviceDTO =
        getIoTDeviceDTO(
            IoTDeviceQuery.builder()
                .productKey(value.getProductKey())
                .deviceId(value.getDeviceId())
                .build());
    value.setIoTDeviceDTO(ioTDeviceDTO);
    value.getDownCommonData().setConfiguration(parseProductConfigurationSafely(ioTProduct));
    
    // 功能且function对象不为空，则编解码，并复制编解码后的内容
    if (DownCmd.DEV_FUNCTION.equals(value.getCmd())
        && CollectionUtil.isNotEmpty(value.getFunction())) {
      String deResult =
          encodeWithShadow(
              value.getProductKey(), value.getDeviceId(), JSONUtil.toJsonStr(value.getFunction()));
      value.setPayload(deResult);
    }
    
    return value;
  }

  // ✅ doAction() 方法已移除，使用 IDown 接口的默认实现
  // ✅ 默认实现会自动调用：createContext() → doActionWithInterceptors() → doProcess()
}
```

## 🎯 改造要点总结

### ✅ 必须实现的方法
1. `createContext(Object msg)` - 创建下行上下文
2. `doProcess(DownlinkContext<?> context)` - 核心处理逻辑
3. `getInterceptorChain()` - 获取拦截器链

### ✅ 必须添加的依赖
```java
@Resource private DownlinkInterceptorChain downlinkInterceptorChain;
```

### ✅ 必须移除的方法
- `doAction(String msg)` - 使用接口默认实现
- `doAction(JSONObject msg)` - 使用接口默认实现

### ✅ 保持不变的方法
- `code()` - 协议代码
- `name()` - 协议名称
- `convert()` - 消息转换逻辑

## 🔍 逐步迁移策略

### 方案1：一次性迁移（推荐用于新协议）
直接按照上述步骤改造，一次性启用拦截器模式。

### 方案2：渐进式迁移（推荐用于现有协议）

#### 阶段1：兼容模式（支持新旧两种方式）
```java
@Override
public R doAction(String msg) {
  // 判断是否启用拦截器模式
  if (enableInterceptor()) {
    // 新模式：使用拦截器
    return IDown.super.doAction(msg);
  } else {
    // 旧模式：保持原有逻辑
    log.info("mqtt down msg={}", msg);
    return mqttDownProcessorChain.process(convert(msg));
  }
}

private boolean enableInterceptor() {
  // 通过配置控制是否启用拦截器
  return Boolean.parseBoolean(
    System.getProperty("downlink.interceptor.enabled", "false")
  );
}
```

#### 阶段2：灰度发布
```yaml
# application.yml
downlink:
  interceptor:
    enabled: true
    protocols:  # 仅对指定协议启用
      - mqtt
      - tcp
```

#### 阶段3：全面启用
移除兼容代码，完全使用新模式。

## 🧪 测试清单

### 功能测试
- [ ] 下行消息能正常发送
- [ ] 拦截器按顺序执行
- [ ] 拦截器可以中断执行
- [ ] 上下文数据正确传递
- [ ] 异常能正确处理

### 性能测试
- [ ] 拦截器对性能影响在可接受范围内（< 5%）
- [ ] 并发场景下正常工作
- [ ] 无内存泄漏

### 兼容性测试
- [ ] 现有业务功能不受影响
- [ ] 各协议下行正常
- [ ] 第三方平台下行正常

## 📋 其他协议改造示例

### TCP 协议改造
```java
@Service("tcpDownService")
public class TcpDownService extends AbstractDownService<TcpDownRequest> implements IDown {
  @Resource private DownlinkInterceptorChain downlinkInterceptorChain;
  
  @Override
  public DownlinkContext<?> createContext(Object msg) {
    // 实现逻辑...
  }
  
  @Override
  public R doProcess(DownlinkContext<?> context) {
    // 实现逻辑...
  }
  
  @Override
  public DownlinkInterceptorChain getInterceptorChain() {
    return downlinkInterceptorChain;
  }
}
```

### HTTP 协议改造
```java
@Service("httpDownService")
public class HttpDownService extends AbstractDownService<HttpDownRequest> implements IDown {
  @Resource private DownlinkInterceptorChain downlinkInterceptorChain;
  
  @Override
  public DownlinkContext<?> createContext(Object msg) {
    // 实现逻辑...
  }
  
  @Override
  public R doProcess(DownlinkContext<?> context) {
    // 实现逻辑...
  }
  
  @Override
  public DownlinkInterceptorChain getInterceptorChain() {
    return downlinkInterceptorChain;
  }
}
```

## ⚠️ 常见问题

### Q1: 为什么不能直接在 IDown 接口中注入 DownlinkInterceptorChain？
A: 接口不能有成员变量，需要由实现类通过依赖注入提供。

### Q2: 拦截器链为 null 怎么办？
A: `doActionWithInterceptors()` 中已经做了 null 检查，即使拦截器链为 null，也能正常工作。

### Q3: 如何禁用某个拦截器？
A: 在拦截器中实现 `isEnabled()` 方法，返回 false。

### Q4: 拦截器执行顺序如何控制？
A: 通过 `getOrder()` 方法和 `@Order` 注解控制，数字越小越先执行。

### Q5: 如何只对特定协议应用拦截器？
A: 在拦截器的 `supports()` 方法中判断协议类型。

## 📚 相关文档

- [拦截器系统 README](./README.md)
- [IDown 接口](../../service/IDown.java)
- [DownlinkContext 上下文](./DownlinkContext.java)
- [DownlinkInterceptor 拦截器接口](./DownlinkInterceptor.java)
