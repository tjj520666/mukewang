package com.controllr;

import com.entity.*;
import com.service.UserBackgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class personalBackgroundControllr {

    @Autowired
    private UserBackgService userBackgService;

    @RequestMapping("/recentBrowse")
    public String recentBrowse(HttpServletRequest request,Integer id ,Map<String,Object> map){
        System.out.println ("免费课程·····！！");
        Users uu = (Users) request.getSession ().getAttribute ("users");
        show(uu, id,map);
        String method = "shizhan";
        if(id == 0){
            method = "dynamic2";
        }
        return "personalBackground/"+method;
    }

    //查询全部
    public void show(Users uu , int id ,Map<String,Object> map){
        Recently recently = new Recently ();
        recently.setUserId (uu.getUserId ());
        recently.setMvType (id);
        RecentlyClassify recentlyClassify = new RecentlyClassify ();
        recentlyClassify.setUserId (uu.getUserId ());
        recentlyClassify.setmvType (id);
        List<Recently> list = userBackgService.selectByUserAll (recently);
        List<RecentlyClassify> list2 = userBackgService.selectByAll (recentlyClassify);
        map.put ("recentList",list);
        map.put ("recentlyClassify",list2);
        System.out.println (list);
        System.out.println (list2);
    }

    @RequestMapping("/recentBrowseById")
    public String recentBrowseById(HttpServletRequest request,Map<String,Object> map,Integer ids,Integer id){
        System.out.println ("根据分类查询免费课程·····！！");
        Users uu = (Users) request.getSession ().getAttribute ("users");
        RecentlyClassify recentlyClassify = new RecentlyClassify ();
        Recently recently = new Recently ();
        recentlyClassify.setUserId (uu.getUserId ());
        recentlyClassify.setmvType (id);
        List<Recently> list = null;
        List<RecentlyClassify> list2 = userBackgService.selectByAll (recentlyClassify);
        recently.setMvType (id);
        recently.setUserId (uu.getUserId ());
        if(id != null){
            recently.setClassify (ids);
            list = userBackgService.selectByClassIgy (recently);
        } else {
            list = userBackgService.selectByUserAll (recently);
        }
        map.put ("recentList",list);
        map.put ("recentlyClassify",list2);
        boolean rs = false;
        if(list != null && list2 != null){
            rs = true;
        }
        System.out.println (list);
        System.out.println (list2);

        String method = "shizhan";
        if(id == 0){
            method = "dynamic2";
        }
        return "personalBackground/"+method;
    }


    @RequestMapping("/deleteRecently")
    public String deleteRecently(HttpServletRequest request,int id,Map<String,Object> map,Integer did,Integer classId){
        System.out.println("免费课程删除~~~");
        System.out.println (did);
        System.out.println (classId);
        Users uu = (Users) request.getSession ().getAttribute ("users");
        int num = userBackgService.deleteByRecentlyId(did);
        System.out.println (num);
        if( num > 0){
            Recently rr = new Recently ();
            rr.setUserId (uu.getUserId ());
            rr.setClassify (classId);
            List<Recently> list = userBackgService.selectByClassIgy (rr);
            if(list.size () == 0 ){
                System.out.println ("sssss");
                if(userBackgService.deleteByClassId (classId) > 0){
                    System.out.println ("成功！");
                }
            }
        }
        show (uu,id,map);
        return "personalBackground/dynamic2";
    }

    @RequestMapping("/updateYes")
    public String updateYes(){

        return "personalBackground/binding";
    }

    @RequestMapping("/AddressInfoAll")
    public String AddressInfoAll(HttpServletRequest request , Map<String,Object> map){
        Users uu = (Users) request.getSession ().getAttribute ("users");
        System.out.println (uu.getUserId ());
        addressInfoAllShow(map);
        addressShowAll(map,uu.getUserId ());
        return "/personalBackground/address";
    }

    @ResponseBody()
    @RequestMapping("/AddressAll")
    public boolean AddressAll(Address address){


        List<Address> list2 = userBackgService.selectByAddressAll (address.getAddressUid ());

        if(list2.size () == 0 ){
            address.setAddressIsDefault (1);
        }

        int num = userBackgService.insert (address);

        boolean rs = false;
        if(num > 0){
            rs = true;
        }

        return rs;
    }

    @RequestMapping("/allOrder")
    public String allOrder(HttpServletRequest request , Map<String,Object> map){

        System.out.println ("查询用户全部订单~~~");

        showOrderAll(request,map);
        map.put("isAll","ok");

        return "/personalBackground/myOrder";
    }

    public void showOrderAll(HttpServletRequest request , Map<String,Object> map){
        Users uu = (Users) request.getSession ().getAttribute ("users");

        List<Order> list = userBackgService.selectByOrderAll (uu.getUserId ());

        System.out.println ("list : " + list);
        map.put("order",list);
        int yes = userBackgService.selectByOrderIsYes ();
        int all= 0;
        if(list.size() != 0){
            all = userBackgService.selectByDetaCountAll ();
        }

        int no = userBackgService.selectByOrderIsNo ();

        System.out.println ("yes : " + yes);
        System.out.println ("no : " + no);
        System.out.println ("all : " + all);
        map.put("yes",yes);
        map.put("no",no);
        map.put ("all",all);
    }

    public void showDetaAll(List<Order> list,HttpServletRequest request , Map<String,Object> map){
        int yes = userBackgService.selectByOrderIsYes ();
        int all= 0;
        if(list.size() != 0){
            all = userBackgService.selectByDetaCountAll ();
        }

        int no = userBackgService.selectByOrderIsNo ();

        System.out.println ("yes : " + yes);
        System.out.println ("no : " + no);
        System.out.println ("all : " + all);
        map.put("yes",yes);
        map.put("no",no);
        map.put ("all",all);
    }

    @RequestMapping("/allOrderYes")
    public String allOrderYes(HttpServletRequest request , Map<String,Object> map){

        System.out.println ("已完成");

        Users uu = (Users) request.getSession ().getAttribute ("users");

        List<Order> list = userBackgService.selectByOrderYes (uu.getUserId ());

        System.out.println ("list : " + list);
        showDetaAll(list,request, map);
        map.put("order",list);
        map.put ("isYse","ok");
        return "/personalBackground/myOrder";
    }


    @RequestMapping("/allOrderNo")
    public String allOrderNo(HttpServletRequest request , Map<String,Object> map){
        System.out.println ("未完成");
        Users uu = (Users) request.getSession ().getAttribute ("users");
        List<Order> list = userBackgService.selectByOrderNo (uu.getUserId ());
        System.out.println ("list : " + list);
        showDetaAll (list,request, map);
        map.put("order",list);
        map.put ("isNo","ok");
        return "/personalBackground/myOrder";
    }


    public void addressInfoAllShow(Map<String,Object> map){
        List<AddressInfo> list = userBackgService.selectByAllParentId ();
        map.put ("addressInfo",list);
        System.out.println (list);
    }

    public void addressShowAll(Map<String,Object> map,Integer id){
        List<Address> list2 = userBackgService.selectByAddressAll (id);
        map.put ("address",list2);
        System.out.println (list2);
    }

    @RequestMapping("/rainAll")
    public String rainAll(HttpServletRequest request , Map<String,Object> map){
        Users uu = (Users) request.getSession ().getAttribute ("users");
        List<Article> list = userBackgService.selectByRainAll (uu.getUserId ());
        System.out.println (list);
        if(list.size () > 0){
            map.put ("rain",list);
        }

        return "personalBackground/handwriting";
    }


    @RequestMapping("/jiuYeAll")
    public String jiuYeAll(HttpServletRequest request,Map<String,Object> map){

        Users uu = (Users) request.getSession ().getAttribute ("users");

        int id = uu.getUserId ();

        List<Purchase> list = userBackgService.selectByAllJiuYe (id);

        System.out.println ("list " + list);

        map.put ("jiuye",list);
        return "/personalBackground/jiuye";
    }

    /*@RequestMapping("/deleteOrder")
    public boolean deleteOrder(Integer id,Integer oid){
        int num = userBackgService.deleteDeta (id);
        boolean rs = false;
        if(num > 0){
            Order oo = userBackgService.selectByOrderKey (oid);
            if(oo.getDetails ().size () == 0){
                num  = userBackgService.deleteOrderId (oid);
                if(num >0){
                    rs = true;
                }
            }
        }
        return rs;
    }*/


}
