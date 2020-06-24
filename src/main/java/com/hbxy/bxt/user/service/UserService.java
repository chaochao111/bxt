package com.hbxy.bxt.user.service;

import com.hbxy.bxt.user.model.User;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int countByOpenid(String openid);

    int updateByOpenid(User record);

    User selectByOpenid(String openid);
}
