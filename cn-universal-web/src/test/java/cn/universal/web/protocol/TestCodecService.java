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

package cn.universal.web.protocol;

import org.springframework.stereotype.Service;

/**
 * 测试用的编解码服务 Bean
 * 用于测试 Spring Bean 类型的加载和调用
 *
 * *
 * 
 * 
 */
@Service("testCodecService")
public class TestCodecService {

  /**
   * 解码方法
   *
   * @param payload 原始数据
   * @return 解码后的数据
   */
  public String decode(String payload) {
    return "decoded:" + payload;
  }

  /**
   * 编码方法
   *
   * @param payload 原始数据
   * @return 编码后的数据
   */
  public String encode(String payload) {
    return "encoded:" + payload;
  }

  /**
   * 预解码方法
   *
   * @param payload 原始数据
   * @return 预解码后的数据
   */
  public String preDecode(String payload) {
    return "preDecoded:" + payload;
  }

  /**
   * IoT到第三方转换
   *
   * @param payload 原始数据
   * @return 转换后的数据
   */
  public String iotToYour(String payload) {
    return "iotToYour:" + payload;
  }

  /**
   * 第三方到IoT转换
   *
   * @param payload 原始数据
   * @return 转换后的数据
   */
  public String yourToIot(String payload) {
    return "yourToIot:" + payload;
  }
}

