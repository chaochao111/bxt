package com.hbxy.bxt.notice.service.impl;

import com.hbxy.bxt.notice.dao.NoticeMapper;
import com.hbxy.bxt.notice.model.Notice;
import com.hbxy.bxt.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    public NoticeMapper noticeMapper;

    @Override
    public int insert(Notice record) {
        return  noticeMapper.insert(record);
    }

    @Override
    public int insertSelective(Notice record) {
        return 0;
    }

    @Override
    public List<Notice> findAllNotice() {
        return noticeMapper.findAllNotice();
    }
}
