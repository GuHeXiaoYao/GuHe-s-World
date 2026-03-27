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

package cn.universal.rule.rulego.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rulego简单成功响应
 *
 * *
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RulegoSuccessResponse {

  /** 是否成功 */
  private boolean success = true;

  /** 响应消息 */
  private String message = "操作成功";

  /** 响应代码 */
  private String code = "200";
}
