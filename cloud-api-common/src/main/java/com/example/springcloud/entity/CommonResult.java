package com.example.springcloud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@ClassName CommonResult
 *@Deacription TODO
 *@Author Administrator
 *@Date 2020/8/2 16:55
 *@Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>  {

    private Integer code;

    private String  message;
    private T       data;

    public CommonResult(Integer code,String message){
       this(code,message,null);
    }

}
