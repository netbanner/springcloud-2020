package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: NacosConfig3372
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/13 17:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfig3372 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3372.class,args);
    }
}
