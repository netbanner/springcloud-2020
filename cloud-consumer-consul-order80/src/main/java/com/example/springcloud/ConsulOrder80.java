package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Administrator
 * @title: Order80
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 16:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {


    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class,args);
    }
}
