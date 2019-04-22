package com.wang.music.service;

import com.wang.music.entity.User;

/**
 * @author 王念
 * @create 2019-04-19 23:38
 */
public interface UserService {
    User queryUserByUserId(Integer userId);
}
