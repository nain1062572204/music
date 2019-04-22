package com.wang.music.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王念
 * @create 2019-04-20 13:41
 */
/*@Configuration*/
public class CustomerMapper extends ObjectMapper {
    public CustomerMapper(){
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);//返回为null的值则去除，
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);//解决延迟加载的对象
    }
}
