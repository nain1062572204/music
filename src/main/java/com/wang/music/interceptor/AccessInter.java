package com.wang.music.interceptor;


import com.wang.music.entity.Access;
import com.wang.music.service.AccessService;
import com.wang.music.util.CuAccessObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author 王念
 * @create 2019-04-21 14:34
 */
@Component
public class AccessInter extends HandlerInterceptorAdapter {
    @Autowired
    private AccessService accessService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Access access=new Access();
        access.setIp(CuAccessObjectUtil.getIpAddress(request));
        System.out.println(access.toString());
        accessService.addAccess(access);
        return true;
    }
}
