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
import cn.universal.persistence.entity.SupportMapAreas;
import org.apache.ibatis.annotations.Param;

public interface SupportMapAreasMapper extends BaseMapper<SupportMapAreas> {

  /**
   * 根据经纬度查询区域id
   *
   * @param lon 经度
   * @param lat 维度
   * @return
   */
  SupportMapAreas selectMapAreas(@Param("lon") String lon, @Param("lat") String lat);
}
