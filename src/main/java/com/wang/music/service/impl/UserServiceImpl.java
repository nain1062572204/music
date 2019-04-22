package com.wang.music.service.impl;

import com.wang.music.entity.User;
import com.wang.music.mapper.UserMapper;
import com.wang.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王念
 * @create 2019-04-19 23:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUserByUserId(Integer userId) {
        return userMapper.queryUserByUserId(userId);
    }
}
