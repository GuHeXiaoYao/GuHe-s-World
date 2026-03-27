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

package cn.universal.persistence.entity.admin;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/** 用户和角色关联 sys_user_role @Author ruoyi */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@Table(name = "sys_user_role")
public class SysUserRole implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id private Long uuid;

  /** 用户ID */
  private String unionId;

  /** 角色ID */
  private Long roleId;
}
