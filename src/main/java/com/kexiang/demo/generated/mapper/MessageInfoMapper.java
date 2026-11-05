package com.kexiang.demo.generated.mapper;

import com.kexiang.demo.generated.entity.MessageInfo;
import java.util.List;

public interface MessageInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageInfo row);

    MessageInfo selectByPrimaryKey(Integer id);

    List<MessageInfo> selectAll();

    int updateByPrimaryKey(MessageInfo row);
}