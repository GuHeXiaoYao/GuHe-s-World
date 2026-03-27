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

package cn.universal.rule.engine;

import cn.hutool.json.JSONObject;

/**
 * todo *
 *
 *  9:36
 */
public interface RuleEngine {

  JSONObject executeRule(JSONObject param, String modelDefineString, String appId);
}
