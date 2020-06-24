package com.hbxy.bxt.notice.service;

import com.hbxy.bxt.notice.model.Notice;

import java.util.List;

public interface NoticeService {
    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> findAllNotice();//查看全部
}
