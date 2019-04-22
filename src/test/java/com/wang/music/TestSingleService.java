package com.wang.music;

import com.wang.music.entity.Single;
import com.wang.music.service.SingleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 23:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSingleService {
    @Autowired
    private SingleService singleService;
    @Test
    public void testQuerySingleByPlaylistId(){
        List<Single> singles=singleService.querySingleByPlaylistId(2);
        for (Single single : singles) {
            System.out.println(single.toString());
            System.out.println(single.getAlbum().toString());
        }
    }
}
