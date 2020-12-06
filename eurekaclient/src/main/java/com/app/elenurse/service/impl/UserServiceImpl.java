package com.app.elenurse.service.impl;

import com.app.elenurse.domain.User;
import com.app.elenurse.domain.mapper.UserMapper;
import com.app.elenurse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper  userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public List<User> queryUsersByCondition(User user) {
        return null;
    }

    @Override
    public User queryUserByUserCode(String userCode) {
        return null;
    }
}
