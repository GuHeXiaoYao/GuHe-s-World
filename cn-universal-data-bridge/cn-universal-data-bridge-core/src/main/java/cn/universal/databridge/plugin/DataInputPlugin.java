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

import cn.universal.databridge.entity.DataBridgeConfig;
import cn.universal.databridge.entity.ResourceConnection;
import java.util.List;

/**
 * 数据输入插件接口 - 输入方向 (外部系统 -> IoT)
 *
 * @version 2.0 *
 * 
 */
public interface DataInputPlugin extends DataBridgePlugin {

  /** 批量处理数据输入 - 输入方向 (外部系统 -> IoT) */
  void batchProcessInput(
      List<Object> externalDataList, DataBridgeConfig config, ResourceConnection connection);
}
