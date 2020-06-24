package com.hbxy.bxt.mechanic.dao;

import com.hbxy.bxt.mechanic.model.Mechanic;

import java.util.List;

public interface MechanicMapper {
    int deleteByPrimaryKey(Integer mechanicid);

    int insert(Mechanic record);

    int insertSelective(Mechanic record);

    Mechanic selectByPrimaryKey(Integer mechanicid);

    int updateByPrimaryKeySelective(Mechanic record);

    int updateByPrimaryKey(Mechanic record);

    List<Mechanic> findAllMechanic();//查看全部

    Mechanic findMechanicByPhone(String mechanicphone);

    List<Mechanic> findMechanicBytypid(Integer typid);

}