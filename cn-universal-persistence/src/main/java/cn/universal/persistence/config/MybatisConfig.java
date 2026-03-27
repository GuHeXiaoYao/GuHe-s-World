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

package cn.universal.persistence.config;

import cn.universal.persistence.common.inteceptor.PerformanceInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/** 扫描 */
@Configuration
@MapperScan(value = {"cn.universal.**.mapper"})
public class MybatisConfig {

  @Bean
  Interceptor sqlExplainInterceptor() {
    return new PerformanceInterceptor();
  }
}
