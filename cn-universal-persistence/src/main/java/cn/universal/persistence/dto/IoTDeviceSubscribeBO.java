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
public class IoTDeviceSubscribeBO {

  private String msgType;
  private String url;
  private String topic;
}
