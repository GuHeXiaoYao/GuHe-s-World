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

package cn.universal.admin.platform.service;

import cn.universal.persistence.entity.IoTDeviceEvents;
import cn.universal.persistence.entity.bo.IoTDeviceLogBO;
import cn.universal.persistence.entity.vo.IoTDeviceLogVO;
import cn.universal.persistence.query.LogQuery;
import java.util.List;

/**
 * 设备日志Service接口
 *
 * @since 2025-12-30
 */
public interface IIoTDevLogService {

  /** 分页查询设备日志列表 */
  List<IoTDeviceLogVO> queryPageList(IoTDeviceLogBO bo);

  /** 根据日志id查询日志详情 */
  IoTDeviceLogVO queryById(LogQuery logQuery);

  /**
   * 获取设备事件的统计信息
   *
   * @param productId 产品Id
   * @param iotId 设备id
   */
  List<IoTDeviceEvents> queryEventTotal(String productId, String iotId);
}
