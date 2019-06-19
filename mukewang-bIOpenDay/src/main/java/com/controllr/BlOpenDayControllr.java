package com.controllr;

import com.entity.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.service.BlOpenDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BlOpenDayControllr {

    @Autowired
    private BlOpenDayService blOpenDayService;

    //免费课程首页
    @RequestMapping("/fenye")
    public String fenYe(Model model, @RequestParam(value = "index", defaultValue = "1") Integer index) {
        System.out.println(">>>>>>>>>>>>>>---进入首页，分页");
        Page<Mv> page = PageHelper.startPage(index, 10); //当前页:显示条数
        List<Mv> mv = blOpenDayService.getMvm(1);
        model.addAttribute("mvM", mv);
        model.addAttribute("index", page.getPageNum());
        model.addAttribute("total", page.getPages());
        model.addAttribute("mvCategorys", blOpenDayService.getMvCategorys());
        model.addAttribute("mvdifficulty", blOpenDayService.getDifficulty());
        return "blOpenDay/FreeClassesPage";
    }

    //按方向，分类，难度查询
    @RequestMapping("/MFquery")
    public String MFquery(Model model, @RequestParam(required = false) Integer categoryId, @RequestParam(required = false) Integer difficultyId) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>---进入分类查询");
        if (categoryId!=null){
        List<MvCategory> list=blOpenDayService.queryMvCategorys(categoryId);
        List<Mv> listMv=blOpenDayService.queryMvm(categoryId,null);
        model.addAttribute("mvCategorys",list);
        model.addAttribute("mvM", listMv);
        model.addAttribute("mvdifficulty", blOpenDayService.getDifficulty());
        }else if (difficultyId!=null){
            List<Difficulty> difficultyList=blOpenDayService.selectByExampleid(difficultyId);
            List<Mv> mvList=blOpenDayService.queryDiff(difficultyId);
            model.addAttribute("mvCategorys",blOpenDayService.getMvCategorys());
            model.addAttribute("mvM", mvList);
            model.addAttribute("mvdifficulty",difficultyList);
        }else {
//            List<Mv> mv = blOpenDayService.getMvm(1);
            model.addAttribute("mvM", blOpenDayService.getMvm(1));
            model.addAttribute("mvCategorys", blOpenDayService.getMvCategorys());
            model.addAttribute("mvdifficulty", blOpenDayService.getDifficulty());
        }
        return "blOpenDay/FreeClassesPage";
}
    @RequestMapping("/MFqueryJi")
    public String MFqueryJi(Model model, @RequestParam(required = false) Integer categoryId, @RequestParam(required = false) Integer difficultyId,@RequestParam(required = false) Integer categoryParentid){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>---进入分类查询2");
        System.out.println(">>>>>>>>>>>>>"+categoryId+">>>>>>>>"+categoryParentid+">>>>>>>>>>"+difficultyId);
        if (categoryId!=null) {
            List<MvCategory> list = blOpenDayService.queryMvCategorysT3(categoryId, categoryParentid);
        difficultyId=1;
            if (categoryId != null || difficultyId != null) {
                List<Mv> listMv = blOpenDayService.queryMvmType3(categoryId, difficultyId);
                model.addAttribute("mvM", listMv);
            } else {
                List<Mv> listMv = blOpenDayService.queryMvmType3(categoryId, null);
                model.addAttribute("mvM", listMv);
            }
            model.addAttribute("mvCategorys", list);
            model.addAttribute("mvdifficulty", blOpenDayService.getDifficulty());
        }else {
            model.addAttribute("mvM", blOpenDayService.getMvm(1));
            model.addAttribute("mvCategorys", blOpenDayService.getMvCategorys());
            model.addAttribute("mvdifficulty", blOpenDayService.getDifficulty());
        }
        return "blOpenDay/FreeClassesPage";
    }


    //视频的单个展示
    @RequestMapping("/freeclaaes")
    public String freeClasses(Map<String, Object> map, Integer mvId) {
        System.out.println(">>>>>>>>>>>>>>>>>>---进入单个展示");
        Mv mv = blOpenDayService.queryMvmId(mvId);
        CommentExample commentExample=new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andCommentMvidEqualTo(mvId);
        criteria.andCommentTypeNotEqualTo(2);
        List<Comment> comments = blOpenDayService.commentList(commentExample);
        for (int i=0;i<comments.size();i++){
            CommentExample commentExample2=new CommentExample();
            CommentExample.Criteria criteria1 = commentExample2.createCriteria();
            criteria1.andCommentTypeEqualTo(2);
            criteria1.andCommentCidEqualTo(comments.get(i).getCommentId());
            List<Comment> comments1 = blOpenDayService.commentList(commentExample2);
            comments.get(i).setComment(comments1);
        }
        List<Mv> listmv = blOpenDayService.getMvm(1);
        map.put("listmv", listmv);
        map.put("pl",comments);
        map.put("mvM",mv);
        return "blOpenDay/FreeClasses";
    }

