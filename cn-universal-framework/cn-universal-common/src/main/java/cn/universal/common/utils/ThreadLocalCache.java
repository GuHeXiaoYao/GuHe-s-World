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

package cn.universal.common.utils;

import org.springframework.stereotype.Component;

@Component
public class ThreadLocalCache {

  public static ThreadLocal<String> localExtDeviceId = new ThreadLocal<String>();
}
