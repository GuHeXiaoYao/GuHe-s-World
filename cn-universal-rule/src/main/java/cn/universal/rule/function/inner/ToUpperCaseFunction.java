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

import cn.universal.rule.function.RuleFunction;
import java.util.Locale;
import org.springframework.stereotype.Component;

/**
 * todo *
 *
 *  13:58
 */
@Component
public class ToUpperCaseFunction implements RuleFunction {

  @Override
  public String functionName() {
    return "toUpperCase";
  }

  @Override
  public Object executeFunction(Object[] param) {
    return param[0].toString().toUpperCase(Locale.ROOT);
  }
}
