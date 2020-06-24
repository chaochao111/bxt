package com.hbxy.bxt.building.service;

import com.hbxy.bxt.building.model.Building;

import java.util.List;

public interface BuildingService {
    int deleteByPrimaryKey(Integer buildingid);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingid);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    List<Building> findAllBuilding();//查看全部

    List<Integer> findAllBuildingByMechanicId (Integer mechanicId);
}
