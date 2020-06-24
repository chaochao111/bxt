package com.hbxy.bxt.bxdan.model;

import java.io.Serializable;
import java.util.Date;

/**
 * bxt_bxdan
 * @author 
 */
public class Bxdan implements Serializable {
    private Integer bxdanid;

    private Integer typid;

    /**
     * 报修人id
     */
    private String userid;

    private Integer buildingid;

    private String buildingname;

    private String room;

    private Integer areaid;

    /**
     * 报修区域名称
     */
    private String areaname;

    /**
     * 姓名
     */
    private String username;

    /**
     * 学号
     */
    private String usernum;

    private String phone;

    private String description;

    /**
     * 图片
     */
    private String picture;

    /**
     * 状态
     */
    private String state;

    /**
     * 评价
     */
    private String assess;

    /**
     * 反馈
     */
    private String feedback;

    private Date createtime;

    private Date starttime;

    private Date endtime;

    private Date backtime;

    private Date assesstime;

    private static final long serialVersionUID = 1L;

    public Integer getBxdanid() {
        return bxdanid;
    }

    public void setBxdanid(Integer bxdanid) {
        this.bxdanid = bxdanid;
    }

    public Integer getTypid() {
        return typid;
    }

    public void setTypid(Integer typid) {
        this.typid = typid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAssess() {
        return assess;
    }

    public void setAssess(String assess) {
        this.assess = assess;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public Date getAssesstime() {
        return assesstime;
    }

    public void setAssesstime(Date assesstime) {
        this.assesstime = assesstime;
    }
}