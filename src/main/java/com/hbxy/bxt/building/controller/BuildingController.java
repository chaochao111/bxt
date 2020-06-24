package com.hbxy.bxt.building.controller;

import com.alibaba.fastjson.JSONObject;
import com.hbxy.bxt.building.model.Building;
import com.hbxy.bxt.building.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class BuildingController {
    @Autowired
    public BuildingService buildingService;
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/findallbuilding",method = RequestMethod.GET)
    public String findAllBuilding(HttpSession session, HttpServletRequest request){
        List<Building> list=null;
        try {
            list=buildingService.findAllBuilding();
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject buildings=new JSONObject();
        buildings.put("buildings",list);
        return buildings.toJSONString();
    }

    @RequestMapping(value = "/delbuilding",method = RequestMethod.GET)
    @ResponseBody//表示传递字符串
    private Map<String,Object> delBuildingbyId(Integer buildingid ){
        JSONObject buildings=new JSONObject();
        buildings.put("success",buildingService.deleteByPrimaryKey(buildingid));
        return buildings;
    }

    @RequestMapping(value = "/addbuilding",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> addBuilding(Building building, HttpSession session, HttpServletRequest request ){
        System.out.println(building);
        System.out.println(123);
        JSONObject buildings=new JSONObject();
        System.out.println(buildings);
        buildings.put("success",buildingService.insert(building));
        buildings.put("buildings",building);
        return buildings;
    }
}
