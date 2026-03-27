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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 推送第三方配置 *
 *
 *  16:25
 */
@Schema
@Data
public class RuleTarget {

  @Schema(description = "推送id")
  private String id;

  @Schema(description = "推送类型")
  private String type;

  @Schema(description = "请求地址")
  private String url;
}
