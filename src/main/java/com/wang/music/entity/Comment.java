package com.wang.music.entity;


import java.io.Serializable;

/**
 * @author 王念
 * @create 2019-04-19 19:43
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -2794915313722463429L;
    private Integer commentId;
    private User user;
    private Single single;
    private String content;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Single getSingle() {
        return single;
    }

    public void setSingle(Single single) {
        this.single = single;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", user=" + user +
                ", single=" + single +
                ", content='" + content + '\'' +
                '}';
    }
}
