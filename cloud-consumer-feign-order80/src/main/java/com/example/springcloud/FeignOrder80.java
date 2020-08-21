package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Administrator
 * @title: Order80
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 16:11
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrder80 {


    public static void main(String[] args) {
        SpringApplication.run(FeignOrder80.class,args);
    }
}
