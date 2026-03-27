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

import cn.universal.common.exception.CodecException;

/**
 * 协议编解码支持
 *
 * *
 * 
 *  19:06
 */
public interface ProtocolCodecLoader {

  /**
   * 协议全路径包名
   *
   * @return
   */
  String getProviderType();

  /**
   * 根据全路径包名加载jar包插件
   *
   * @param definition
   * @return
   */
  default void load(ProtocolSupportDefinition definition) throws CodecException {}
}
