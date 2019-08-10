package com.bit.mapper;

import com.bit.po.User;
import com.bit.po.Userex;

import java.util.List;

public interface UserMapper {
    public List<Userex> queryUserByZH(Userex userex)throws Exception;
    public int queryUserByCount(Userex userex)throws Exception;
    public List<Userex> queryUserByAlias()throws Exception;
    public List<User> queryUserByAlias2() throws Exception;
}
