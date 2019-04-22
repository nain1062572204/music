package com.wang.music.mapper;

import com.wang.music.entity.Playlist;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 18:52
 */
@Repository
public interface PlaylistMapper {
    //查询所有歌单
    List<Playlist> queryAllPlayList();
    //添加一个歌单
    void addPlaylist(Playlist playlist);
    //根据ID删除歌单
    void deletePlaylist(Integer playlistId);
    //修改歌单
    void updatePlaylist(Playlist playlist);

}
