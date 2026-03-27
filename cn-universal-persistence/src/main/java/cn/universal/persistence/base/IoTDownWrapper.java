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

package cn.universal.persistence.base;

import cn.universal.common.domain.R;
import cn.universal.core.message.DownRequest;
import cn.universal.persistence.entity.IoTDevice;
import cn.universal.persistence.entity.IoTProduct;

/**
 * *
 * 
 * 
 */
public interface IoTDownWrapper {

  /**
   * 用于全局调用的处理
   *
   * @param product
   * @param downRequest
   * @return
   */
  default R beforeDownAction(IoTProduct product, Object data, DownRequest downRequest) {
    return null;
  }

  /**
   * 用于全局调用的处理
   *
   * @param product
   * @param ioTDevice
   * @param downRequest
   * @return
   */
  default R beforeFunctionOrConfigDown(
      IoTProduct product, IoTDevice ioTDevice, DownRequest downRequest) {
    return null;
  }
}
