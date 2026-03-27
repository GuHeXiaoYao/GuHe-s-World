/*
 *
 * 
 *
 *   *
 *  *
 * *
 * 
 *
 *
 */

package cn.universal.rule.wrapper;

import cn.hutool.core.collection.CollectionUtil;
import cn.universal.persistence.base.BaseUPRequest;
import cn.universal.persistence.base.IoTUPWrapper;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * *
 * 
 * 
 */
@Service("iotUPTcpClientService")
@Slf4j
public class IoTUPTcpClientService implements IoTUPWrapper<BaseUPRequest> {

  // 809协议转发 广播
  @Override
  @Async
  public void beforePush(List<BaseUPRequest> baseUPRequests) {
    if (CollectionUtil.isEmpty(baseUPRequests)) {
      return;
    }
    //    baseUPRequests.stream().forEach(baseUPRequest -> {
    //      IoTDeviceDTO instanceBO = baseUPRequest.getIoTDeviceDTO();
    //      //tcp 809协议推送第三方
    //      log.info("809协议推送第三方={}", instanceBO);
    //    });
  }
}
