package cn.universal.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * EMQX ACL 授权响应 DTO
 *
 * *
 * 
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmqxAclResponse {

  /** 授权结果：allow 或 deny */
  private String result;
}
