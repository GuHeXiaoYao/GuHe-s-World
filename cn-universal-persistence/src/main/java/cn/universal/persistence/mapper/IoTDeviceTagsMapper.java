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
import cn.universal.persistence.entity.IoTDeviceTags;
import java.util.List;

public interface IoTDeviceTagsMapper extends BaseMapper<IoTDeviceTags> {

  /**
   * 根据分组id查询设备id集合
   *
   * @param groupId
   * @return
   */
  int selectDevIds(String groupId);

  int deleteByValueId(String groupId);

  IoTDeviceTags getOne(String iotId);

  List<String> selectDevGroupName(String iotId);
}
