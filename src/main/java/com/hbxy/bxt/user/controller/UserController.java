package com.hbxy.bxt.user.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hbxy.bxt.notice.model.Notice;
import com.hbxy.bxt.user.model.User;
import com.hbxy.bxt.user.service.UserService;
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
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping(value = "/finduser",method = RequestMethod.GET)
    @ResponseBody//表示传递字符串
    private String findUser(String openid, HttpSession session, HttpServletRequest request ){
        JSONObject users=new JSONObject();
        System.out.println(users);
        users.put("user",userService.selectByOpenid(openid));
        return users.toJSONString();
    }
//添加新用户
    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> addUser(String openid,HttpSession session, HttpServletRequest request ){
        User user=new User();
        user.setOpenid(openid);
        int i =(userService.countByOpenid(openid));
        System.out.println(i);
        if(i==0){
            JSONObject users=new JSONObject();
            users.put("success",userService.insert(user));
            users.put("users",user);
            return users;
        }
        JSONObject users=new JSONObject();
        users.put("users",user);
        return users;

    }
    //更新用户信息
    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> updateUser(User user, HttpSession session, HttpServletRequest request ){
        System.out.println(123);
        JSONObject users=new JSONObject();
        System.out.println(users);
        users.put("success",userService.updateByPrimaryKey(user));
        users.put("users",user);
        return users;
    }

}
