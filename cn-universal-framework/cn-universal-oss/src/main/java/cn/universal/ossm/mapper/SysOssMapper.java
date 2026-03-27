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

package cn.universal.ossm.mapper;

import cn.universal.ossm.entity.SysOss;
import cn.universal.persistence.common.BaseMapper;
import java.util.Collection;
import java.util.List;

/** 文件上传 数据层 @Author Lion Li */
public interface SysOssMapper extends BaseMapper<SysOss> {

  List<SysOss> listByIds(Collection<Long> ids);

  List<SysOss> listByUrls(String[] urls);

  int removeByIds(Collection<Long> ids);

  int removeByUrls(String[] ids);
}
