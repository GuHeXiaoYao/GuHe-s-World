/*
 *
 * 
 *
 *    
 *  *Xin
 * *
 * 
 *
 *
 */
package cn.universal.dm.device.service.push;

/**
 * mqtt消息推送接口
 *
 * *
 * 
 * 
 */
public interface MQTTPushService {

  /**
   * 消息推送
   *
   * @param topic 主题
   * @param payload 有效载荷
   * @param qos qos
   * @param retained 是否保存
   * @return
   */
  boolean publishMessage(String topic, byte[] payload, int qos, boolean retained);
}
