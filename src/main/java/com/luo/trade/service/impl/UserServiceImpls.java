package com.luo.trade.service.impl;

import com.luo.trade.repository.UserRepository;
import com.luo.trade.repository.mapper.UserPOMapper;
import com.luo.trade.repository.po.UserPO;
import com.luo.trade.service.UserService;
import com.luo.trade.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpls implements UserServiceImpl {

//    @Autowired
//    private UserRepository userRespository;

    @Autowired
    private UserPOMapper userPOMapper;

    @Override
    public UserPO queryUserPO(int id) {
        return userPOMapper.queryUserPo(id);
    }

}
