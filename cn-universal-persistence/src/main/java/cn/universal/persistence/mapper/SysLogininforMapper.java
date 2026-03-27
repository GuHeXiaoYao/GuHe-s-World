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
import cn.universal.persistence.entity.SysLogininfor;
import java.util.List;

/** 系统访问日志情况信息 数据层 @Author ruoyi */
public interface SysLogininforMapper extends BaseMapper<SysLogininfor> {

  List<SysLogininfor> selectList(SysLogininfor sysLogininfor);
}
