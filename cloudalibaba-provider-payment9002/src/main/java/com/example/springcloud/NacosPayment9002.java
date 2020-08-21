package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @title: Payment9001
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/13 16:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPayment9002.class,args);
    }
}
