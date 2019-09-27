package com.sendinfo.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloController
 * @author: mxk
 * @date: 2019/9/27  11:33
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String sayHello(){
        return "helloWorld";
    }
}
