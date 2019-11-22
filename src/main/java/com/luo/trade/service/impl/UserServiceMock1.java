package com.luo.trade.service.impl;

import com.luo.trade.repository.po.UserPO;
import com.luo.trade.service.UserService;
import com.luo.trade.service.UserServiceMock;
import org.springframework.stereotype.Service;

@Service
public class UserServiceMock1 implements UserServiceMock {

    @Override
    public UserPO queryUserPO(int id) {
        return null;
    }
}
