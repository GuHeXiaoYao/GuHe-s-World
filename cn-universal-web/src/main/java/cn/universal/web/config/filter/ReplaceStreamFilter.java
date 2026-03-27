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

package cn.universal.web.config.filter;

import cn.universal.web.config.log.RequestWrapper;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

/**
 * api 拦截器
 *
 * *
 * 
 * 
 */
@Slf4j
public class ReplaceStreamFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    log.info("StreamFilter初始化...");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    ServletRequest requestWrapper = new RequestWrapper((HttpServletRequest) request);
    chain.doFilter(requestWrapper, response);
  }

  @Override
  public void destroy() {
    log.info("StreamFilter销毁...");
  }
}
