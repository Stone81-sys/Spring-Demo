package com.kexiang.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studyMVC {
    @RequestMapping("/nihao")
    public String der(String str){
        return str;
    }

    @RequestMapping("/r1")
    public Integer der(@RequestParam("jia") Integer str){
        return str;
    }

    @RequestMapping("/r2")
    public Integer[] der(Integer[] str){
        return str;
    }

    @RequestMapping("/r3")
    public List<Integer> der(@RequestParam List<Integer> der){
        return der;
    }

    @RequestMapping("/r4")
    public String kao(@RequestBody String kao){
        return kao;
    }

    @RequestMapping("/r5")
    public People kao(@RequestBody People kao){
        return kao;
    }



}


