package com.kexiang.demo.Service;

import com.kexiang.demo.entity.MessageInfo;
import com.kexiang.demo.mapper.MessageWallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageInfoService {
    @Autowired
    MessageWallMapper messageWallMapper;

    public int insertmesssql(MessageInfo mess){
        int sum =messageWallMapper.insertmesssql(mess);
        return sum ;
    }

    public List<MessageInfo> selectmesssql() {
        return messageWallMapper.selectmesssql();

    }
}
