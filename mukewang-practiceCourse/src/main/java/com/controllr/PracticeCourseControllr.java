package com.controllr;

import com.entity.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.PracticeCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SuppressWarnings("all")
@Controller
public class PracticeCourseControllr {

    @Autowired
    private PracticeCourseService practiceCourseService;

    @RequestMapping("/practiceCourseSY")
    public String practiceCourseSY(Model model, @RequestParam(value = "index", defaultValue = "1")Integer index){
        System.out.println(">>>>>>>>>>>>>>---进入首页，分页");
        model.addAttribute("mvCat",practiceCourseService.getMvCategorys());
        Page<Mv> page= PageHelper.startPage(index,10); //当前页:显示条数
        List<Mv> mv=  practiceCourseService.getMvm(2);
        model.addAttribute("mvAll",mv);
        model.addAttribute("index",page.getPageNum());
        model.addAttribute("total",page.getPages());
        return "practiceCourse/ActualCombatPage";
    }

    @RequestMapping("/pcMvType")
    public String getPcMvType(Model model, @RequestParam(required = false) Integer categoryId){
        if (categoryId!=null){
        List<MvCategory> list=practiceCourseService.queryMvCategorys(categoryId);
        List<Mv> listMv=practiceCourseService.queryMvm(categoryId,null);
        model.addAttribute("mvCat",list);
        model.addAttribute("mvAll", listMv);
        }else {
            model.addAttribute("mvAll", practiceCourseService.getMvm(2));
            model.addAttribute("mvCat", practiceCourseService.getMvCategorys());
        }
        return "practiceCourse/ActualCombatPage";
    }

    @RequestMapping("/pcMvTypeJi")
    public String getpcMvTypeJi(Model model, @RequestParam(required = false) Integer categoryId,@RequestParam(required = false) Integer categoryParentid){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>---进入分类查询2");
        System.out.println(">>>>>>>>>>>>>"+categoryId+">>>>>>>>"+categoryParentid);
        if (categoryId!=null) {
            List<MvCategory> list = practiceCourseService.queryMvCategorysT3(categoryId, categoryParentid);
            List<Mv> listMv = practiceCourseService.queryMvmType3(categoryId, null);
            model.addAttribute("mvAll", listMv);
            model.addAttribute("mvCat", list);
        }else {
            model.addAttribute("mvAll", practiceCourseService.getMvm(2));
            model.addAttribute("mvCat", practiceCourseService.getMvCategorys());
        }
        return "practiceCourse/ActualCombatPage";
    }


    @RequestMapping("/actualcombat")
    public String freeClasses(Map<String,Object> map, Integer mvId){
        System.out.println(">>>>>>>>>>>>>>>>>>---进入单个展示");
        Mv mv=practiceCourseService.queryMvmId(mvId);
        CommentExample commentExample=new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andCommentMvidEqualTo(mvId);
        criteria.andCommentTypeNotEqualTo(2);
        List<Comment> comments = practiceCourseService.commentList(commentExample);
        for (int i=0;i<comments.size();i++){
            CommentExample commentExample2=new CommentExample();
            CommentExample.Criteria criteria1 = commentExample2.createCriteria();
            criteria1.andCommentTypeEqualTo(2);
            criteria1.andCommentCidEqualTo(comments.get(i).getCommentId());
            List<Comment> comments1 = practiceCourseService.commentList(commentExample2);
            comments.get(i).setComment(comments1);
        }
        map.put("pl",comments);
        map.put("mvM",mv);
        return "practiceCourse/ActualCombat";
    }

    @RequestMapping("/infomv")
    public String InfoMv(HttpSession session,Map<String, Object> map, Model model, Integer mvinfoId, Integer mvId){
        System.out.println(">>>>>>>>>>>>>>>>---视频播放");
        Users users=(Users) session.getAttribute("users");
        Mvinfo info = practiceCourseService.selectById(mvinfoId);
        Mv mv = practiceCourseService.queryMvmId(mvId);

        Recently recently=new Recently();
        RecentlyClassify recentlyclassify=new RecentlyClassify();

        recently.setTime(new Date());
        recently.setMvImage(mv.getMvImage());
        recently.setMvName(mv.getMvName());
        recently.setUpgrading(info.getMvinfoName());
        recently.setThenstudy(0);
        recently.setSessionTime(0);
        recently.setNote(0);
        recently.setCode(0);
        recently.setQuiz(0);
        recently.setClassify(mv.getMvType3id());
        recently.setUserId(users.getUserId());//users.getUserId();
        recently.setMvType(1);


        recentlyclassify.setClassifyId(mv.getMvType3id());
        recentlyclassify.setClassifyName(null);
        recentlyclassify.setUserId(users.getUserId());//users.getUserId();
        recentlyclassify.setmvType(1);
//        int num=practiceCourseService.insertRe(recently);
//        int num1=practiceCourseService.insertRecen(recentlyclassify);

        model.addAttribute("mvinfo", info);
        map.put("zjMV", mv);
        return "Mv/Mv";
    }

    //添加购物车
    @RequestMapping("/insertShoop")
    @ResponseBody
    public Object insertShoop(HttpSession session, Integer mvId,Double mvPrice){
        Map<String,Object> map =new HashMap<String,Object>();
        Users users=(Users) session.getAttribute("users");
        Shoppingcart shoppingcart=new Shoppingcart();
        shoppingcart.setShoppingcartGid(1);
        shoppingcart.setShoppingcartUid(users.getUserId());//users.getUserId()
        shoppingcart.setShoppingcartMvid(mvId);
        shoppingcart.setShoppingcartMoney(mvPrice);
        int num=practiceCourseService.insertShopp(shoppingcart);
        map.put("num",num);
        map.put("shoppingcart",shoppingcart);
        return num>0?true:false;
    }

}
