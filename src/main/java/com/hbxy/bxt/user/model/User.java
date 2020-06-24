package com.hbxy.bxt.user.model;

import java.io.Serializable;

/**
 * bxt_user
 * @author 
 */
public class User implements Serializable {
    private Integer userid;

    private String openid;

    /**
     * 学号
     */
    private String usernum;

    /**
     * 姓名
     */
    private String username;

    /**
     * 班级
     */
    private String usergrade;

    /**
     * 电话
     */
    private String phone;

    /**
     * 楼号名称
     */
    private String buildingname;

    /**
     * 楼号Id
     */
    private Integer buildingid;

    /**
     * 宿舍号
     */
    private String room;

    /**
     * 邮箱
     */
    private String useremail;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
}