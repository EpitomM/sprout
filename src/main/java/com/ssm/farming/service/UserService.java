package com.ssm.farming.service;

import com.ssm.farming.pojo.User;

public interface UserService {
    /*
        登录时匹配用户名和密码
     */
    User checkLogin(String userName, String userPassword);
}
