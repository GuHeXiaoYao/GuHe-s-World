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

package cn.universal.admin.common.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.universal.common.constant.Constants;
import cn.universal.persistence.entity.admin.SysDictData;
import java.util.List;

/** 字典工具类 */
public class DictUtils {

  /** 分隔符 */
  public static final String SEPARATOR = ",";

  /**
   * 设置字典缓存
   *
   * @param key 参数键
   * @param dictDatas 字典数据列表
   */
  public static void setDictCache(String key, List<SysDictData> dictDatas) {
    //    SpringUtils.getBean(RedisCache.class).setCacheObject(getCacheKey(key), dictDatas);
  }

  /**
   * 获取字典缓存
   *
   * @param key 参数键
   * @return dictDatas 字典数据列表
   */
  public static List<SysDictData> getDictCache(String key) {
    //    Object cacheObj = SpringUtils.getBean(RedisCache.class).getCacheObject(getCacheKey(key));
    //    if (Validator.isNotNull(cacheObj)) {
    //      List<SysDictData> dictDatas = (List<SysDictData>) cacheObj;
    //      return dictDatas;
    //    }
    return null;
  }

  /**
   * 根据字典类型和字典值获取字典标签
   *
   * @param dictType 字典类型
   * @param dictValue 字典值
   * @return 字典标签
   */
  public static String getDictLabel(String dictType, String dictValue) {
    return getDictLabel(dictType, dictValue, SEPARATOR);
  }

  /**
   * 根据字典类型和字典标签获取字典值
   *
   * @param dictType 字典类型
   * @param dictLabel 字典标签
   * @return 字典值
   */
  public static String getDictValue(String dictType, String dictLabel) {
    return getDictValue(dictType, dictLabel, SEPARATOR);
  }

  /**
   * 根据字典类型和字典值获取字典标签
   *
   * @param dictType 字典类型
   * @param dictValue 字典值
   * @param separator 分隔符
   * @return 字典标签
   */
  public static String getDictLabel(String dictType, String dictValue, String separator) {
    StringBuilder propertyString = new StringBuilder();
    List<SysDictData> datas = getDictCache(dictType);

    if (StrUtil.containsAny(dictValue, separator) && CollUtil.isNotEmpty(datas)) {
      for (SysDictData dict : datas) {
        for (String value : dictValue.split(separator)) {
          if (value.equals(dict.getDictValue())) {
            propertyString.append(dict.getDictLabel() + separator);
            break;
          }
        }
      }
    } else {
      for (SysDictData dict : datas) {
        if (dictValue.equals(dict.getDictValue())) {
          return dict.getDictLabel();
        }
      }
    }
    return StrUtil.strip(propertyString.toString(), null, separator);
  }

  /**
   * 根据字典类型和字典标签获取字典值
   *
   * @param dictType 字典类型
   * @param dictLabel 字典标签
   * @param separator 分隔符
   * @return 字典值
   */
  public static String getDictValue(String dictType, String dictLabel, String separator) {
    StringBuilder propertyString = new StringBuilder();
    List<SysDictData> datas = getDictCache(dictType);

    if (StrUtil.containsAny(dictLabel, separator) && CollUtil.isNotEmpty(datas)) {
      for (SysDictData dict : datas) {
        for (String label : dictLabel.split(separator)) {
          if (label.equals(dict.getDictLabel())) {
            propertyString.append(dict.getDictValue() + separator);
            break;
          }
        }
      }
    } else {
      for (SysDictData dict : datas) {
        if (dictLabel.equals(dict.getDictLabel())) {
          return dict.getDictValue();
        }
      }
    }
    return StrUtil.strip(propertyString.toString(), null, separator);
  }

  /**
   * 删除指定字典缓存
   *
   * @param key 字典键
   */
  public static void removeDictCache(String key) {
    //    SpringUtils.getBean(RedisCache.class).deleteObject(getCacheKey(key));
  }

  /** 清空字典缓存 */
  public static void clearDictCache() {
    //    Collection<String> keys = SpringUtils.getBean(RedisCache.class)
    //        .keys(Constants.SYS_DICT_KEY + "*");
    //    SpringUtils.getBean(RedisCache.class).deleteObject(keys);
  }

  /**
   * 设置cache key
   *
   * @param configKey 参数键
   * @return 缓存键key
   */
  public static String getCacheKey(String configKey) {
    return Constants.SYS_DICT_KEY + configKey;
  }
}
