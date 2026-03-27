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

package cn.universal.dm.device.service.impl;

import cn.universal.core.protocol.support.ProtocolSupportDefinition;
import cn.universal.core.service.AbstractCodecService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 统一编解码服务实现类
 *
 * *
 * 
 * 
 */
@Slf4j
@Service
public class UniversalCodecServiceImpl extends AbstractCodecService {

  @Autowired private IoTProductDeviceService iotProductDeviceService;

  @Override
  protected ProtocolSupportDefinition getProtocolDefinition(String productKey) {
    return iotProductDeviceService.selectProtocolDef(productKey);
  }

  @Override
  protected ProtocolSupportDefinition getProtocolDefinitionNoScript(String productKey) {
    return iotProductDeviceService.selectProtocolDefNoScript(productKey);
  }

  @Override
  protected ProtocolSupportDefinition getProtocolDefinitionWithScript(String productKey) {
    return iotProductDeviceService.selectProtocolDef(productKey);
  }
}
