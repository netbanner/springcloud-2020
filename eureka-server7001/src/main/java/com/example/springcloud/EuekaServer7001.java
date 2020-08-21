package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @title: EuekaServer7001
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 16:48
 */
@SpringBootApplication
@EnableEurekaServer
public class EuekaServer7001 {

    public static void main(String[] args) {
        SpringApplication.run(EuekaServer7001.class,args);
    }
}
