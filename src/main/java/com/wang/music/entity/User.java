package com.wang.music.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 王念
 * @create 2019-04-19 14:38
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties({"password"})//不会序列化的属性
public class User implements Serializable {
    private static final long serialVersionUID = 57276740940649759L;

    private Integer userId;
    private String userName;
    private String userSex;
    private String password;
    private String phone;
    private Date regTime;
    private String userPhoto;
    private String signature;
    private Date birthday;

    public User(){}

    public User(Integer userId, String userName, String userSex, String password, String phone, Date regTime, String userPhoto, String signature, Date birthday) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.password = password;
        this.phone = phone;
        this.regTime = regTime;
        this.userPhoto = userPhoto;
        this.signature = signature;
        this.birthday = birthday;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", regTime=" + regTime +
                ", userPhoto='" + userPhoto + '\'' +
                ", signature='" + signature + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
