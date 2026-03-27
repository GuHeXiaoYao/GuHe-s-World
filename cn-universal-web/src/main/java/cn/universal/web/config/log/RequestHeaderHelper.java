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

package cn.universal.web.config.log;

import java.util.HashSet;
import java.util.Set;

/**
 * *
 * 
 * 
 */
public class RequestHeaderHelper {

  public static final String AUTHORIZATION = "Authorization";

  public static final Set<String> headers = new HashSet<>();

  static {
    headers.add(AUTHORIZATION);
    headers.add(AUTHORIZATION.toLowerCase());
  }

  public static boolean matchHeader(String key) {
    return headers.contains(key.toLowerCase());
  }
}
