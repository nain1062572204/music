package com.wang.music.service.impl;

import com.wang.music.entity.Single;
import com.wang.music.mapper.SingleMapper;
import com.wang.music.service.SingleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 23:20
 */
@Service
public class SingleSeriveImpl implements SingleService {
    @Autowired
    private SingleMapper singleMapper;
    @Override
    public List<Single> querySingleByPlaylistId(Integer playlistId) {
        return singleMapper.querySingleByPlaylistId(playlistId);
    }
}
