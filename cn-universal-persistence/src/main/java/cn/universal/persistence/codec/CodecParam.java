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

package cn.universal.persistence.codec;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 请求参数实体 *
 *
 *  9:10
 */
@Data
@AllArgsConstructor
public class CodecParam {

  /** 唯一编号 */
  private String codeKey;

  /** 编解码内容 */
  private Object codeBody;
}
