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

package cn.universal.rocketmq;

import java.util.HashMap;
import java.util.Set;

/**
 * *
 * 
 * 
 */
public interface RocketMQMonitor {

  /**
   * 检查消费组信息
   *
   * @param defaultTopic
   * @return
   */
  HashMap<String, Set<String>> queryDefaultTopicExistConsumer(String defaultTopic);
}
