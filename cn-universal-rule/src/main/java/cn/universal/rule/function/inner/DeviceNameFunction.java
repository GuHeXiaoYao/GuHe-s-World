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
import cn.universal.rule.utils.ThreadLocalUtils;
import org.springframework.stereotype.Component;

/**
 * todo *
 *
 *  13:58
 */
@Component
public class DeviceNameFunction implements RuleFunction {

  @Override
  public String functionName() {
    return "deviceName";
  }

  @Override
  public Object executeFunction(Object[] param) {
    return ThreadLocalUtils.get("deviceName");
  }
}
