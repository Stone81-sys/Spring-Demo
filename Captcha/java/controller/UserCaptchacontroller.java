package com.kexiang.captcha.Controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import com.kexiang.captcha.model.Captchamodel;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/captcha")
public class UserCaptchacontroller {

    @Autowired
    private Captchamodel captchamodel;

    @RequestMapping("/getCaptcha")
    public void getCaptchaApplication(HttpServletResponse response , HttpSession session) throws IOException {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(captchamodel.getWidth(), captchamodel.getHeight());
        lineCaptcha.write(response.getOutputStream());

        session.setAttribute(captchamodel.getSession().getKey(),lineCaptcha.getCode());
        session.setAttribute(captchamodel.getSession().getDate(),new Date());

        response.getOutputStream().close();
//Servlet的OutputStream记得自行关闭哦！
    }

    @RequestMapping("/check")
    public boolean captcahCheck(HttpSession session){
        return false;

    }

}
