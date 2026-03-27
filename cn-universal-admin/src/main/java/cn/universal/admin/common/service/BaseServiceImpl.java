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

package cn.universal.admin.common.service;

import cn.universal.persistence.entity.IoTUser;
import cn.universal.security.service.IoTUserService;
import jakarta.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;

public class BaseServiceImpl implements BaseService {

  @Resource private IoTUserService ioTUserService;

  @Override
  @Cacheable(cacheNames = "user_parent_entity", key = "''+#unionId", unless = "#result == null")
  public IoTUser queryIotUser(String unionId) {
    IoTUser iotUser = ioTUserService.selectUserByUnionId(unionId);
    if (iotUser.getParentUnionId() != null) {
      iotUser = ioTUserService.selectUserByUnionId(iotUser.getParentUnionId());
      return iotUser;
    }
    return iotUser;
  }
}
