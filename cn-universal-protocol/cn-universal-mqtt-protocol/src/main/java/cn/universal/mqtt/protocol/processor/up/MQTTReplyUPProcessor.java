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

package cn.universal.mqtt.protocol.processor.up;

import cn.universal.mqtt.protocol.processor.up.common.BaseReplyProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * MQTT发布处理器
 *
 * <p>处理消息发布和回复 支持主动推送、回复消息、通知发送等
 *
 * @version 2.0 *
 * 
 */
@Slf4j(topic = "mqtt")
@Component
public class MQTTReplyUPProcessor extends BaseReplyProcessor {

  @Override
  protected String getTopicType() {
    return "MQTT消息回复";
  }
}
