package com.hbxy.bxt.user.dao;

import com.hbxy.bxt.user.model.User;

public interface UserMapper {
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