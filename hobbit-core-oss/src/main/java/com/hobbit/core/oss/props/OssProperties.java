package com.hobbit.core.oss.props;

import lombok.Data;
import com.hobbit.core.tool.support.Kv;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Minio参数配置类
 *
 * @author Chill
 */
@Data
@ConfigurationProperties(prefix = "oss")
public class OssProperties {

  /**
   * 是否启用
   */
  private Boolean enabled;

  /**
   * 对象存储名称
   */
  private String name;

  /**
   * 是否开启租户模式
   */
  private Boolean tenantMode;

  /**
   * 对象存储服务的URL
   */
  private String endpoint;

  /**
   * Access key就像用户ID，可以唯一标识你的账户
   */
  private String accessKey;

  /**
   * Secret key是你账户的密码
   */
  private String secretKey;

  /**
   * 默认的存储桶名称
   */
  private String bucketName = "bladex";

  /**
   * 自定义属性
   */
  private Kv args;

}
