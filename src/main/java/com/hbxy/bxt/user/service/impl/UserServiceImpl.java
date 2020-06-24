package com.hbxy.bxt.user.service.impl;

import com.hbxy.bxt.user.dao.UserMapper;
import com.hbxy.bxt.user.model.User;
import com.hbxy.bxt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int countByOpenid(String openid) {
        return userMapper.countByOpenid(openid);
    }

    @Override
    public int updateByOpenid(User record) {
        return userMapper.updateByOpenid(record);
    }

    @Override
    public User selectByOpenid(String openid) {
        return userMapper.selectByOpenid(openid);
    }
}
