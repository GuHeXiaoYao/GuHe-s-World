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

package cn.universal.rule.function.inner;

import cn.hutool.json.JSONUtil;
import cn.universal.rule.function.RuleFunction;
import org.springframework.stereotype.Component;

/**
 * todo *
 *
 *  9:27
 */
@Component
public class ToJsonObjFunction implements RuleFunction {

  @Override
  public String functionName() {
    return "toJsonObj";
  }

  @Override
  public Object executeFunction(Object[] param) {
    return JSONUtil.parseObj(param[0].toString());
  }
}
