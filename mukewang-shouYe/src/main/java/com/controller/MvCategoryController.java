package com.controller;

import com.entity.Comment;
import com.entity.Mv;
import com.entity.MvCategory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.MvCategroyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MvCategoryController {
    @Autowired
    MvCategroyService mvser;
    @RequestMapping("/toMain")
    public String toMain(Map map) throws Exception{

        List<MvCategory> find = mvser.getFind(0);
        for (MvCategory f: find
             ) {
            f.setMvs(mvser.getFindMv(f.getCategoryId(),2));
            List<MvCategory> find1 = mvser.getFind(f.getCategoryId());
            f.setCategories(find1);
            for (MvCategory f2: find1
                    ) {
                List<MvCategory> find2 = mvser.getFind(f2.getCategoryId());
                f2.setCategories(find2);

            }
        }
        mvser.getAll();
        map.put("jiuyeban",mvser.getFindMv(101,5));
        map.put("shizhan",mvser.getFindMv(94,5));
//        map.put("shizhan",mvser.getFindMv(94,5));
        map.put("xinshang",mvser.getFindMv(95,8));
        map.put("xinshou",mvser.getFindMv(96,10));
        map.put("jineng",mvser.getFindMv(97,10));
        map.put("qianyan",mvser.getFindMv(98,10));
        map.put("article",mvser.getFindAct(3));
        map.put("teacher",mvser.getTeas());
        map.put("Carousels",mvser.getAllCar());
        map.put("person",mvser.getUser(4));
        map.put("MvCategroy",find);
        return  "shouye/shouye";
    }

    @RequestMapping("/toClass")
    public String toClass(Map map){
        System.out.println(123);
        List<Comment> list=mvser.getPing();
        Map<Comment,Comment> ma=new HashMap();
        for (Comment con:list
                ) {
            ma.put(con,mvser.getHui(con.getCommentUid()).get(0));
        }
        map.put("comment",ma);
        map.put("user",mvser.getUserPing());
        map.put("jiuyeban",mvser.getFindMv(101,5));
        return  "employmentClass/employmentClass";
    }

    @RequestMapping("/toClassInfo")
    public String toClassInfo(Map map,Integer mvid){
        map.put("mv",mvser.getMvInfo(mvid));
        return  "employmentClass/classinfo";
    }


    //免费课程首页
    @RequestMapping("/search")
    public String selectFind(Map map, @RequestParam(value = "name") String name) {
        map.put("Mvs",mvser.getFind(name));
        return "shouye/search";
    }

}
