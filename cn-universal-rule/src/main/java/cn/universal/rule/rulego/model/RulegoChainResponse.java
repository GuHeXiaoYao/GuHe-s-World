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
 * rulego规则链响应
 *
 * *
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RulegoChainResponse {

  /** 是否成功 */
  private boolean success;

  /** 响应消息 */
  private String message;

  /** 响应代码 */
  private String code;

  /** 响应数据 */
  private RulegoChainInfo data;
}
