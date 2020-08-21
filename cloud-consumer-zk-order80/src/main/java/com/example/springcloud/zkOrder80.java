package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @title: zkOrder80
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 20:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class zkOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(zkOrder80.class,args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
