package com.revert.configServer.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * xiecong
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigServerMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerMasterApplication.class, args);
    }

}
