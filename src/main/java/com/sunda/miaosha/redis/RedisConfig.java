package com.sunda.miaosha.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by 老蹄子 on 2019/4/19 下午4:00
 */

@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix="spring.redis")
@Component
@Data
public class RedisConfig {

    private String host;
    private int port;

}
