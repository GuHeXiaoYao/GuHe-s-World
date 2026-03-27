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
import cn.universal.persistence.entity.IoTDeviceGeoFence;
import cn.universal.persistence.entity.vo.IoTDeviceGeoFenceVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 设备围栏表 *
 *
 *  8:54
 */
public interface IoTDeviceGeoFenceMapper extends BaseMapper<IoTDeviceGeoFence> {

  List<IoTDeviceGeoFence> selectByIotId(
      @Param("iotId") String iotId, @Param("appUnionId") String appUnionId);

  List<IoTDeviceGeoFenceVO> selectList(
      @Param("ioTDeviceGeoFence") IoTDeviceGeoFence ioTDeviceGeoFence);

  int updateFence(@Param("ioTDeviceGeoFence") IoTDeviceGeoFence ioTDeviceGeoFence);
}
