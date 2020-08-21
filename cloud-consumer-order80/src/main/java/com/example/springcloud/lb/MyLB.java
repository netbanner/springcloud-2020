package com.example.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 * @title: MyLB
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/5 19:23
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger  = new AtomicInteger(0);

    private final int getAndIncrement(){
        int current;
        int next;
        //自旋
        do{
            current = this.atomicInteger.get();
            next =current>=Integer.MAX_VALUE?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("****next: "+next);
        return next;
    }


    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
