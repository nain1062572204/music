package com.wang.music.entity;

import java.io.Serializable;

/**
 * @author 王念
 * @create 2019-04-19 19:02
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 8858385979909365806L;

    private Integer adminId;
    private String adminName;
    private String password;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
