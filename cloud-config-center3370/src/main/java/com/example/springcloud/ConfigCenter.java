package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @title: ConfigCenter
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/8 12:57
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenter {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter.class,args);
    }
}
