package com.controller;

import com.entity.Comment;
import com.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClassController {

    @Autowired
    ClassService claser;
//    @RequestMapping("/toClass")
//    public String toClass(Map map){
//        System.out.println(123);
//        List<Comment> list=claser.getPing();
//        Map<Comment,Comment> ma=new HashMap();
//        for (Comment con:list
//                ) {
//            ma.put(con,claser.getHui(con.getCommentUid()).get(0));
//        }
//        map.put("comment",ma);
//        map.put("user",claser.getUserPing());
//        map.put("jiuyeban",claser.getFindMv(101,5));
//        return  "employmentClass/employmentClass";
//    }
//
//    @RequestMapping("/toClassInfo")
//    public String toClassInfo(Map map,Integer mvid){
//        map.put("mv",claser.getMvInfo(mvid));
//        return  "employmentClass/classinfo";
//    }

}
