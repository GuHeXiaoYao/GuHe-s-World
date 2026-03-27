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

import cn.universal.mqtt.protocol.entity.MQTTUPRequest;
import cn.universal.mqtt.protocol.processor.up.common.BaseLogShadowProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * MQTT解码处理器
 *
 * <p>MQTTUPRequest，负责将MQTT协议转换
 *
 * @version 2.0 *
 * 
 */
@Slf4j(topic = "mqtt")
@Component
public class LogShadowProcessorUP_SIX extends BaseLogShadowProcessor {

  @Override
  protected String getTopicType() {
    return "";
  }

  @Override
  protected boolean processTopicSpecificLogShadow(MQTTUPRequest request) {
    return true;
  }
}
