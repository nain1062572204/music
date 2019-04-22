package com.wang.music;

import com.wang.music.entity.Access;
import com.wang.music.service.AccessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author 王念
 * @create 2019-04-21 14:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAccessService {
    @Autowired
    private AccessService accessService;

    @Test
    public void testAddAccess(){
        Access access=new Access();
        access.setIp("129.201.251");
        access.setTime(new Date());
        accessService.addAccess(access);
    }
}
