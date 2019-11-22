package com.luo.trade.repository.mapper;

import com.luo.trade.repository.po.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
//
//@Mapper
//@Component
public interface UserPOMapper {

  UserPO queryUserPo(int id);
}