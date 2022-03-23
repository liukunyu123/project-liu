package com.practise.finance.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Data
@Configuration
@ConfigurationProperties(prefix = "oss")
public class OSSConfig {
    @Value("${oss.address}")
    private String address;

    @Value("${oss.username}")
    private String username;

    @Value("${oss.password}")
    private String password;

    @Value("${oss.bucket}")
    private String bucket;
}
