package com.hbxy.bxt.building.dao;

import com.hbxy.bxt.building.model.Building;
import com.hbxy.bxt.help.model.Help;

import java.util.List;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer buildingid);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingid);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> findAllBuilding();//查看全部

    List<Integer> findAllBuildingByMechanicId(Integer mechanicId);

}