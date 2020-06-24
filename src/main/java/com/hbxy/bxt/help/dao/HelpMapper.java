package com.hbxy.bxt.help.dao;

import com.hbxy.bxt.help.model.Help;

import java.util.List;

public interface HelpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Help record);

    int insertSelective(Help record);

    Help selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKey(Help record);

    List<Help> findAllHelp();//查看全部
}