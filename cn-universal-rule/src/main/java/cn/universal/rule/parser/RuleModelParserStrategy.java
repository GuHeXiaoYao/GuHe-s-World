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

package cn.universal.rule.parser;

import cn.universal.rule.enums.ParserFormat;
import cn.universal.rule.model.RuleParserResult;

/**
 * 模型解析器策略 *
 *
 *  9:07
 */
public interface RuleModelParserStrategy {

  ParserFormat getFormat();

  RuleParserResult parse(String modelDefineString);
}
