package com.ssm.farming.service.impl;

import com.ssm.farming.mapper.UserMapper;
import com.ssm.farming.pojo.User;
import com.ssm.farming.pojo.UserExample;
import com.ssm.farming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User checkLogin(String userName, String userPassword) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(userName).andPasswordEqualTo(userPassword);
        List<User> users = userMapper.selectByExample(userExample);
        if(users != null && users.get(0).getName().equals(userName) && users.get(0).getPassword().equals(userPassword)){
            return users.get(0);
        }
        return null;
    }
}
