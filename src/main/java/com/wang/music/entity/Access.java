package com.wang.music.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 王念
 * @create 2019-04-21 14:33
 */
public class Access implements Serializable {
    private static final long serialVersionUID = 7054771622539943867L;

    private Integer id;
    private String ip;
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Access{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", time=" + time +
                '}';
    }
}
