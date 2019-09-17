package com.article.articlemanagesystem.service.impl;

import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.entity.UserExample;
import com.article.articlemanagesystem.mapper.UserMapper;
import com.article.articlemanagesystem.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User findByUserName(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList.size() == 0 ? null : userList.get(0);
    }

    @Override
    public List<User> findLikeUserName(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserLike(username);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList;
    }

    @Override
    public List<User> getAllUser(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectByExample(new UserExample());
        return userList;
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteByUsername(String username) {
        userMapper.deleteByPrimaryKey(username);
    }
}
