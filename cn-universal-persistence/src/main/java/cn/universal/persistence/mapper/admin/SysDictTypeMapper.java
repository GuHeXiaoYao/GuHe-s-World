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

package cn.universal.persistence.mapper.admin;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.persistence.entity.admin.SysDictType;
import java.util.List;

/** 字典表 数据层 @Author ruoyi */
public interface SysDictTypeMapper extends BaseMapper<SysDictType> {

  List<SysDictType> selectDictTypeList(SysDictType sysDictType);
}
