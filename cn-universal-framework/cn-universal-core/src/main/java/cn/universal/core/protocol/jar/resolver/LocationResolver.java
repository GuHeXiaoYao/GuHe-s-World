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

package cn.universal.core.protocol.jar.resolver;

import cn.universal.common.exception.CodecException;

/**
 * Location 解析器接口
 * 用于识别和处理不同类型的 location
 *
 * *
 * 
 * 
 */
public interface LocationResolver {
    /**
     * 判断是否支持该 location
     *
     * @param location location 值
     * @return 是否支持
     */
    boolean supports(String location);

    /**
     * 解析 location，返回实际的编解码器实例
     *
     * @param location location 值
     * @param provider provider 类名
     * @return 编解码器实例，如果无法解析返回 null
     * @throws CodecException 解析异常
     */
    Object resolve(String location, String provider) throws CodecException;
}

