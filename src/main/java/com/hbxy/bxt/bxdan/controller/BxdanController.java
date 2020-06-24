package com.hbxy.bxt.bxdan.controller;

import com.alibaba.fastjson.JSONObject;
import com.hbxy.bxt.building.service.BuildingService;
import com.hbxy.bxt.bxdan.model.Bxdan;
import com.hbxy.bxt.bxdan.service.impl.BxdanServiceImpl;
import com.hbxy.bxt.help.model.Help;
import com.hbxy.bxt.mechanic.model.Mechanic;
import com.hbxy.bxt.mechanic.service.MechanicService;
import com.hbxy.bxt.mechanic.service.impl.MechanicServiceImpl;
import com.hbxy.bxt.notice.model.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class BxdanController {
    @Autowired
    BxdanServiceImpl bxdanService;
    @Autowired
    MechanicServiceImpl mechanicService;
    @Autowired
    BuildingService buildingService;
    @ResponseBody
    @RequestMapping(value = "/addBxdan",method = RequestMethod.POST)
    private Map<String,Object> addNotice(Bxdan bxdan, HttpSession session, HttpServletRequest request ){
        System.out.println(123);
        JSONObject bxdans=new JSONObject();
        System.out.println(bxdans);
        bxdans.put("success",bxdanService.insertSelective(bxdan));
        bxdans.put("bxdans",bxdan);
        return bxdans;
    }

    @ResponseBody
    @RequestMapping(value = "/unfinishedUserBxdan",method = RequestMethod.GET)
    public String unfinishedUserBxdan(String userId){
        JSONObject result=new JSONObject();
        String msg="暂时没有";
        List<Bxdan> list=null;
        try{
            list=bxdanService.selectUserBxdan(userId);
        }catch (Exception e){e.printStackTrace();}
        if (list!=null){
            msg="操作成功";
        }
        result.put("unfinished",list);
        result.put("msg",msg);
        return  result.toJSONString();
    }
    @ResponseBody
    @RequestMapping(value = "/finishedUserBxdan",method = RequestMethod.GET)
    public String finishedUserBxdan(String userId){
        JSONObject result=new JSONObject();
        String msg="暂时没有";
        List<Bxdan> list=null;
        try{
            list=bxdanService.finishedUserBxdan(userId);
        }catch (Exception e){e.printStackTrace();}
        if (list!=null){
            msg="操作成功";
        }
        result.put("finished",list);
        result.put("msg",msg);
        return  result.toJSONString();
    }

    @ResponseBody
    @RequestMapping(value = "/findAllBuildingByMechanicId",method = RequestMethod.GET)
    public String findAllBuildingByMechanicId(Integer mechanicId,String state ){
        JSONObject result=new JSONObject();
        String msg="暂时没有";
        List<Integer> list=null;
        List<Bxdan> bxdans=null;
        Mechanic mechanic=null;
        try{
            System.out.println(mechanicId);
            mechanic=mechanicService.selectByPrimaryKey(mechanicId);
            System.out.println(mechanic);
            bxdans=bxdanService.selectBxdanByBuildingIdAndTypeId(mechanic.getMechanicbuildingid(),mechanic.getTypid());
        }catch (Exception e){
            e.printStackTrace();
        }

        result.put("unrepaired",bxdans);
        result.put("msg",msg);
        return  result.toJSONString();
    }
    @ResponseBody
    @RequestMapping(value = "/findAllBuildingByMechanicId1",method = RequestMethod.GET)
    public String findAllBuildingByMechanicId1(Integer mechanicId,String state ){
        JSONObject result=new JSONObject();
        String msg="暂时没有";
        List<Integer> list=null;
        List<Bxdan> bxdans=null;
        Mechanic mechanic=null;
        try{
            System.out.println(mechanicId);
            mechanic=mechanicService.selectByPrimaryKey(mechanicId);
            System.out.println(mechanic);
            bxdans=bxdanService.selectBxdanByBuildingIdAndTypeId1(mechanic.getMechanicbuildingid(),mechanic.getTypid());
        }catch (Exception e){
            e.printStackTrace();
        }
        result.put("repaireding",bxdans);
        result.put("msg",msg);
        return  result.toJSONString();
    }
    @ResponseBody
    @RequestMapping(value = "/findAllBuildingByMechanicId2",method = RequestMethod.GET)
    public String findAllBuildingByMechanicId2(Integer mechanicId,String state ){
        JSONObject result=new JSONObject();
        String msg="暂时没有";
        List<Integer> list=null;
        List<Bxdan> bxdans=null;
        Mechanic mechanic=null;
        try{
            System.out.println(mechanicId);
            mechanic=mechanicService.selectByPrimaryKey(mechanicId);
            System.out.println(mechanic);
            bxdans=bxdanService.selectBxdanByBuildingIdAndTypeId2(mechanic.getMechanicbuildingid(),mechanic.getTypid());
        }catch (Exception e){
            e.printStackTrace();
        }
        result.put("repaireded",bxdans);
        result.put("msg",msg);
        return  result.toJSONString();
    }
    //报修单信息反馈
    @ResponseBody
    @RequestMapping(value = "/updateback",method = RequestMethod.POST)
    public String updateBack(@RequestBody Bxdan bxdan){
        JSONObject result=new JSONObject();
        try{
            bxdanService.updateback(bxdan);
            result.put("msg","修改成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", "修改失败");
        }

        return  result.toJSONString();
    }
    //报修单评价
    @ResponseBody
    @RequestMapping(value = "/updateassess",method = RequestMethod.POST)
    public String updateAssess(@RequestBody Bxdan bxdan){
        JSONObject result=new JSONObject();
        try{
            bxdanService.updateassess(bxdan);
            result.put("msg","修改成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", "修改失败");
        }

        return  result.toJSONString();
    }
    //报修单开始
    @ResponseBody
    @RequestMapping(value = "/updatestart",method = RequestMethod.POST)
    public String updateStart(@RequestBody Bxdan bxdan){
        JSONObject result=new JSONObject();
        try{
            bxdanService.updatestart(bxdan);
            result.put("msg","修改成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", "修改失败");
        }
        return  result.toJSONString();
    }
    //报修单结束
    @ResponseBody
    @RequestMapping(value = "/updateend",method = RequestMethod.POST)
    public String updateEnd(@RequestBody Bxdan bxdan){
        JSONObject result=new JSONObject();
        try{
            bxdanService.updateend(bxdan);
            result.put("msg","修改成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", "修改失败");
        }
        return  result.toJSONString();
    }
    //报修单详情
    @RequestMapping(value = "/bxdandetail",method = RequestMethod.GET)
    @ResponseBody//表示传递字符串
    private String findUser(Integer bxdanid, HttpSession session, HttpServletRequest request ){
        JSONObject result=new JSONObject();
        System.out.println(result);
        result.put("bxdan",bxdanService.selectByPrimaryKey(bxdanid));
        return result.toJSONString();
    }



}
