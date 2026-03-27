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

package cn.universal.persistence.common;

import java.io.Serializable;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/** tk.mybatis */
public interface BaseMapper<T extends Serializable>
    extends Mapper<T>, MySqlMapper<T>, ConditionMapper<T>, IdsMapper<T> {}
