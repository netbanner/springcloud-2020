package com.example.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @title: PaymentService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/6 20:43
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池" +Thread.currentThread().getName()+" paymentInfo_OK,id"+id+"\t"+"hello";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMillisecond",value = "3000")
    })
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 5;
        int age = 10/0;

        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;

    }

    private String paymentInfo_TimeoutHandler(Integer id){
        return "调用接口超时 id"+id +"当前线程"+Thread.currentThread().getName();
    }
}
