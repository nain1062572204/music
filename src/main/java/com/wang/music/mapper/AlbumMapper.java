package com.wang.music.mapper;

import com.wang.music.entity.Album;
import org.springframework.stereotype.Repository;

/**
 * @author 王念
 * @create 2019-04-19 22:48
 */
@Repository
public interface AlbumMapper {
    //根据歌曲查专辑
    Album queryAlbumBySingleId(Integer singleId);
}
