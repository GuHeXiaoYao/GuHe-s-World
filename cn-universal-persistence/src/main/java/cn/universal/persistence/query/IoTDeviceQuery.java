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

package cn.universal.persistence.query;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *
 * 
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IoTDeviceQuery {

  private String iotId;
  private String extDeviceId;
  private String deviceId;
  private String gwProductKey;
  private String productKey;
  private String thirdPlatform;

  public boolean emptyParams() {
    return StrUtil.isBlank(getIotId())
        && StrUtil.isBlank(getExtDeviceId())
        && StrUtil.isBlank(getDeviceId())
        && StrUtil.isBlank(getGwProductKey())
        && StrUtil.isBlank(productKey)
        && StrUtil.isBlank(thirdPlatform);
  }
}
