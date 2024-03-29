package com.revert.eureka.clientProvider.b;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * xiecong
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderBApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderBApplication.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @GetMapping("/index")
    public String index(){
        return port+" returen data";
    }

}
