package com.article.articlemanagesystem.service;

import com.article.articlemanagesystem.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User findByUserName(String username);

    List<User> findLikeUserName(String username);

    List<User> findLikeName(String name);

    List<User> getAllUser(Integer pageNum, Integer pageSize);

    void updateUser(User user);

    void deleteByUsername(String username);

}
