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

package cn.universal.core.protocol.support;

import cn.universal.core.protocol.support.ProtocolCodecSupport.CodecMethod;
import java.util.Map;
import java.util.Set;
import lombok.Data;

/**
 * *
 * 
 *  19:11
 */
@Data
public class ProtocolSupportDefinition {

  private String id;
  private String name;
  private String description;
  private String provider;
  private String type;
  private byte state;
  private Map<String, Object> configuration;
  private Set<String> supportMethods;

  public boolean supportMethod(CodecMethod method) {
    if (supportMethods == null) {
      return false;
    }
    if (supportMethods.contains(method.name())) {
      return true;
    }
    return false;
  }
}
