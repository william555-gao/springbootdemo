package com.springbootdemo.entity;

import java.io.Serializable;

public class CjyRoleAuthorityKey implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer roleId;
    private Integer authorityId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }
}