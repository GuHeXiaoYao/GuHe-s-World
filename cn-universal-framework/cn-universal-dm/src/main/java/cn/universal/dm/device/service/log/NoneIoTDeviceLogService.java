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

package cn.universal.dm.device.service.log;

import cn.hutool.json.JSONObject;
import cn.universal.persistence.base.BaseUPRequest;
import cn.universal.persistence.dto.IoTDeviceDTO;
import cn.universal.persistence.entity.IoTDeviceEvents;
import cn.universal.persistence.entity.IoTProduct;
import cn.universal.persistence.entity.vo.IoTDeviceLogMetadataVO;
import cn.universal.persistence.entity.vo.IoTDeviceLogVO;
import cn.universal.persistence.query.LogQuery;
import cn.universal.persistence.query.PageBean;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 不存储任何设备日志
 *
 * *
 * 
 *  16:10
 */
@Component
@Slf4j
public class NoneIoTDeviceLogService extends AbstractIoTDeviceLogService {

  private String storePolicy = "none";

  @Override
  public String getPolicy() {
    return storePolicy;
  }

  @Override
  public void saveDeviceLog(
      BaseUPRequest upRequest, IoTDeviceDTO ioTDeviceDTO, IoTProduct ioTProduct) {}

  @Override
  public PageBean<IoTDeviceLogVO> pageList(LogQuery logQuery) {
    return new PageBean(
        new ArrayList(), Long.parseLong(0 + ""), logQuery.getPageSize(), logQuery.getPageNum());
  }

  @Override
  public IoTDeviceLogVO queryById(LogQuery logQuery) {
    return new IoTDeviceLogVO();
  }

  @Override
  public PageBean<IoTDeviceEvents> queryEventTotal(String productKey, String iotId) {
    return new PageBean(new ArrayList(), Long.parseLong(0 + ""), 10, 1);
  }

  @Override
  public PageBean<IoTDeviceLogMetadataVO> queryLogMeta(LogQuery logQuery) {
    return new PageBean(
        new ArrayList(), Long.parseLong(0 + ""), logQuery.getPageSize(), logQuery.getPageNum());
  }

  @Override
  public JSONObject configMetadata() {
    return null;
  }
}
