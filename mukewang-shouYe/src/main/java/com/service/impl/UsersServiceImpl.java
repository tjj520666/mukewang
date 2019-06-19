package com.service.impl;

import com.dao.UsersMapper;
import com.entity.Users;
import com.entity.UsersExample;
import com.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements IUsersService {

    @Autowired
    private UsersMapper usersMapper;


    public Users selectBylogin(UsersExample example) {
        return usersMapper.selectBylogin (example);
    }

    public int insert(Users record) {
        return usersMapper.insert (record);
    }


}
