package com.wang.music.controller;

import com.wang.music.entity.Playlist;
import com.wang.music.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * @author 王念
 * @create 2019-04-20 13:04
 */
@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    //注入服务
    @Autowired
    private PlaylistService playlistService;
    @RequestMapping("/recommend")
    public Set<Playlist> recommend(){
        return playlistService.queryRecommened();
    }
    @RequestMapping("/playlist")
    public Playlist playlist(){
        return playlistService.queryAllPlaylist().get(5);
    }
}
