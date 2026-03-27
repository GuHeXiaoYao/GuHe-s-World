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

package cn.universal.persistence.dto;

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
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceScanDTO {

  private String productKey;
  private String qrcode;

  public boolean isEmpty() {
    return StrUtil.isEmpty(getProductKey()) || StrUtil.isEmpty(getQrcode());
  }

  @Data
  @Builder
  @AllArgsConstructor
  @NoArgsConstructor
  public static class ResultScanDTO {

    private String imei;
    private String deviceId;
  }
}
