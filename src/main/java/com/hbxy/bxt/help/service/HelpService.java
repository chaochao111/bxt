package com.hbxy.bxt.help.service;

import com.hbxy.bxt.help.model.Help;

import java.util.List;

public interface HelpService {
    int insert(Help record);

    int insertSelective(Help record);

    List<Help> findAllHelp();//查看全部
    // 通过ID查询
    Help findHelpById(Integer id);
    //按主键删除
    int deleteByPrimaryKey(Integer id);
}
