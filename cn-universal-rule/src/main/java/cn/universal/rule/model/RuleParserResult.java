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

package cn.universal.rule.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * todo *
 *
 *  9:02
 */
@Data
public class RuleParserResult {

  private List<RuleField> fields;

  private List<String> topics;

  private String condition;

  @Data
  @AllArgsConstructor
  public static class RuleField {

    private String name;
    private String alias;
  }
}
