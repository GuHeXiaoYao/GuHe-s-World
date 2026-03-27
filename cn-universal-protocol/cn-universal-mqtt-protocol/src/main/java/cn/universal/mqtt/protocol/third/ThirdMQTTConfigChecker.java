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

package cn.universal.mqtt.protocol.third;

/**
 * MQTT配置检查器接口
 *
 * <p>用于解决SystemMqttManager和MqttConfigService之间的循环依赖问题 只暴露必要的配置检查方法，避免直接依赖具体实现
 *
 * *
 * 
 * 
 */
public interface ThirdMQTTConfigChecker {

  /**
   * @param productKey
   * @return
   */
  boolean supportMQTTNetwork(String productKey);

  /**
   * @param productKey
   * @return
   */
  boolean supportMQTTNetwork(String productKey, String networkUnionId);
}
