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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProtocolDecodeRequest {

  private ProtocolSupportDefinition definition;
  // 原始消息
  private String payload;
  // 上下文
  private Object context;

  public ProtocolDecodeRequest(ProtocolSupportDefinition definition, String payload) {
    this.definition = definition;
    this.payload = payload;
  }
}
