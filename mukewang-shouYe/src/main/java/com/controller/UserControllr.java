package com.controller;

import com.alicom.dysms.api.SmsDemo;
import com.aliyuncs.exceptions.ClientException;
import com.entity.Users;
import com.entity.UsersExample;
import com.service.IUsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.Random;

@RestController
public class UserControllr {

    @Autowired
    private IUsersService iUsersService;

    int num ;//短信验证码。

    @RequestMapping(value = "/loging")
    public void login(HttpServletRequest request , HttpServletResponse response, Users users) throws Exception{

        System.out.println ("----------登陆！！");
        PrintWriter out = response.getWriter ();

        UsersExample usersExample = new UsersExample ();
        UsersExample.Criteria criteria = usersExample.createCriteria ();

        criteria.andUserPasswordEqualTo (EncoderByMd5(users.getUserPassword ()));
        criteria.andUserPhoneEqualTo (users.getUserPhone ());

        boolean rs = false;

        Users uu = iUsersService.selectBylogin (usersExample);
        System.out.println (uu);
        System.out.println (uu.getPosition ());
        request.getSession ().setAttribute ("users",uu);

        if(uu !=null) {
            rs = true;
        }

        out.print(rs);
        out.close ();
        out.flush ();

    }

    @RequestMapping(value = "/verify")
    public void verify(HttpServletRequest request, HttpServletResponse response,String userYzm)
                    throws Exception {

        System.out.println("验证码操作种~~~··");

        PrintWriter out = response.getWriter ();
        HttpSession session = request.getSession();

        String yzm = (String) session.getAttribute ("randCheckCode");

        Boolean rs = false ;
        System.out.println(yzm);
        System.out.println(userYzm);
        if(yzm.equalsIgnoreCase (userYzm)){

            rs = true;

        }

        out.print (rs);
        out.flush ();
        out.close ();
    }

    @RequestMapping(value = "/smsVerify")
    public boolean smsVerify(int num){
        boolean rs = false;
        if(num == this.num){
            rs = true;
        }
        return rs;
    }

    @RequestMapping(value = "findPhone")
    public boolean findPhone(String phone){

        System.out.println("判断是否注册！！！");

        UsersExample usersExample = new UsersExample ();
        UsersExample.Criteria criteria = usersExample.createCriteria ();
        criteria.andUserPhoneEqualTo (phone);

        boolean rs = false;

        if(iUsersService.selectBylogin (usersExample) != null){
            rs = true;
        }
        return rs;
    }

    @RequestMapping(value = "/userAdd")
    public String userAdd(HttpServletRequest request , Users users , int num){

        System.out.println ("注册操作—-----—----");

        System.out.println (users.getUserPassword ());
        System.out.println(num);
        String method = "";
        if (this.num == num) {
            String[] users_name = {"小袁", "码农", "菜鸟", "小袁码", "小袁码1", "小袁码2", "小袁码3", "小袁码4", "小袁码5", "小袁码6"};
            String[] users_image = {"https://mukewang.oss-cn-hangzhou.aliyuncs.com/image/user/20170622131955_h4eZS.thumb.700_0.jpeg","https://mukewang.oss-cn-hangzhou.aliyuncs.com/image/user/d833c895d143ad4bd74bac3f85025aafa50f06e3.jpg","https://mukewang.oss-cn-hangzhou.aliyuncs.com/image/user/u%3D1540948915%2C1480219589%26fm%3D27%26gp%3D0.jpg","https://mukewang.oss-cn-hangzhou.aliyuncs.com/image/user/u%3D1540948915%2C1480219589%26fm%3D27%26gp%3D0.jpg","https://mukewang.oss-cn-hangzhou.aliyuncs.com/image/user/u%3D1540948915%2C1480219589%26fm%3D27%26gp%3D0.jpg"};
            Random rand = new Random ();
            int random = rand.nextInt (10);
            int image = rand.nextInt (5);
            users.setUserName (users_name[random]);
            users.setUserHeadimage (users_image[image]);
            users.setUserSex ("男");
            System.out.println (users.getUserPhone ());
            System.out.println (users.getUserName ());
            try{
                users.setUserPassword (EncoderByMd5(users.getUserPassword ()));
            }catch(Exception e){
                e.printStackTrace ();
            }
            if (iUsersService.insert (users) > 0) {
                UsersExample usersExample = new UsersExample ();
                UsersExample.Criteria criteria = usersExample.createCriteria ();
                criteria.andUserPhoneEqualTo (users.getUserPhone ());
                request.getSession().setAttribute ("users",iUsersService.selectBylogin (usersExample));
                method = "注册成功！！";
            } else {
                method = "注册失败！！";
            }
        } else {
            method = "验证码错误！！！";
        }
        System.out.println(method);
        return method;
    }


    public String EncoderByMd5(String str) throws Exception{
        System.out.println("MD5加密");
        MessageDigest messageDigest = MessageDigest.getInstance ("MD5");
        BASE64Encoder base64Decoder = new BASE64Encoder ();
        String nwstr = base64Decoder.encode (messageDigest.digest (str.getBytes ("utf-8")));
        return nwstr;
    }

    @RequestMapping("/smsYzm")
    public  int smsYzm(String phone) throws ClientException, InterruptedException {
        System.out.println("发送短信验证~~~~ : " + phone);
        num = (int)(1000 + Math.random () * 9999);
        String numString = String.valueOf (num);
        if(numString.length () > 4){
            numString = numString.substring (0,4);
            num = Integer.parseInt (numString);
        }
        SmsDemo.run (phone,num);
        System.out.println(num);
        return num;
    }

    @RequestMapping("/sms")
    public Object sms(String phone) throws Exception{

        System.out.println("发送短信验证~~~~ : " + phone);
        num = (int)(1000 + Math.random () * 9999);
        String numString = String.valueOf (num);
        if(numString.length () > 4){
            numString = numString.substring (0,4);
            num = Integer.parseInt (numString);
        }
        String isok = "yes";
        System.out.println(num);
        if(SmsDemo.run (phone,num)){
        isok = "yes";
        }
        return isok;
    }

    @RequestMapping("/loginByPhone")
    public boolean loginByPhone(HttpServletRequest request,String phone){

        UsersExample usersExample = new UsersExample ();
        UsersExample.Criteria criteria = usersExample.createCriteria ();
        criteria.andUserPhoneEqualTo (phone);
        Users uu =iUsersService.selectBylogin (usersExample);
        boolean rs = false;
        if(uu != null){
            rs = true;
            request.getSession ().setAttribute ("users",uu);
        }
        return rs;
    }

    @RequestMapping(value = "/testSms")
    public String testSms(){


        return "";
    }


}
