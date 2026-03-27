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

package cn.universal.persistence.shadow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 设备影子
 *
 * *
 * 
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Shadow {

  /** 状态 */
  private State state;

  private State metadata;

  private Long timestamp;

  private Long version;
}
