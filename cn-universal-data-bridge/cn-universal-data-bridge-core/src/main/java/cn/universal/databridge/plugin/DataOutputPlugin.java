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
import cn.universal.persistence.base.BaseUPRequest;
import java.util.List;

/**
 * 数据输出插件接口 - 输出方向 (IoT -> 外部系统)
 *
 * @version 2.0 *
 * 
 */
public interface DataOutputPlugin extends DataBridgePlugin {

  /** 批量处理数据输出 - 输出方向 (IoT -> 外部系统) */
  void batchProcessOutput(
      List<BaseUPRequest> requests, DataBridgeConfig config, ResourceConnection connection);
}
