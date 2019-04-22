package com.wang.music.service.impl;

import com.wang.music.entity.Album;
import com.wang.music.mapper.AlbumMapper;
import com.wang.music.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王念
 * @create 2019-04-19 23:10
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumMapper albumMapper;
    @Override
    public Album queryAlbumBySingleId(Integer singleId) {
        return albumMapper.queryAlbumBySingleId(singleId);
    }
}
