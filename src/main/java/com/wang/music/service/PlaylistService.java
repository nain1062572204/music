package com.wang.music.service;

import com.wang.music.entity.Playlist;

import java.util.List;
import java.util.Set;

/**
 * @author 王念
 * @create 2019-04-19 20:12
 */
public interface PlaylistService {
    void addPlaylist(Playlist playlist);
    List<Playlist> queryAllPlaylist();
    //获取推荐歌单
    Set<Playlist> queryRecommened();
}
