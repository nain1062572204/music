package com.wang.music.service;

import com.wang.music.entity.Single;

import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 23:19
 */
public interface SingleService {
    //根据歌单查询单曲
    List<Single> querySingleByPlaylistId(Integer playlistId);
}
