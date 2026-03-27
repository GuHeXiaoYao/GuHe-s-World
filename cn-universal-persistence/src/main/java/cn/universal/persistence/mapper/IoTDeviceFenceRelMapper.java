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
import cn.universal.persistence.entity.IoTDeviceFenceRel;
import cn.universal.persistence.entity.vo.IoTDeviceGeoFenceVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 设备和围栏中间表 *
 *
 *  8:54
 */
public interface IoTDeviceFenceRelMapper extends BaseMapper<IoTDeviceFenceRel> {

  int deleteFenceInstance(@Param("iotId") String iotId);

  int deleteDeviceIdAndFenceId(@Param("deviceId") String deviceId, @Param("fenceId") Long fenceId);

  List<IoTDeviceGeoFenceVO> selectFenceByIotId(@Param("iotId") String iotId);
}
