package com.example.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @title: MySelfRule
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/5 18:17
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule rule(){
        //随机算法
        return new RandomRule();
    }
}
