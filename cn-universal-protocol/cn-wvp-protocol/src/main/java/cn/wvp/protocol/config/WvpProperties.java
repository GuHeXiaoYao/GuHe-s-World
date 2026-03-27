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

package cn.wvp.protocol.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * WVP 协议配置属性
 *
 * @version 2.0
 * *
 * 
 */
@ConfigurationProperties(prefix = "wvp.protocol")
@Data
public class WvpProperties {

  /** 是否启用WVP协议模块 */
  private boolean enabled = true;
}
