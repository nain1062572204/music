package com.wang.music.mapper;

import com.wang.music.entity.Single;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 22:39
 */
@Repository
public interface SingleMapper {
    List<Single> querySingleByPlaylistId(Integer playlistId);
}
