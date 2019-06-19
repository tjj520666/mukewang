package com.controller;

import com.entity.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //用户登录
    @ResponseBody
    @RequestMapping("login")
    public Object selectIdUser(Users users, HttpSession session){
        Users uu=userService.Login(users);
        if (uu!=null){
            session.setAttribute("user",uu);
        }
        return uu;
    }


    //查询所有用户信息
    @RequestMapping("getUser")
    public String selectAllUser(Model model,@RequestParam(value="pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,5);
       List<Users> usersList=userService.selectAllUser();
       //连续显示五页
        PageInfo pageInfo=new PageInfo(usersList,5);
       model.addAttribute("user",pageInfo);
        return "houtai/user";
    }

    //id查用户
    @ResponseBody
    @RequestMapping("getById")
    public Object selectIdUser(@RequestParam("id") Integer id){
       Users user=userService.selectIdUser(id);
       return user;
    }


    //新增用户
    @ResponseBody
    @RequestMapping("addUser")
    public Object addUser(Users user){
        if (user!=null){
            userService.addUsers(user);
            return  1;
        }
        return 2;
    }


    //用户删除
    @ResponseBody
    @RequestMapping("delUser")
    public  Object delUser(String ids){
        if (ids!=null&ids!=""){
            if (ids.contains("-")){
                List<Integer> del_ids=new ArrayList<Integer>();
                String[] str_ids=ids.split("-");
                for (String string :str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                userService.deleteBatch(del_ids);
                return 1;
            }else{
                int id=Integer.parseInt(ids);
                userService.delUser(id);
                return 1;
            }
        }

            return "";
    }



    //修改用户
    @ResponseBody
    @RequestMapping("updateUser")
    public Object updateUser(Users user){

        userService.updateUser(user);
        return  1;
    }


    @RequestMapping("out")
    public String out(HttpSession session){
        session.setMaxInactiveInterval(0);
        return  "houtai/login";
    }
}
