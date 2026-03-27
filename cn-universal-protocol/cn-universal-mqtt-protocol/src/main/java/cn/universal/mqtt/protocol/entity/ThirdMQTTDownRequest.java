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

package cn.universal.mqtt.protocol.entity;

import cn.universal.persistence.base.BaseDownRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * http下行参数
 *
 * *
 * 
 *  11:19
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class ThirdMQTTDownRequest extends BaseDownRequest {

  private String downResult;
}
