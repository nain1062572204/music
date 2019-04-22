package com.wang.music.mapper;

import com.wang.music.entity.Access;
import org.springframework.stereotype.Repository;

/**
 * @author 王念
 * @create 2019-04-21 14:44
 */
@Repository
public interface AccessMapper {
    //增加一个访问记录
    void addAccess(Access access);
}
