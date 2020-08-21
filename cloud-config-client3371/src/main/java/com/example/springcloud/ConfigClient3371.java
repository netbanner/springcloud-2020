package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author EiletXie
 * @Since 2020/3/13 15:06
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3371 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3371.class,args);
    }
}
