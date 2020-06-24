package com.hbxy.bxt.building.service.impl;

import com.hbxy.bxt.building.dao.BuildingMapper;
import com.hbxy.bxt.building.model.Building;
import com.hbxy.bxt.building.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    public BuildingMapper buildingMapper;

    @Override
    public int deleteByPrimaryKey(Integer buildingid) {
        return buildingMapper.deleteByPrimaryKey(buildingid);
    }

    @Override
    public int insert(Building record) {
        return buildingMapper.insert(record);
    }

    @Override
    public int insertSelective(Building record) {
        return 0;
    }

    @Override
    public Building selectByPrimaryKey(Integer buildingid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Building record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Building record) {
        return 0;
    }

    @Override
    public List<Building> findAllBuilding() {
        return  buildingMapper.findAllBuilding();
    }

    @Override
    public List<Integer> findAllBuildingByMechanicId(Integer mechanicId) {
        return buildingMapper.findAllBuildingByMechanicId(mechanicId);
    }
}
