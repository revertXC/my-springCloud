package com.revert.eurekaSlave.slave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * xiecong
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSlaveApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSlaveApplication.class, args);
    }
}
