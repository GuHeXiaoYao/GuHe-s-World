
package cn.universal.dm.video;

import cn.universal.persistence.entity.VideoPlatformInstance;

/** 视频实例 */
public interface VideoPlatformInstanceAdapter {

  VideoPlatformInstance getVideoPlatformInstance(String instanceKey);
}
