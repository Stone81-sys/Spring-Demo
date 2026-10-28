package com.kexiang.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageInfo {

//    CREATE TABLE `message_info` (
//        `id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
//        `from` VARCHAR ( 127 ) NOT NULL,
//        `to` VARCHAR ( 127 ) NOT NULL,
//        `message` VARCHAR ( 256 ) NOT NULL,
//        `delete_flag` TINYINT ( 4 ) DEFAULT 0 COMMENT '0-正常, 1-删除',
//        `create_time` DATETIME DEFAULT now(),
//        `update_time` DATETIME DEFAULT now() ON UPDATE now(),
//    PRIMARY KEY ( `id` )
//    ) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

    Integer id;
    String from;
    String to;
    String message;
    Integer deleteFlag;
    LocalDateTime createTime;
    LocalDateTime updateTime;

}
