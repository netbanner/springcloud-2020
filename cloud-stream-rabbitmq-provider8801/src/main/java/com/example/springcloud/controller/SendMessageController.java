package com.example.springcloud.controller;

import com.example.springcloud.servcie.MessageProvider;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: SendMessageController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/13 17:35
 */
public class SendMessageController {

    @Resource
    private MessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }

}
