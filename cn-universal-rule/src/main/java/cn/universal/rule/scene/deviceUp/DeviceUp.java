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

import cn.universal.core.message.UPRequest;
import cn.universal.persistence.dto.IoTDeviceDTO;

public interface DeviceUp {

  String messageType();

  void consumer(UPRequest upRequest, IoTDeviceDTO ioTDeviceDTO);
}
