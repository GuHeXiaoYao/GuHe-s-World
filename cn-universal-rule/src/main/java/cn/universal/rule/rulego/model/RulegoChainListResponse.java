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

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rulego规则链列表响应
 *
 * *
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RulegoChainListResponse {

  /** 是否成功 */
  private boolean success;

  /** 响应消息 */
  private String message;

  /** 响应代码 */
  private String code;

  /** 规则链列表 */
  private List<RulegoChainInfo> data;
}
