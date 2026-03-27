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

package cn.universal.rule.wrapper;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.universal.common.domain.R;
import cn.universal.core.message.DownRequest;
import cn.universal.persistence.base.IoTDownWrapper;
import cn.universal.persistence.entity.IoTDevice;
import cn.universal.persistence.entity.IoTProduct;
import cn.universal.rule.fence.service.FenceService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * *
 * 
 * 
 */
@Service("iotDownRuleService")
public class IoTDownRuleService implements IoTDownWrapper {

  @Resource private FenceService fenceService;

  @Override
  public R beforeFunctionOrConfigDown(
      IoTProduct product, IoTDevice ioTDevice, DownRequest downRequest) {
    // 处理电子围栏
    if (StringUtils.isNotEmpty(product.getConfiguration())) {
      JSONObject jsonObject = JSONUtil.parseObj(product.getConfiguration());
      Boolean isGps = jsonObject.getBool("isGps");
      return isGps != null && isGps
          ? fenceService.callFenceFunction(product, ioTDevice, downRequest)
          : null;
    }
    return null;
  }
}
