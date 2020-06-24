package com.hbxy.bxt.building.model;

import java.io.Serializable;

/**
 * bxt_building
 * @author 
 */
public class Building implements Serializable {
    private Integer buildingid;

    private String buildingcode;

    private String buildingname;

    private String detailaddress;

    private String buildingsex;

    private Integer mechanicid;

    private String mechanicname;

    private static final long serialVersionUID = 1L;

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingcode() {
        return buildingcode;
    }

    public void setBuildingcode(String buildingcode) {
        this.buildingcode = buildingcode;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress;
    }

    public String getBuildingsex() {
        return buildingsex;
    }

    public void setBuildingsex(String buildingsex) {
        this.buildingsex = buildingsex;
    }

    public Integer getMechanicid() {
        return mechanicid;
    }

    public void setMechanicid(Integer mechanicid) {
        this.mechanicid = mechanicid;
    }

    public String getMechanicname() {
        return mechanicname;
    }

    public void setMechanicname(String mechanicname) {
        this.mechanicname = mechanicname;
    }
}