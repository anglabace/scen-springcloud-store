package com.scen.cache;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 缓存微服务提供者
 *
 * @author Scen
 * @date 2018/5/17 17:16
 */
@SpringBootApplication
@EnableApolloConfig
public class ScenCacheServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScenCacheServiceApplication.class, args);
    }
}
