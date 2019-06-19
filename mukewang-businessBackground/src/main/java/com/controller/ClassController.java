package com.controller;


import com.entity.MvCategory;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClassController {


    @Autowired
    private ClassService classService;

    //查询所有分类
    @RequestMapping("getClass")
    public String selectAllmvCaregory(Model model,@RequestParam(value = "pn",defaultValue ="1") Integer pn){
        PageHelper.startPage(pn,5);
        List<MvCategory> mvCategoryList=classService.selectAllmvCaregory();
        for (MvCategory mm:
        mvCategoryList) {
            System.out.println(mm);
        }
        System.out.println();
        PageInfo pageInfo=new PageInfo(mvCategoryList,5);
        model.addAttribute("class",pageInfo);
        return "houtai/class";
    }


    //分类删除
    @ResponseBody
    @RequestMapping("delClass")
    public  Object delClass(String ids){
        if (ids!=null&&ids!=""){
            if (ids.contains("-")){
                List<Integer> del_ids=new ArrayList<Integer>();
                String[] str_ids=ids.split("-");
                for (String string :str_ids) {
                    del_ids.add(Integer.parseInt(string));
                }
                classService.deleteBatch(del_ids);
                return 1;
            }else{
                int id=Integer.parseInt(ids);
                classService.delmvCaregory(id);
                return 1;
            }
        }
        return "";
    }


    //修改分类
    @ResponseBody
    @RequestMapping("updatemvCaregory")
    public Object updatemvCaregory(MvCategory mc){
        classService.updatemvCaregory(mc);
        return  1;
    }


    //查询单个
    @ResponseBody
    @RequestMapping("selectMvCategoryById")
    public  MvCategory selectMvCategoryById(Integer id){
        return  classService.selectMvCategoryById(id);
    }


    //添加分类
    @ResponseBody
    @RequestMapping("addMvCategory")
    public  void addMvCategory(MvCategory mc){
        System.out.println("mc = " + mc);
        classService.addMvCaregory(mc);

    }


    //查询分类
    @ResponseBody
    @RequestMapping("selectParents")
    public Object selectParents(@RequestParam(value = "parentId",defaultValue ="0")Integer parentId){
         return classService.selectParents(parentId);
    }


    //查询所有分类
    @ResponseBody
    @RequestMapping("selectAllClass")
    public  Object selectAllClass(){
        return  classService.selectAllmvCaregory();
    }
}
