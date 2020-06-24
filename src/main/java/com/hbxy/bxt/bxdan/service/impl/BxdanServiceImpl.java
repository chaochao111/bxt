package com.hbxy.bxt.bxdan.service.impl;

import com.hbxy.bxt.bxdan.dao.BxdanMapper;
import com.hbxy.bxt.bxdan.model.Bxdan;
import com.hbxy.bxt.bxdan.service.BxdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BxdanServiceImpl implements BxdanService {
    @Autowired
    BxdanMapper bxdanMapper;

    @Override
    public int deleteByPrimaryKey(Integer bxdanid) {
        return 0;
    }

    @Override
    public int insert(Bxdan record) {
        return bxdanMapper.insert(record);
    }

    @Override
    public int insertSelective(Bxdan record) {
        return bxdanMapper.insertSelective(record);
    }

    @Override
    public Bxdan selectByPrimaryKey(Integer bxdanid) {
        return bxdanMapper.selectByPrimaryKey(bxdanid);
    }

    @Override
    public int updateByPrimaryKeySelective(Bxdan record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bxdan record) {

        return bxdanMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Bxdan> selectUserBxdan(String userId) {

        return bxdanMapper.selectUserBxdan(userId);
    }

    @Override
    public List<Bxdan> finishedUserBxdan(String userId) {
        return bxdanMapper.finishedUserBxdan(userId);
    }

        @Override
    public List<Bxdan> selectUserBxdanByBuildingId(Integer buildingId) {
        return bxdanMapper.selectUserBxdanByBuildingId(buildingId);
    }

    @Override
    public List<Bxdan> selectUserBxdanByBuildingId1(Integer buildingId) {
        return bxdanMapper.selectUserBxdanByBuildingId1(buildingId);
    }

    @Override
    public List<Bxdan> selectUserBxdanByBuildingId2(Integer buildingId) {
        return bxdanMapper.selectUserBxdanByBuildingId2(buildingId);
    }

    @Override
    public int updateback(Bxdan record) {
        return bxdanMapper.updateback(record);
    }

    @Override
    public int updateassess(Bxdan record) {
        return bxdanMapper.updateassess(record);
    }

    @Override
    public int updatestart(Bxdan record) {
        return bxdanMapper.updatestart(record);
    }

    @Override
    public int updateend(Bxdan record) {
        return bxdanMapper.updateend(record);
    }
    @Override
    public List<Bxdan> selectBxdanByBuildingIdAndTypeId(Integer buildingId, Integer typid){
        return bxdanMapper.selectBxdanByBuildingIdAndTypeId(buildingId,typid);
    }

    @Override
    public List<Bxdan> selectBxdanByBuildingIdAndTypeId1(Integer buildingId, Integer typid) {
        return bxdanMapper.selectBxdanByBuildingIdAndTypeId1(buildingId,typid);
    }

    @Override
    public List<Bxdan> selectBxdanByBuildingIdAndTypeId2(Integer buildingId, Integer typid) {
        return bxdanMapper.selectBxdanByBuildingIdAndTypeId2(buildingId,typid);
    }
}
