package com.kexiang.demo.entity;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Register {
    @RequestMapping("/UserName")
    public Boolean compare(String userName, String password, HttpSession session){
        if(!StringUtils.hasLength(userName)||
                !StringUtils.hasLength(password)){
            return false;
        }

        //TODO 这里固定用户一下 , 来日会了数据库编写再改

        if("haha".equals(userName)&&"12334".equals(password)){
            session.setAttribute("userName",userName);
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/respons")
    public String respon1(HttpSession session){
        String name=(String)session.getAttribute("userName");
        if(StringUtils.hasLength(name))
        return name;
        else return "未登录";

    }
}
