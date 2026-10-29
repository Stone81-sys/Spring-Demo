package com.kexiang.demo.mapper;

import com.kexiang.demo.entity.MessageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageWallMapper {

//    CREATE TABLE `message_info` (
//        `id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
//            `from` VARCHAR ( 127 ) NOT NULL,
//            `to` VARCHAR ( 127 ) NOT NULL,
//            `message` VARCHAR ( 256 ) NOT NULL,
//            `delete_flag` TINYINT ( 4 ) DEFAULT 0 COMMENT '0-正常, 1-删除',
//            `create_time` DATETIME DEFAULT now(),
//            `update_time` DATETIME DEFAULT now() ON UPDATE now(),
//        PRIMARY KEY ( `id` )
//    ) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

    @Select("select  * from message_info")
    List<MessageInfo> selectmesssql() ;

    @Insert("insert into message_info(`from`,`to`,`message` )values (#{from},#{to},#{message})")
    int insertmesssql(MessageInfo mess);
}
