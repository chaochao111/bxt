package com.hbxy.bxt.notice.controller;

import com.alibaba.fastjson.JSONObject;
import com.hbxy.bxt.help.model.Help;
import com.hbxy.bxt.notice.model.Notice;
import com.hbxy.bxt.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Timestamp;
import java.util.List;
import java.util.Map;

@Controller
public class NoticeController {
    @Autowired
    public NoticeService noticeService;
    @ResponseBody//表示传递字符串
    @RequestMapping(value = "/findallnotice",method = RequestMethod.GET)
    public String findAllNotice(HttpSession session, HttpServletRequest request){
        System.out.println(111);
        List<Notice> list=null;
        try {
            list=noticeService.findAllNotice();
        }catch (Exception e){
            e.printStackTrace();;
        }
        JSONObject notices=new JSONObject();
        notices.put("notices",list);
        return notices.toJSONString();
    }

    @RequestMapping(value = "/addnotice",method = RequestMethod.POST)
    @ResponseBody//表示传递字符串
    private Map<String,Object> addNotice(Notice notice, HttpSession session, HttpServletRequest request ){
        System.out.println(123);
        JSONObject notices=new JSONObject();
        System.out.println(notices);
        notices.put("success",noticeService.insert(notice));
        notices.put("notices",notice);
        return notices;
    }
}
