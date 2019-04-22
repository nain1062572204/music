package com.wang.music.entity;

import java.io.Serializable;

/**
 * @author 王念
 * @create 2019-04-19 19:05
 */
public class Single implements Serializable {
    private static final long serialVersionUID = 1115128284217444272L;

    private Integer singleId;
    private String singleName;
    private String singer;
    private String url;
    private Album album;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getSingleId() {
        return singleId;
    }

    public void setSingleId(Integer singleId) {
        this.singleId = singleId;
    }

    public String getSingleName() {
        return singleName;
    }

    public void setSingleName(String singleName) {
        this.singleName = singleName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Single{" +
                "singleId=" + singleId +
                ", singleName='" + singleName + '\'' +
                ", singer='" + singer + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
