package com.hbxy.bxt.mechanic.controller;

import com.alibaba.fastjson.JSONObject;
import com.hbxy.bxt.help.model.Help;
import com.hbxy.bxt.mechanic.model.Mechanic;
import com.hbxy.bxt.mechanic.service.MechanicService;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class MechanicController {
    @Autowired
    public MechanicService mechanicService;
    //查询所有技术员
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/findallmechanic",method = RequestMethod.GET)
    public String findAllMechanic(HttpSession session, HttpServletRequest request){
        List<Mechanic> list=null;
        try {
            list=mechanicService.findAllMechanic();
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject mechanics=new JSONObject();
        mechanics.put("mechanics",list);
        return mechanics.toJSONString();
    }

//删除技术员
    @RequestMapping(value = "/delmechanic",method = RequestMethod.GET)
    @ResponseBody//表示传递字符串
    private Map<String,Object> delMechanicsbyId(Integer id ){
        JSONObject mechanics=new JSONObject();
        mechanics.put("success",mechanicService.deleteByPrimaryKey(id));
        return mechanics;
    }
    //添加技术员
    @RequestMapping(value = "/addmechanic",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> addHelp(Mechanic mechanic, HttpSession session, HttpServletRequest request ){
        System.out.println(mechanic);
        System.out.println(123);
        JSONObject mechanics=new JSONObject();
        System.out.println(mechanics);
        mechanics.put("success",mechanicService.insert(mechanic));
        mechanics.put("mechanics",mechanic);
        return mechanics;
    }
    //
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/sendCode",method = RequestMethod.GET)
    public String sendCode(String phone,HttpSession session, HttpServletRequest request){
        Mechanic mechanic=null;
        int ran1 = new Random().nextInt(10000);
        String code=null;
        code=String.valueOf(ran1);
        if (ran1<199){
            code="0"+String.valueOf(ran1);
        }
        try {
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject mechanics=new JSONObject();
        mechanics.put("testcode",code);
        mechanics.put("testphone",phone);

        try {
            ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", "105535",
                    "fe19ef85-8c79-45db-a51b-059d8a1f7120");
            Map<String, String> params = new HashMap<String, String>();
            params.put("message",
                    "海滨报修通维修技术员登录验证码为:"+code);
            params.put("number",phone);
            String result= client.send(params);
            mechanics.put("result",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mechanics.toJSONString();
    }

    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/loginByPhone",method = RequestMethod.GET)
    public String loginByPhone(String phone,HttpSession session, HttpServletRequest request){
        Mechanic mechanic=null;

        try {
            mechanic=mechanicService.findMechanicByPhone(phone);
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject mechanics=new JSONObject();
        mechanics.put("mechanicId",mechanic.getMechanicid());

        return mechanics.toJSONString();
    }
    //查询类型技术员
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/findMechanicBytypid",method = RequestMethod.GET)
    public String findMechanicBytypid( Integer typid, HttpSession session, HttpServletRequest request){
        List<Mechanic> list=null;
        try {
            list=mechanicService.findMechanicBytypid(typid);
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject mechanics=new JSONObject();
        mechanics.put("mechanics",list);
        return mechanics.toJSONString();
    }
}
