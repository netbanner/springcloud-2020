package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: SentinelService8400
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/14 9:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelService8400 {


    public static void main(String[] args) {
        SpringApplication.run(SentinelService8400.class,args);
    }
}
