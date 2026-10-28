package com.kexiang.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calc")
public class ComputerDemo {
    @RequestMapping("/sum")
    public String calc(Integer num1,Integer num2){
    Integer sum=num1+num2;
    return "得到结果是"+sum;
    }
}