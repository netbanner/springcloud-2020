package com.example.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Administrator
 * @title: LoadBalancer
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/5 19:24
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> services);
}
