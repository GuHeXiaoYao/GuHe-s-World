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

package cn.universal.rule.scene.deviceUp;

import cn.universal.common.constant.IoTConstant;
import cn.universal.core.message.UPRequest;
import cn.universal.persistence.entity.bo.TriggerBO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DeviceReplyUp extends AbstractDeviceUp implements DeviceUp {

  @Override
  public String messageType() {
    return IoTConstant.MessageType.REPLY.name();
  }

  @Override
  public boolean testAlarm(List<TriggerBO> triggers, String separator, UPRequest upRequest) {
    return false;
  }
}
