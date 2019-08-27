package com.revert.eurekaServer.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * xiecong
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMasterApplication.class, args);
    }
}
