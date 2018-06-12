package com.sanlen.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/***************************************
 * 文 件 名 :HelloController.java
 * CopyRright (c) 2006-2018 Sanlen Security Corp.
 * 创 建 人：zhaokunpeng
 * 创建日 期：2018/06/12 15:45
 * 文件功能说明:
 * 版 本 号：0.1
 ***************************************/
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    private String index(){
        return "Hello World!";
    }

    @RequestMapping("/")
    private String boot(){
        return "Spring boot";
    }
}
