package com.wang.music.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 19:14
 */
public class SingleAndPlaylist implements Serializable {
    private static final long serialVersionUID = 4143013113870034993L;

    private Integer id;
    private List<Single> silges;
    private Integer playlistId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Single> getSilges() {
        return silges;
    }

    public void setSilges(List<Single> silges) {
        this.silges = silges;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }
}
