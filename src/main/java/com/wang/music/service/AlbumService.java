package com.wang.music.service;

import com.wang.music.entity.Album;

/**
 * @author 王念
 * @create 2019-04-19 23:09
 */
public interface AlbumService {
    //根据单曲查询专辑
    Album queryAlbumBySingleId(Integer singleId);
}
