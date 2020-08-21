package com.example.springcloud.controller;

import com.example.springcloud.lb.LoadBalancer;
import com.example.springcloud.entity.CommonResult;
import com.example.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author Administrator
 * @title: OrderController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 16:15
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {


   //private static final String PAYMENT_URL = "http://127.0.0.1:8001";
   public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

   @Resource
   private RestTemplate restTemplate;

   @Resource
   private DiscoveryClient discoveryClient;

   @Resource
   private LoadBalancer loadBalancer;


   @GetMapping("/payment/create")
   public CommonResult<Payment> create(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
   }

    @GetMapping("/payment/get/{id}")
   public CommonResult<Payment> get(@PathVariable("id") Long id){
       return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
   }


   @GetMapping("discovery")
   public Object discovery(){
       //获取服务列表
       List<String> services = discoveryClient.getServices();

       for(String string :services){
           log.info("----------"+string+"--------");
       }

       //获取具体服务实例
       List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
       for(ServiceInstance instance : instances){
           log.info(instance.getServiceId()+"/t"+instance.getHost()+"/t"+instance.getPort()+"/t"+instance.getUri());
       }
       return this.discoveryClient;
   }

   @GetMapping("/lb")
   public String getPaymentLb(){

       List<ServiceInstance> serviceInstances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
       if(serviceInstances == null || serviceInstances.size() <= 0){
           return null;
       }
       ServiceInstance instance = loadBalancer.instance(serviceInstances);
       URI url = instance.getUri();
       return restTemplate.getForObject(url+"/payment/lb",String.class);
   }

   @GetMapping("/zipkin")
   public String zipkin(){
       return restTemplate.getForObject(PAYMENT_URL+"/payment/zipkin",String.class);
   }
}
