package com.wang.music.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 王念
 * @create 2019-04-19 19:03
 */
public class Album implements Serializable {
    private static final long serialVersionUID = -984073921117625799L;
    private Integer albumId;
    private String albumName;
    private String singer;
    private Date issueDate;
    private String cover;


    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", albumName='" + albumName + '\'' +
                ", singer='" + singer + '\'' +
                ", issueDate=" + issueDate +
                ", cover='" + cover + '\'' +
                '}';
    }
}
