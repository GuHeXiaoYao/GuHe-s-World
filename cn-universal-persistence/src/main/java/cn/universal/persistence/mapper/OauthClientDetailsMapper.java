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

package cn.universal.persistence.mapper;

import cn.universal.persistence.common.BaseMapper;
import cn.universal.persistence.entity.OAuth2ClientDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OauthClientDetailsMapper extends BaseMapper<OAuth2ClientDetails> {

  @Select("SELECT * FROM oauth_client_details WHERE client_id = #{clientId}")
  OAuth2ClientDetails findByClientId(@Param("clientId") String clientId);

  int deleteByClientIds(String[] ids);
}
