package com.service;

import com.dao.UsersMapper;
import com.entity.Users;
import com.entity.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UsersMapper usersMapper;


    //用户登陆
    public Users Login(Users users){
        UsersExample usersExample=new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUserPasswordEqualTo(users.getUserPassword());
        criteria.andUserNameEqualTo(users.getUserName());
      List<Users> userList=usersMapper.selectByExample(usersExample);
      if (userList.size()>0){
          return  userList.get(0);
      }else{
          return null;
      }

    }

    //查询全部用户信息
    public List<Users> selectAllUser(){
        return usersMapper.selectByExample(null);
    }


    //id查用户
    public Users selectIdUser(Integer id){
        return usersMapper.selectByPrimaryKey(id);
    }


    //新增用户
    public int addUsers(Users user){
        return usersMapper.insert(user);
    }

    //删除用户
    public  void delUser(Integer id){
        usersMapper.deleteByPrimaryKey(id);
    }

    //批量删除
    public void deleteBatch(List<Integer> ids) {
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria=example.createCriteria();
        criteria.andUserIdIn(ids);
        usersMapper.deleteByExample(example);
    }

    //修改用户
    public  void updateUser(Users user){
        usersMapper.updateByPrimaryKeySelective(user);
    }



}
