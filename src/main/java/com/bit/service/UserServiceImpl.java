package com.bit.service;

import com.bit.mapper.UserMapper;
import com.bit.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserListService() throws Exception {
        return userMapper.queryUserList();
    }
}
