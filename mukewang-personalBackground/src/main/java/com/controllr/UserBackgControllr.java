package com.controllr;

import com.alicom.dysms.api.SmsDemo;
import com.entity.*;
import com.service.UserBackgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.util.List;

@RestController
public class UserBackgControllr {

    @Autowired
    private UserBackgService userBackgService;

    @RequestMapping("/userBackground")
    public String userBackground(HttpServletRequest request, Integer id) {
        Users uu = userBackgService.selectByPrimaryKey (id);
        String method = "";
        if(uu != null){
            method = "/personalBackground/Muke";
        } else {
            method = "首页连接····";
        }
        return method;
    }

    @RequestMapping(value = "/changePassword")
    public boolean changePassword(HttpServletRequest request ,String password,String newPassword) throws Exception {

            System.out.println("修改密码！！！");

            Users uu = (Users) request.getSession ().getAttribute ("users");
            boolean rs = false;

            if(uu.getUserPassword ().equals (MD5 (password))){
                uu.setUserPassword (MD5 (newPassword));
                if(userBackgService.updateByPrimaryKey (uu) > 0){
                    rs = true;
                }

            }

        return rs;
    }

    public String MD5(String password) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance ("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder ();
        String str = base64Encoder.encode (messageDigest.digest (password.getBytes ("UTF-8")));
        return str;
    }

    @RequestMapping(value = "/smsAmend")
    public int smsAmend(String phone) throws Exception{

        System.out.println("修改手机号码 短信验证~~~~");

        int num = (int)(1000 + Math.random () * 9999);
        String numString = String.valueOf (num);
        if(numString.length () > 4){
            numString = numString.substring (0,4);
            num = Integer.parseInt (numString);
        }

        System.out.println(num);
        SmsDemo.run (phone,num);

        return num;
    }


    @RequestMapping(value = "/upDatePhone")
    public boolean upDatePhone(HttpServletRequest request , String phone){

        System.out.println("修改手机号操作 ~ ~ ~ ~ ");

        Users uu = (Users) request.getSession().getAttribute ("users");
        uu.setUserPhone (phone);
        boolean rs = false;

        if(userBackgService.updateByPrimaryKey (uu) > 0){
            rs = true;
        }

        return rs ;

    }

    @RequestMapping(value = "/upDateUser")
    public boolean upDateUser(HttpServletRequest request , Users users){

        boolean rs = false;

        Users uu = (Users) request.getSession ().getAttribute ("users");
        uu.setUserName (users.getUserName ());
        uu.setUserSex (users.getUserSex ());
        uu.setUserSignature (users.getUserSignature ());
        uu.setUserPositionId (users.getUserPositionId ());

        if(userBackgService.updateByPrimaryKey (uu) > 0){
            rs = true;
            UsersExample usersExample = new UsersExample ();
            UsersExample.Criteria criteria = usersExample.createCriteria ();

            criteria.andUserPhoneEqualTo (uu.getUserPhone ());
            uu = userBackgService.selectBylogin (usersExample);
            request.getSession ().setAttribute ("users",uu);

        }

        return rs;
    }


    @RequestMapping("/AddressInfoId")
    public Object AddressInfoId(Integer id){
        List<AddressInfo> list = userBackgService.selectByIdSonId (id);
        return list;
    }

    @RequestMapping("/addressDelete")
    public boolean addressDelete(Integer id){

        System.out.println ("删除Address ~~~");
        boolean rs = false;

        if(userBackgService.deleteAddress (id) > 0){
            rs = true;
        }

        return rs;
    }


    @RequestMapping("/updateByAddress")
    public boolean updateByAddress(Address address){
        System.out.println ("修改操作~~~");

        boolean rs = false;

        System.out.println (address);

        if(userBackgService.updateByPrimaryKey (address) > 0){
            rs = true;
        }

        return rs;
    }

    @RequestMapping("/addressGetId")
    public Address addressGetId(Integer id){

        System.out.println ("查询单个 Address~~~");

        Address address = userBackgService.selectByAddressId (id);

        return address;
    }


    @RequestMapping("/addressIsDefault")
    public boolean addressIsDefault(Integer id){

        System.out.println ("更改 默认地址操作~~~");

        boolean rs = false;

        System.out.println (id);

        if(userBackgService.updateByDfault () > 0){
            int num = userBackgService.updateByIsDfaultId (id);
            System.out.println (num);
            if(num > 0){
                rs = true;
            }
        }

        return rs;
    }

    @RequestMapping("/show")
    public Object show(){
        List<Order> oo = userBackgService.selectByOrderAll (23);
        return oo;
    }

    @RequestMapping("/deleteOrder")
    public boolean deleteOrder(Integer id,Integer oid){
        System.out.println ("订单删除操作！！！");
        int num = userBackgService.deleteDeta (id);
        boolean rs = false;
        if(num > 0){
            Order oo = userBackgService.selectByOrderKey (oid);
            if(oo.getDetails ().size () == 0){
                userBackgService.deleteOrderId (oid);
            }
            rs = true;
        }
        return rs;
    }



   /* @RequestMapping("/recentBrowseById")
    public boolean recentBrowseById(HttpServletRequest request,Map<String,Object> map,Integer id){
        System.out.println ("根据分类查询免费课程·····！！");
        Users uu = (Users) request.getSession ().getAttribute ("users");
        RecentlyClassify recentlyClassify = new RecentlyClassify ();
        Recently recently = new Recently ();
        List<Recently> list = null;
        List<RecentlyClassify> list2 = null;
        if(id != null){
            recently.setClassify (id);
            recentlyClassify.setClassifyId (id);
            recently.setUserId (uu.getUserId ());
            recentlyClassify.setUserId (uu.getUserId ());
            list = userBackgService.selectByClassIgy (recently);
            list2 = userBackgService.selectByAllClassify (recentlyClassify);
        } else {
             list = userBackgService.selectByUserAll (uu.getUserId ());
             list2 = userBackgService.selectByAll (uu.getUserId ());
        }
        map.put ("recentList",list);
        map.put ("recentlyClassify",list2);
        boolean rs = false;
        if(list != null && list2 != null){
            rs = true;
        }
        System.out.println (list);
        System.out.println (list2);
        return rs;
    }*/


}
