package com.kexiang.demo.controller;

import com.kexiang.demo.Service.MessageInfoService;
import com.kexiang.demo.entity.MessageInfo;
import com.kexiang.demo.mapper.MessageWallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/wall")
@RestController
public class MessageWallController {

    @Autowired
    MessageInfoService messageInfoService;

    @RequestMapping("/judge")
    public boolean judge(MessageInfo mess){
        if(StringUtils.hasLength(mess.getFrom())&&
                StringUtils.hasLength(mess.getTo())&&
                StringUtils.hasLength(mess.getMessage())){

            messageInfoService.insertmesssql(mess);

            return true;
        }
    return false;
    }

    @RequestMapping("/response")
    public List<MessageInfo> response(){
        return messageInfoService.selectmesssql();

    }

}
