package com.hbxy.bxt.help.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hbxy.bxt.help.model.Help;
import com.hbxy.bxt.help.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelpController {
    @Autowired
    public HelpService helpService;
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/findAllHelp",method = RequestMethod.GET)
    public String findAllHelp(HttpSession session, HttpServletRequest request){
        List<Help> list=null;
        try {
            list=helpService.findAllHelp();
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject helps=new JSONObject();
        helps.put("helps",list);
        return helps.toJSONString();
    }

    @RequestMapping(value = "/delhelp",method = RequestMethod.GET)
    @ResponseBody//表示传递字符串
    private Map<String,Object> delHelpbyId(Integer id ){
        JSONObject helps=new JSONObject();
        helps.put("success",helpService.deleteByPrimaryKey(id));
        return helps;
    }

    @RequestMapping(value = "/addhelp",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> addHelp(Help help, HttpSession session, HttpServletRequest request ){
        System.out.println(help);
        System.out.println(123);
        JSONObject helps=new JSONObject();
        System.out.println(helps);
        helps.put("success",helpService.insert(help));
        helps.put("helps",help);
        return helps;
    }

}
