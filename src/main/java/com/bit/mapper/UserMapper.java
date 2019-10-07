package com.bit.mapper;

import com.bit.Pack.UserPacking;
import com.bit.po.User;
import com.bit.po.UserEx;

import java.util.List;

public interface UserMapper {
    public List<UserEx> queryUserComp(UserPacking userPacking)throws Exception;
    public int queryUserByCount(UserPacking userPacking)throws Exception;
    public List<User> queryUserByAlis()throws Exception;
public List<User> queryUserMultyIds(UserPacking userPacking)throws Exception;
    public List<User> queryUserMultyIds2(UserPacking userPacking)throws Exception;
}
