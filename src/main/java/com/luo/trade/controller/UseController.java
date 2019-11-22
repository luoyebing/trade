package com.luo.trade.controller;

import com.luo.trade.repository.po.UserPO;
import com.luo.trade.service.UserService;
import com.luo.trade.service.UserServiceImpl;
import com.luo.trade.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UseController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @GetMapping("/user")
    public Map<String ,Object> getUser() {
        UserPO userPO = userService.queryUserPO(1);
        return AjaxResult.success(userPO);
    }

}
