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

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DownResult {

  private Boolean success;
  private Object downResult;
}
