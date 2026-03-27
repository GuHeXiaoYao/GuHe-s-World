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
import cn.universal.persistence.entity.admin.SysUserRole;

/** 用户与角色关联表 数据层 @Author ruoyi */
// @Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

  public int deleteUserRoleByUserIds(String[] ids);
}
