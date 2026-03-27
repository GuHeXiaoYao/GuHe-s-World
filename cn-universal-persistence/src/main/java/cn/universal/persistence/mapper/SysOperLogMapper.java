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
import cn.universal.persistence.entity.SysOperLog;
import java.util.List;

/** 系统访问日志情况信息 数据层 @Author ruoyi */
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {

  List<SysOperLog> selectList(SysOperLog sysOperLog);
}
