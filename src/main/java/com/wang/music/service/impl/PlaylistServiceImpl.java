package com.wang.music.service.impl;

import com.wang.music.entity.Playlist;
import com.wang.music.mapper.PlaylistMapper;
import com.wang.music.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 王念
 * @create 2019-04-19 20:12
 */
@Service
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    private PlaylistMapper playlistMapper;

    @Override
    public void addPlaylist(Playlist playlist) {
        playlistMapper.addPlaylist(playlist);
    }

    @Override
    public List<Playlist> queryAllPlaylist() {
        return playlistMapper.queryAllPlayList();
    }

    @Override
    public Set<Playlist> queryRecommened() {
        //随机数推荐
        List<Playlist> playlists=playlistMapper.queryAllPlayList();
        Set<Playlist> pSet=new HashSet<>();
        Random random=new Random();
        while (pSet.size()!=6){
            pSet.add(playlists.get(random.nextInt(playlists.size()-1)));
        }
        return pSet;
    }
}
