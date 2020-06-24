package com.hbxy.bxt.mechanic.model;

import java.io.Serializable;

/**
 * bxt_mechanic
 * @author 
 */
public class Mechanic implements Serializable {
    private Integer mechanicid;

    private String mechanicname;

    private Integer mechanicnum;

    private String mechanicpassword;

    private String mechanicbuildingname;

    private Integer mechanicbuildingid;

    private Integer typid;

    private String typname;

    private String mechanicsex;

    private String mechanicphone;

    private static final long serialVersionUID = 1L;

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

    public Integer getMechanicnum() {
        return mechanicnum;
    }

    public void setMechanicnum(Integer mechanicnum) {
        this.mechanicnum = mechanicnum;
    }

    public String getMechanicpassword() {
        return mechanicpassword;
    }

    public void setMechanicpassword(String mechanicpassword) {
        this.mechanicpassword = mechanicpassword;
    }

    public String getMechanicbuildingname() {
        return mechanicbuildingname;
    }

    public void setMechanicbuildingname(String mechanicbuildingname) {
        this.mechanicbuildingname = mechanicbuildingname;
    }

    public Integer getMechanicbuildingid() {
        return mechanicbuildingid;
    }

    public void setMechanicbuildingid(Integer mechanicbuildingid) {
        this.mechanicbuildingid = mechanicbuildingid;
    }

    public Integer getTypid() {
        return typid;
    }

    public void setTypid(Integer typid) {
        this.typid = typid;
    }

    public String getTypname() {
        return typname;
    }

    public void setTypname(String typname) {
        this.typname = typname;
    }

    public String getMechanicsex() {
        return mechanicsex;
    }

    public void setMechanicsex(String mechanicsex) {
        this.mechanicsex = mechanicsex;
    }

    public String getMechanicphone() {
        return mechanicphone;
    }

    public void setMechanicphone(String mechanicphone) {
        this.mechanicphone = mechanicphone;
    }
}