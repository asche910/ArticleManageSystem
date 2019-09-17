package com.article.articlemanagesystem.entity;

import java.io.Serializable;

public class Comment implements Serializable {
    private Integer id;

    private Long articleid;

    private String time;

    private Integer floor;

    private Integer likenum;

    private Integer parentid;

    private String userauthor;

    private String imgauthor;

    private String nameauthor;

    private String comment;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getUserauthor() {
        return userauthor;
    }

    public void setUserauthor(String userauthor) {
        this.userauthor = userauthor;
    }

    public String getImgauthor() {
        return imgauthor;
    }

    public void setImgauthor(String imgauthor) {
        this.imgauthor = imgauthor;
    }

    public String getNameauthor() {
        return nameauthor;
    }

    public void setNameauthor(String nameauthor) {
        this.nameauthor = nameauthor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleid=").append(articleid);
        sb.append(", time=").append(time);
        sb.append(", floor=").append(floor);
        sb.append(", likenum=").append(likenum);
        sb.append(", parentid=").append(parentid);
        sb.append(", userauthor=").append(userauthor);
        sb.append(", imgauthor=").append(imgauthor);
        sb.append(", nameauthor=").append(nameauthor);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}