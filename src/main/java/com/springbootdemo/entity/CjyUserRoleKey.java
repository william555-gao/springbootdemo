package com.springbootdemo.entity;

import java.io.Serializable;

public class CjyUserRoleKey implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}