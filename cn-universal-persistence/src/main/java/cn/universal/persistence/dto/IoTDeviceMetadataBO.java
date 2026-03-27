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

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *
 * 
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IoTDeviceMetadataBO implements Serializable {

  private String companyNo;
  private String creatorId;
  private String orgId;
  private String classifiedId;
  private String transportProtocol;
  private String point;
}
