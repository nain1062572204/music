package com.wang.music.entity;


import java.io.Serializable;
import java.util.List;

/**
 * @author 王念
 * @create 2019-04-19 19:45
 */
public class Collect implements Serializable {
    private static final long serialVersionUID = -8626844603171142609L;

    private Integer collectId;
    private User user;
    private List<Single> singles;
    private List<Playlist> playlists;
    private List<Album> albums;
}
