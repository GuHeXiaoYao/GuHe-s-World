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

package cn.universal.persistence.mapper;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.persistence.entity.IoTDeviceSubscribe;
import java.util.List;

public interface IoTDeviceSubscribeMapper extends BaseMapper<IoTDeviceSubscribe> {

  List<IoTDeviceSubscribe> selectSubscribeBO(IoTDeviceSubscribe ioTDeviceSubscribe);

  List<IoTDeviceSubscribe> selectSubscribesBO(IoTDeviceSubscribe ioTDeviceSubscribe);

  List<IoTDeviceSubscribe> selectByMsgAndType(IoTDeviceSubscribe ioTDeviceSubscribe);
}
