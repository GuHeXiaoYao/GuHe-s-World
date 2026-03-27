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

package cn.universal.rule.model.bo;

import cn.universal.rule.model.RuleTarget;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * todo *
 *
 *  15:36
 */
@Data
@Schema
public class RuleTargetTestBO {

  public RuleTarget ruleTarget;

  public String param;
}
