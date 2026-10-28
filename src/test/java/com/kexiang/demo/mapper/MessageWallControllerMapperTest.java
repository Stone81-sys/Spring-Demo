package com.kexiang.demo.mapper;

import com.kexiang.demo.entity.MessageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MessageWallControllerMapperTest {
    @Autowired
    MessageWallMapper messageWallMapper;

    @Test
    void selectmesssql() {
        List<MessageInfo> mess=messageWallMapper.selectmesssql();
        mess.forEach(System.out::println);
    }

    @Test
    void insertmesssql() {
        MessageInfo messageInfo = new MessageInfo();
        messageInfo.setFrom("er");
        messageInfo.setTo("bai");
        messageInfo.setMessage("wu");
        int sum=messageWallMapper.insertmesssql(messageInfo);
        System.out.println(sum);
    }
}