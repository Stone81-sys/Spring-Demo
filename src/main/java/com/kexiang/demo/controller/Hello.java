package com.kexiang.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/wohuhu")
    public String hello(){
        return "hello";
    }
}
