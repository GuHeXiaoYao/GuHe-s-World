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

package cn.universal.persistence.entity;

import cn.universal.persistence.common.inteceptor.SQenGenId;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

/**
 * 规则实例 *
 *
 *  14:28
 */
@Table(name = "rule_model_instance")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RuleModelInstance implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 主键ID */
  @Id
  @KeySql(genId = SQenGenId.class)
  private Long id;

  /** 模型id */
  @Column(name = "model_id")
  private Long modelId;

  /** 关联类型 */
  @Column(name = "relation_type")
  private String relationType;

  /** 关联id */
  @Column(name = "relation_id")
  private String relationId;
}
