package com.hbxy.bxt.bxdan.dao;

import com.hbxy.bxt.bxdan.model.Bxdan;

import java.util.List;

public interface BxdanMapper {
    int deleteByPrimaryKey(Integer bxdanid);

    int insert(Bxdan record);

    int insertSelective(Bxdan record);

    Bxdan selectByPrimaryKey(Integer bxdanid);

    int updateByPrimaryKeySelective(Bxdan record);

    int updateByPrimaryKey(Bxdan record);

    int updateback(Bxdan record);

    int updateassess(Bxdan record);

    int updatestart(Bxdan record);

    int updateend(Bxdan record);

    List<Bxdan> selectUserBxdan(String userId);

    List<Bxdan> finishedUserBxdan(String userId);

    List<Bxdan> selectUserBxdanByBuildingId(Integer buildingId);

    List<Bxdan> selectUserBxdanByBuildingId1(Integer buildingId);

    List<Bxdan> selectUserBxdanByBuildingId2(Integer buildingId);

    List<Bxdan> selectBxdanByBuildingIdAndTypeId(Integer buildingId,Integer typid);

    List<Bxdan> selectBxdanByBuildingIdAndTypeId1(Integer buildingId,Integer typid);

    List<Bxdan> selectBxdanByBuildingIdAndTypeId2(Integer buildingId,Integer typid);

}