//    视频播放(最近的浏览)
    @RequestMapping("/infoId")
    public String mvInfo(HttpSession session,Map<String, Object> map, Model model, Integer mvinfoId, Integer mvId) {
        System.out.println(">>>>>>>>>>>>>>>>---视频播放");
        Users users=(Users) session.getAttribute("users");
        Mvinfo mvinfo = blOpenDayService.selectById(mvinfoId);
        Mv mv = blOpenDayService.queryMvmId(mvId);
        //最近浏览
        Recently recently=new Recently();
        RecentlyClassify recentlyclassify=new RecentlyClassify();

        recently.setTime(new Date());
        recently.setMvImage(mv.getMvImage());
        recently.setMvName(mv.getMvName());
        recently.setUpgrading(mvinfo.getMvinfoName());
        recently.setThenstudy(0);
        recently.setSessionTime(0);
        recently.setNote(0);
        recently.setCode(0);
        recently.setQuiz(0);
        recently.setClassify(mv.getMvType3id());
        recently.setUserId(users.getUserId());//users.getUserId();
        recently.setMvType(0);


        recentlyclassify.setClassifyId(mv.getMvType3id());
        recentlyclassify.setClassifyName(null);
        recentlyclassify.setUserId(users.getUserId());//users.getUserId();
        recentlyclassify.setmvType(0);

//        int num=blOpenDayService.insertRe(recently);
//        int num1=blOpenDayService.insertRecen(recentlyclassify);

        model.addAttribute("mvinfo", mvinfo);
        map.put("zjMV", mv);
        return "Mv/Mv";
    }

//    视频播放页面章节评论
    @ResponseBody
    @RequestMapping("/insertcomment")
    public Object insertComment(HttpSession session,String commentContent, String commentSectiontitle, Integer commentSectionid, Integer commentMvid,Integer commentNumber) {
        System.out.println(">>>>>>>>>>>>>>>>>---发布评论");
        Map<String,Object> map =new HashMap<String,Object>();
        Users users=(Users) session.getAttribute("users");
        Comment comment =new Comment();
        comment.setCommentUid(null);
        comment.setCommentUname(null);
        comment.setCommentTouid(1);//;
        comment.setCommentCid(null);
        comment.setCommentContent(commentContent);
        comment.setCommentSectiontitle(commentSectiontitle);
        comment.setCommentSectionid(commentSectionid);
        comment.setCommentTime( new Date());
        comment.setCommentMvid(commentMvid);
        comment.setCommentNumber(commentNumber);
        comment.setCommentType(1);
        int num = blOpenDayService.insertComment(comment);
        Users users1=blOpenDayService.selectByid(2);
        map.put("num",num);
        map.put("comment",comment);
        map.put("users1",users1);
        return map;
    }

    //视频详情页面查看评论与回复
    @ResponseBody
    @RequestMapping("/insertRelpy")
    public Object insertRelpy(HttpSession session,String commentContent,Integer commentMvid,Integer commentCid,Integer commentTouid){
        System.out.println(">>>>>>>>>>>>>>>>>---回复评论");
        Map<String,Object> map =new HashMap<String,Object>();
        Users users=(Users) session.getAttribute("users");
        Comment comment =new Comment();
        comment.setCommentUid(3);//users.getUserId()
        comment.setCommentUname("admin");//users.getUserName()
        comment.setCommentTouid(commentTouid);
        comment.setCommentCid(commentCid);
        comment.setCommentContent(commentContent);
        comment.setCommentSectiontitle(null);
        comment.setCommentSectionid(null);
        comment.setCommentTime( new Date());
        comment.setCommentMvid(commentMvid);
        comment.setCommentNumber(0);
        comment.setCommentType(2);
        int num = blOpenDayService.insertComment(comment);
        Users users1=blOpenDayService.selectByid(commentTouid);
        map.put("num",num);
        map.put("comment",comment);
        map.put("users1",users1);
        System.out.println(users1.getUserName());
        return map;
    }

    //验证码
    @ResponseBody
    @RequestMapping("/yzm")
    public boolean YZM(HttpServletRequest request,String indeityCode){
        System.out.println(">>>>>>>>>>>>--进入验证");
        boolean falg=false;
        String yzm = (String) request.getSession().getAttribute("randCheckCode");
        System.out.print(yzm);
        if (indeityCode.equals(yzm)){
            falg=true;
        }
        return falg;
    }

    @ResponseBody
    @RequestMapping("/inCollect")
    public Integer getInCollect(HttpSession session,Integer collectMvid){
        Users users=(Users) session.getAttribute("users");
        Collect collect=new Collect();
        collect.setCollectUid(1);//users.getUserId()
        collect.setCollectMvid(collectMvid);
        collect.setCollectCreatetime(new Date());
        int num=blOpenDayService.insertCollect(collect);
        return  num;
    }

}
