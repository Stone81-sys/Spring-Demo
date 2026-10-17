package com.kexiang.demo;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/wall")
@RestController
public class messageWall {
    private List<messageConve> list1=new ArrayList<>();

    @RequestMapping("/judge")
    public boolean judge(messageConve mess){
        if(StringUtils.hasLength(mess.getFrom())||
                StringUtils.hasLength(mess.getTo())||
                StringUtils.hasLength(mess.getSay())){

            list1.add(mess);
            return true;
        }
    return false;
    }

    @RequestMapping("/response")
    public List<messageConve> response(List<messageConve> list1){
        return list1;

    }

}
