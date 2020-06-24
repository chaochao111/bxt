package com.hbxy.bxt.help.model;

import java.io.Serializable;

/**
 * bxt_help
 * @author 
 */
public class Help implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private String content;

    private Byte istrue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getIstrue() {
        return istrue;
    }

    public void setIstrue(Byte istrue) {
        this.istrue = istrue;
    }
}