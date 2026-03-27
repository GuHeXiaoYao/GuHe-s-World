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

package cn.universal.persistence.dto;

import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *
 * 
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LogStorePolicyDTO {
  @Builder.Default private Map<String, StorePolicy> properties = new HashMap<String, StorePolicy>();
  @Builder.Default private Map<String, StorePolicy> event = new HashMap<String, StorePolicy>();

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class StorePolicy {

    /** 属性英文名 */
    private String id;

    /** 最大存储条数 */
    private int maxStorage;
  }
}
