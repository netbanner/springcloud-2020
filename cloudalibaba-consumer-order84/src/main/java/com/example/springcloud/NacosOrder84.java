package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: Order84
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/13 16:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrder84 {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrder84.class,args);
    }
}
