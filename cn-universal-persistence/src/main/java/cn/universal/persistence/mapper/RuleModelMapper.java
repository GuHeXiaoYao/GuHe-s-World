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

package cn.universal.persistence.mapper;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.persistence.entity.RuleModel;
import cn.universal.persistence.entity.bo.RuleModelBO;
import cn.universal.persistence.entity.vo.RuleModelVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 规则模型Mapper *
 *
 *  14:31
 */
public interface RuleModelMapper extends BaseMapper<RuleModel> {

  /**
   * 查询设备相关的规则模型
   *
   * @param ruleModelBo
   * @return
   */
  List<RuleModel> selectRuleByBo(@Param("bo") RuleModelBO ruleModelBo);

  /**
   * 查询规则模型
   *
   * @param ruleModelBo
   * @return
   */
  List<RuleModelVO> selectRuleListByBo(@Param("bo") RuleModelBO ruleModelBo);
}
