package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @title: GateWay9270
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/7 20:34
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay9270 {

    public static void main(String[] args) {
        SpringApplication.run(GateWay9270.class,args);
    }
}
