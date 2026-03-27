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

package cn.universal.rule.transmit;

import cn.hutool.json.JSONObject;
import cn.universal.rule.model.RuleTarget;

/**
 * 规则转发 *
 *
 *  16:29
 */
public interface RuleTransmit {

  /**
   * 获取转发类型
   *
   * @return 类型
   */
  String type();

  /**
   * 数据转发
   *
   * @param data 数据
   * @param target 转发目标
   */
  String transmit(JSONObject data, RuleTarget target);

  /**
   * 测试数据转发
   *
   * @param data 数据
   * @param target 转发目标
   */
  String testTransmit(JSONObject data, RuleTarget target);
}
