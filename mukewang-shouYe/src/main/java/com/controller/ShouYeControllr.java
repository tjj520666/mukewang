package com.controller;

import com.entity.CommentExample;
import com.entity.Mv;
import com.entity.MvExample;
import com.entity.Teacher;
import com.service.ShouYeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ShouYeControllr {

    @Autowired
    private ShouYeService shouYeService;


    //教师详情
    @RequestMapping("laoshi")
    public String getLaoShi(Model model,Integer teacherId){
        System.out.println("来了！");
        Teacher teacher = shouYeService.selectId(teacherId);
        MvExample mvExample=new MvExample();
        MvExample.Criteria criteria = mvExample.createCriteria();
        criteria.andMvTeacheridEqualTo(teacherId);
        List<Mv> mvList = shouYeService.selectListMv(mvExample);
        model.addAttribute("teacher",teacher);
        model.addAttribute("mvList",mvList);
        return  "shouye/teacher";
    }


}
