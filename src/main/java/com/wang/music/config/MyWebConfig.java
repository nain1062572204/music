package com.wang.music.config;

import com.wang.music.interceptor.AccessInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 王念
 * @create 2019-04-21 14:58
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Autowired
    private AccessInter accessInter;
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(accessInter).addPathPatterns("/**");
    }
}
