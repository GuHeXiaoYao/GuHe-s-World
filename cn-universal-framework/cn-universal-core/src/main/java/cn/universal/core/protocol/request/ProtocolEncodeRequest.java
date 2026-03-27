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

package cn.universal.core.protocol.request;

import cn.universal.core.protocol.support.ProtocolSupportDefinition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *
 * 
 *  21:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProtocolEncodeRequest {

  private ProtocolSupportDefinition definition;
  private String payload;
  private Object context;

  public ProtocolEncodeRequest(ProtocolSupportDefinition definition, String payload) {
    this.definition = definition;
    this.payload = payload;
  }
}
