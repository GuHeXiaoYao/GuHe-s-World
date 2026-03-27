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

import cn.universal.core.message.UPRequest;
import cn.universal.persistence.dto.IoTDeviceDTO;
import cn.universal.persistence.entity.IoTProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * *
 * 
 * 
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class BaseUPRequest extends UPRequest {

  private transient IoTDeviceDTO ioTDeviceDTO;

  private transient IoTProduct ioTProduct;

  /** 指令 */
  private String commandId;

  /** 指令 */
  private Integer commandStatus;
}
