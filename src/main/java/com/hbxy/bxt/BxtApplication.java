package com.hbxy.bxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication同级或子级包
@EnableAutoConfiguration//启动程序扫描范围当前类
@ComponentScan(basePackages = "com.hbxy.bxt")//扫面指定类，不写默认所有类
@MapperScan("com.hbxy.bxt.**.dao")
public class BxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxtApplication.class, args);
    }

}
