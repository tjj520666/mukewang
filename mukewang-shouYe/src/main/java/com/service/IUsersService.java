package com.service;

import com.entity.Users;
import com.entity.UsersExample;

public interface IUsersService {


    Users selectBylogin(UsersExample example);

    int insert(Users record);

}
