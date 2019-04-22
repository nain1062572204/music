package com.wang.music.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 18:56
 * 歌单实体类
 */
public class Playlist implements Serializable {
    private static final long serialVersionUID = -4328192752406578848L;
    private Integer playlistId;
    private String playlistName;
    private String intorduct;
    private String cover;
    private String[] classify;
    private Date createTime;
    private Integer playNumber;
    private User user;
    private List<Single> singles;

    public Playlist() {
    }

    public Playlist(Integer playlistId, String playlistName, String intorduct,
                    String cover, String[] classify, Date createTime, Integer playNumber, User user) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.intorduct = intorduct;
        this.cover = cover;
        this.classify = classify;
        this.createTime = createTime;
        this.playNumber = playNumber;
        this.user = user;
    }

    public List<Single> getSingles() {
        return singles;
    }

    public void setSingles(List<Single> singles) {
        this.singles = singles;
    }

    public Integer getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getIntorduct() {
        return intorduct;
    }

    public void setIntorduct(String intorduct) {
        this.intorduct = intorduct;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String[] getClassify() {
        return classify;
    }

    public void setClassify(String[] classify) {
        this.classify = classify;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPlayNumber() {
        return playNumber;
    }

    public void setPlayNumber(Integer playNumber) {
        this.playNumber = playNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", playlistName='" + playlistName + '\'' +
                ", intorduct='" + intorduct + '\'' +
                ", cover='" + cover + '\'' +
                ", classify=" + Arrays.toString(classify) +
                ", createTime=" + createTime +
                ", playNumber=" + playNumber +
                '}';
    }
}
