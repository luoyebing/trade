package com.luo.trade.test;


import com.luo.trade.TradeApplication;
import com.luo.trade.controller.UseController;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = TradeApplication.class) // 指定我们SpringBoot工程的Application启动类
@WebAppConfiguration
public class UserTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);
    @Autowired
    private UseController userController;
    @Test
    public void getUserTest(){
        Map<String ,Object> map = userController.getUser();
        LOGGER.info(map.get("data").toString());
    }
}
