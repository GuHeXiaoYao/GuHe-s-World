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

public interface BaseService {

  IoTUser queryIotUser(String unionId);
}
