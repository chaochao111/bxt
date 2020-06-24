package com.hbxy.bxt.notice.dao;

import com.hbxy.bxt.notice.model.Notice;

import java.util.List;

public interface NoticeMapper {
    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> findAllNotice();//查看全部
}