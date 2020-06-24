package com.hbxy.bxt.notice.model;

import java.io.Serializable;
import java.util.Date;

/**
 * bxt_notice
 * @author 
 */
public class Notice implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Date creattime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}