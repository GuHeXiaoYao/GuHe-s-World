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

package cn.universal.persistence.query;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 网络组件查询对象
 *
 * *
 * 
 * 
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NetworkQuery extends BasePage {

  /** 网络类型（单个类型） */
  private String type;

  /** 网络类型列表（多个类型） */
  private List<String> types;

  /** 网络组件名称 */
  private String name;

  /** 产品Key */
  private String productKey;

  /** 状态 */
  private Boolean state;

  /** 唯一标识 */
  private String unionId;

  /** 创建用户 */
  private String createUser;
}
