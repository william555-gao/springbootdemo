package com.springbootdemo.entity;

import java.io.Serializable;

public class CjyAuthority implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer authorityId;
    private Integer authorityLevel;
    private String authorityName;
    private String authorityContent;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public Integer getAuthorityLevel() {
        return authorityLevel;
    }

    public void setAuthorityLevel(Integer authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityContent() {
        return authorityContent;
    }

    public void setAuthorityContent(String authorityContent) {
        this.authorityContent = authorityContent == null ? null : authorityContent.trim();
    }
}