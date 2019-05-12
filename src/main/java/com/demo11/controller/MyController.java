package com.demo11.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(){
        return "123456789";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "abcdefg";
    }
}
