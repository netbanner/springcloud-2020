package com.example.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *@ClassName Payment
 *@Deacription TODO
 *@Author Administrator
 *@Date 2020/8/2 16:52
 *@Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private long id;

    private String serial;
}
