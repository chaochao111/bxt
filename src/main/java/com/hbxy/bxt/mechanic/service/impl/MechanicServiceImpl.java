package com.hbxy.bxt.mechanic.service.impl;

import com.hbxy.bxt.mechanic.dao.MechanicMapper;
import com.hbxy.bxt.mechanic.model.Mechanic;
import com.hbxy.bxt.mechanic.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicServiceImpl implements MechanicService {
    @Autowired
    public MechanicMapper mechanicMapper;

    @Override
    public int deleteByPrimaryKey(Integer mechanicid) {
        return mechanicMapper.deleteByPrimaryKey(mechanicid);
    }

    @Override
    public int insert(Mechanic record) {
        return mechanicMapper.insert(record);
    }

    @Override
    public int insertSelective(Mechanic record) {
        return 0;
    }

    @Override
    public Mechanic selectByPrimaryKey(Integer mechanicid) {
        return mechanicMapper.selectByPrimaryKey(mechanicid);
    }

    @Override
    public int updateByPrimaryKeySelective(Mechanic record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Mechanic record) {
        return 0;
    }

    @Override
    public List<Mechanic> findAllMechanic() {
        return mechanicMapper.findAllMechanic();
    }

    @Override
    public Mechanic findMechanicByPhone(String mechanicphone) {
        return mechanicMapper.findMechanicByPhone(mechanicphone);
    }

    @Override
    public List<Mechanic> findMechanicBytypid(Integer typid) {
        return mechanicMapper.findMechanicBytypid(typid);
    }
}
