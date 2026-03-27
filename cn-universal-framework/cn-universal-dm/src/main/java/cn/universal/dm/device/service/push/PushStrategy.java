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

package cn.universal.dm.device.service.push;

import cn.universal.dm.device.entity.IoTPushResult;
import cn.universal.persistence.base.BaseUPRequest;

/**
 * 推送策略接口
 *
 * *
 * 
 * 
 */
public interface PushStrategy {

  /**
   * 执行推送
   *
   * @param request 上行请求
   * @param messageJson 消息JSON字符串
   */
  IoTPushResult execute(BaseUPRequest request, String messageJson);

  /**
   * 是否支持该推送类型
   *
   * @return 是否支持
   */
  boolean isSupported();
}
