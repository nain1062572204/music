package com.wang.music.service.impl;

import com.wang.music.entity.Access;
import com.wang.music.mapper.AccessMapper;
import com.wang.music.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王念
 * @create 2019-04-21 14:49
 */
@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    private AccessMapper accessMapper;
    @Override
    public void addAccess(Access access) {
        accessMapper.addAccess(access);
    }
}
