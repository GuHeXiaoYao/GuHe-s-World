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

package cn.universal.databridge.plugin;

/**
 * 双向数据插件接口 - 同时支持输入和输出
 *
 * @version 2.0 *
 * 
 */
public interface BidirectionalDataPlugin extends DataOutputPlugin, DataInputPlugin {
  // 双向插件同时继承输入和输出接口
}
