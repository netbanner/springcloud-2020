package com.example.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: zkPayment8004
 * @projectName spring-cloud-2020
 * @description: zookeeper注入
 * @date 2020/8/4 20:21
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class zkPayment8004 {

    public static void main(String[] args) {
        SpringApplication.run(zkPayment8004.class,args);
    }
}
