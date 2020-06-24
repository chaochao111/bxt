package com.hbxy.bxt.help.service.impl;

import com.hbxy.bxt.help.dao.HelpMapper;
import com.hbxy.bxt.help.model.Help;
import com.hbxy.bxt.help.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpServiceImpl implements HelpService {
    @Autowired
    public HelpMapper helpMapper;

    @Override
    public int insert(Help record) {
        return helpMapper.insert(record);
    }

    @Override
    public int insertSelective(Help record) {
        return 0;
    }

    @Override
    public List<Help> findAllHelp() {
        return helpMapper.findAllHelp();
    }

    @Override
    public Help findHelpById(Integer id) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return helpMapper.deleteByPrimaryKey(id);
    }
}
