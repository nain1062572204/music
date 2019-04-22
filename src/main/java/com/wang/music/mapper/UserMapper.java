package com.wang.music.mapper;

import com.wang.music.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 王念
 * @create 2019-04-19 23:34
 */
@Repository
public interface UserMapper {
    //根据ID查询用户
    User queryUserByUserId(Integer userId);
}
