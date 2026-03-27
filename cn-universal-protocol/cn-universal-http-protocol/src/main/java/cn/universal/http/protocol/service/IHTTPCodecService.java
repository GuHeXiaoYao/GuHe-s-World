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

package cn.universal.http.protocol.service;

import cn.universal.core.protocol.support.ProtocolCodecSupport.CodecMethod;

/**
 * HTTP编解码服务接口
 *
 * <p>定义HTTP协议特有的编解码方法
 *
 * *
 * 
 * 
 */
public interface IHTTPCodecService {

  /**
   * HTTP编解码 - 支持统一的CodecMethod
   *
   * @param productKey 产品Key
   * @param payload 原始数据
   * @param codecMethod 编解码方法
   * @return 编解码结果
   */
  String httpCodec(String productKey, String payload, CodecMethod codecMethod);

  /**
   * 检查是否支持HTTP编解码
   *
   * @param productKey 产品Key
   * @return 是否支持
   */
  boolean support(String productKey);
}
