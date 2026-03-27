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

package cn.universal.admin.system.service;

import cn.universal.admin.common.service.BaseService;
import cn.universal.common.domain.R;
import cn.universal.persistence.entity.IoTDeviceSubscribe;
import java.util.List;

/** 设备订阅 */
public interface IoTDeviceSubscribeService extends BaseService {

  List<IoTDeviceSubscribe> selectDevSubscribeList(IoTDeviceSubscribe sub);

  IoTDeviceSubscribe selectDevInstanceById(String id);

  R updateDevSubscribe(IoTDeviceSubscribe sub);

  R insertDevSubscribe(IoTDeviceSubscribe sub);

  R deleteDevSubscribe(String productKey, String iotId, Long[] ids);
}
