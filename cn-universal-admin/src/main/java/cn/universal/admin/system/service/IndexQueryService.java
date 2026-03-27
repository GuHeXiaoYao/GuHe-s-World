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

package cn.universal.admin.system.service;

import cn.universal.persistence.dto.IndexQueryDTO;

/**
 * 首页统计服务
 *
 *  16:51
 */
public interface IndexQueryService {

  /** 查询首页数量 */
  IndexQueryDTO queryIndexQty(String creator);
}
