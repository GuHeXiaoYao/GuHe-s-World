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

package cn.wvp.protocol.config;

import cn.universal.core.protocol.ProtocolModuleInfo;
import org.springframework.stereotype.Component;

/**
 * WVP协议模块信息
 *
 * @version 2.0
 * *
 * 
 */
@Component
public class WvpModuleInfo implements ProtocolModuleInfo {

  @Override
  public String getCode() {
    return "wvp";
  }

  @Override
  public String getName() {
    return "WVP国标视频平台";
  }

  @Override
  public String getVersion() {
    return "2.0";
  }

  @Override
  public String getDescription() {
    return "WVP(Web Video Platform)国标视频平台协议适配器";
  }

  @Override
  public ProtocolCategory getCategory() {
    return ProtocolCategory.PLATFORM;
  }

  @Override
  public boolean isManualCreatable() {
    return false;
  }

  @Override
  public String getNotCreatableReason() {
    return "视频平台产品采用懒创建策略，请在视频中心中勾选设备时自动创建";
  }
}
