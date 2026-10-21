package com.kexiang.captcha.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "captcha")
@Data
public class Captchamodel {
    private int width;
    private int height;
    private Session Session;

    @Data
    public static class Session{
        private String key;
        private String date;
    }

}
