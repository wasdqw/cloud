package com.iflytek.wj.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("userInfo")
public class UserInfo {
    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
