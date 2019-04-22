package com.wang.music;

import com.wang.music.entity.Playlist;
import com.wang.music.entity.User;
import com.wang.music.service.PlaylistService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.plaf.metal.MetalBorders;
import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 20:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPlaylistService {
    @Autowired
    private PlaylistService playlistService;
    @Test
    public void testAddPlaylist(){
        User user=new User();
        user.setUserId(1);
        Playlist playlist=new Playlist(null,"我自横刀向天笑","这是一个歌单","这是封面",new String[]{"民谣","摇滚"},null,null,user);
    }
    @Test
    public void testQueryAllPlaylist(){
        List<Playlist> playlists=playlistService.queryAllPlaylist();
        for (Playlist playlist : playlists) {
            System.out.println(playlist.toString());
        }
    }
}
