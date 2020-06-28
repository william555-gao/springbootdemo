package com.springbootdemo.entity;

import java.io.Serializable;

public class CjyMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer menuId;
    private Integer menuLevel;
    private String menuName;
    private String menuParent;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuParent() {
        return menuParent;
    }

    public void setMenuParent(String menuParent) {
        this.menuParent = menuParent == null ? null : menuParent.trim();
    }
}