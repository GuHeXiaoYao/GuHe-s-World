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

package cn.universal.http.protocol.config;

import cn.universal.core.protocol.ProtocolModuleInfo;
import org.springframework.stereotype.Component;

/**
 * HTTP 协议模块信息
 *
 * *
 * 
 * 
 */
@Component
public class HttpModuleInfo implements ProtocolModuleInfo {

  @Override
  public String getCode() {
    return "http";
  }

  @Override
  public String getName() {
    return "HTTP";
  }

  @Override
  public String getDescription() {
    return "支持RESTful API和Web服务";
  }

  @Override
  public String getVersion() {
    return "1.0";
  }

  @Override
  public String getVendor() {
    return "Universal IoT";
  }

  @Override
  public boolean isCore() {
    return false; // HTTP是可选协议
  }

  @Override
  public ProtocolCategory getCategory() {
    return ProtocolCategory.APPLICATION;
  }
}
