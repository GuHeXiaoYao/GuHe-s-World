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

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HTTP 协议配置属性
 *
 * *
 * 
 * 
 */
@ConfigurationProperties(prefix = "http.protocol")
@Data
public class HttpProperties {

  /** 是否启用HTTP协议模块 */
  private boolean enabled = true;
}
