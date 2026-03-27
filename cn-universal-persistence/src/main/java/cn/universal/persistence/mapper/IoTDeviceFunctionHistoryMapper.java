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
import cn.universal.persistence.entity.IoTDeviceFunctionHistory;
import cn.universal.persistence.entity.bo.IoTDeviceFunctionTaskBO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 设备功能下发任务Mapper接口
 *
 * @since 2025-12-30
 */
public interface IoTDeviceFunctionHistoryMapper extends BaseMapper<IoTDeviceFunctionHistory> {

  int retryHistory(@Param("bo") IoTDeviceFunctionTaskBO ioTDeviceFunctionTaskBO);

  void batchInsert(@Param("list") List<IoTDeviceFunctionHistory> histories);
}
