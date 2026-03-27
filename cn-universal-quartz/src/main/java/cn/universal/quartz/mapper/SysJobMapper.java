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

package cn.universal.quartz.mapper;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.quartz.domain.SysJob;

/** 调度任务信息 数据层 @Author ruoyi */
public interface SysJobMapper extends BaseMapper<SysJob> {

  int insertJob(SysJob sysJob);
}
