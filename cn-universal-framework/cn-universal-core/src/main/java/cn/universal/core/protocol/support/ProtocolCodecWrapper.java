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

public interface ProtocolCodecWrapper {

  void load(String provider, Object providerImpl);

  void remove(String provider);
}
