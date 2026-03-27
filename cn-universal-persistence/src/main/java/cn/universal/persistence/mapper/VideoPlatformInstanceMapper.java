/*
 *
 * 
 *
 *   视频平台实例Mapper
 *  *
 *
 */
package cn.universal.persistence.mapper;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.persistence.entity.VideoPlatformInstance;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoPlatformInstanceMapper extends BaseMapper<VideoPlatformInstance> {
  List<VideoPlatformInstance> selectByPlatformType(@Param("platformType") String platformType);
}
