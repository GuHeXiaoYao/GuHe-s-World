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

package cn.universal.persistence.entity.admin.vo;

import cn.universal.persistence.entity.admin.SysDictData;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 字典类型group分组 @Author ruoyi */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDictDataVos implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;
  private String name;
  private List<SysDictData> array;
}
