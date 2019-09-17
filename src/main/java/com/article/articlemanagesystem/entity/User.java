package com.article.articlemanagesystem.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String user;

    private String password;

    private String name;

    private String imgavatar;

    private String signature;

    private String email;

    private Integer usergroup;

    private Integer money;

    private static final long serialVersionUID = 1L;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgavatar() {
        return imgavatar;
    }

    public void setImgavatar(String imgavatar) {
        this.imgavatar = imgavatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(Integer usergroup) {
        this.usergroup = usergroup;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user=").append(user);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", imgavatar=").append(imgavatar);
        sb.append(", signature=").append(signature);
        sb.append(", email=").append(email);
        sb.append(", usergroup=").append(usergroup);
        sb.append(", money=").append(money);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}