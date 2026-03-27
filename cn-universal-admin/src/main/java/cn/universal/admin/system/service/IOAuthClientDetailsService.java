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

package cn.universal.admin.system.service;

import cn.universal.persistence.entity.OAuth2ClientDetails;

/** OAuth2 */
public interface IOAuthClientDetailsService {

  int insert(OAuth2ClientDetails OAuth2ClientDetails);

  int updateSecret(OAuth2ClientDetails OAuth2ClientDetails);

  int deleteByClientIds(String[] ids);
}
