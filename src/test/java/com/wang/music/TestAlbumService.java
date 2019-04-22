package com.wang.music;

import com.wang.music.entity.Album;
import com.wang.music.service.AlbumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 王念
 * @create 2019-04-19 23:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlbumService {
    @Autowired
    private AlbumService albumService;
    @Test
    public void testQueryAlbumBySingleId(){
        System.out.println(albumService.queryAlbumBySingleId(1).toString());
    }
}
