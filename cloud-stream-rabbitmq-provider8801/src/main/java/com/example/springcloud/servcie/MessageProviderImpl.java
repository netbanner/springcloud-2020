package com.example.springcloud.servcie;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Administrator
 * @title: MessageProviderImpl
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/11 17:16
 */

@EnableBinding(value = Source.class)
public class MessageProviderImpl  implements MessageProvider{

    //对应配置文件中通道名称
    @Resource
    private MessageChannel output;



    @Override
    public String send() {
        String serial  = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("--------serial,:"+serial);

        return serial;
    }
}
