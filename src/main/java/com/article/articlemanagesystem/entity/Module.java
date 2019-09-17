package com.article.articlemanagesystem.entity;

import java.io.Serializable;

public class Module implements Serializable {
    private Integer id;

    private String name;

    private String brief;

    private String imgcover;

    private Integer usernum;

    private Integer articlenum;

    private String owner;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getImgcover() {
        return imgcover;
    }

    public void setImgcover(String imgcover) {
        this.imgcover = imgcover;
    }

    public Integer getUsernum() {
        return usernum;
    }

    public void setUsernum(Integer usernum) {
        this.usernum = usernum;
    }

    public Integer getArticlenum() {
        return articlenum;
    }

    public void setArticlenum(Integer articlenum) {
        this.articlenum = articlenum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", brief=").append(brief);
        sb.append(", imgcover=").append(imgcover);
        sb.append(", usernum=").append(usernum);
        sb.append(", articlenum=").append(articlenum);
        sb.append(", owner=").append(owner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}