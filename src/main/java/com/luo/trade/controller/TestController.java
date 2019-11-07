package com.luo.trade.controller;

import com.luo.trade.domain.MailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MailProperties mailProperties;

    @RequestMapping("/test")
    public String test() {
        return mailProperties.toString();
    }
}