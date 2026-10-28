package com.kexiang.demo.controller;

import com.kexiang.demo.entity.People;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    public Object kao(@RequestBody People person){
        return person.toString();
    }

    @RequestMapping("/{tem}/{name}")
    public String str(@PathVariable("tem") String tem,@PathVariable("name")String name ){
        return tem+name;
    }

    @RequestMapping("/r7")
    public String file1(@RequestPart MultipartFile fam) throws IOException {
        String str=fam.getOriginalFilename();
        fam.transferTo(new File("D:\\work"+str));
        return str;
    }
}


