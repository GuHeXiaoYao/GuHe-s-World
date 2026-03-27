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

package cn.universal.persistence.entity.vo;

import cn.universal.persistence.entity.IoTProduct;
import lombok.Data;

/**
 * *
 * 
 * 
 */
@Data
public class IoTProductVO extends IoTProduct {

  private String image;
  private int powerModel;
  private String lwm2mEdrxTime;


  private int devNum;

  private String storePolicy;
  private String type;
  private String gwName;
  private String gwPhotoUrl;
}
