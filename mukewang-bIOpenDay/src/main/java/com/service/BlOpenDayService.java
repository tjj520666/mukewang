package com.service;

import com.dao.*;
import com.entity.*;
import com.mukewangelasticsearch.Config.Elasticsearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
@Service
public class BlOpenDayService {
//    @Autowired
//    Elasticsearch elasticsearch;
    @Autowired
    private MvCategoryMapper mvCategoryMapper;
    @Autowired
    private DifficultyMapper difficultyMapper;
    @Autowired
    private MvMapper mvMapper;
    @Autowired
    private MvinfoMapper mvinfoMapper;
    @Autowired
    private SectionMapper sectionMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private  RecentlyMapper recentlyMapper;
    @Autowired
    private  RecentlyclassifyMapper recentlyclassifyMapper;
    @Autowired
    private CollectMapper collectMapper;


    //视频分类
    public List<MvCategory> getMvCategorys(){
      return mvCategoryMapper.selectByExample(null);
    }
    //难度
    public List<Difficulty> getDifficulty(){
        return difficultyMapper.selectByExample(null);
    }
    //mv全部
    public List<Mv> getMvm(Integer mvrs){
        MvExample mv=new MvExample();
        MvExample.Criteria criteria = mv.createCriteria();
        criteria.andMvRsEqualTo(mvrs);
        return mvMapper.selectByExample(mv);
    }

    //查询分类
    public List<MvCategory> queryMvCategorys(Integer categoryId){ return mvCategoryMapper.selectByExampleid(categoryId); }
    public List<MvCategory> queryMvCategorysT3(Integer categoryId,Integer categoryParentid){
       return mvCategoryMapper.selectByExampleId(categoryId,categoryParentid);
    }


    //查询mv
    public List<Mv> queryMvm(Integer categoryId,Integer mvDifficultyid){
       return mvMapper.selectByid(categoryId,mvDifficultyid);
    }
    public List<Mv> queryMvmType3(Integer mvType3id,Integer mvDifficultyid){
        return mvMapper.selectByIdType3(mvType3id,mvDifficultyid);
    }
    public List<Mv> queryDiff(Integer mvDifficultyid)
    {
       return mvMapper.selectByDiff(mvDifficultyid);
    }


    public Mv queryMvmId(Integer mvId){return  mvMapper.selectByPrimaryKey(mvId);}

    public Mvinfo selectById(Integer mvinfoId){
        return mvinfoMapper.selectByPrimaryKey(mvinfoId);
    }

    //发布评论
    public int insertComment(Comment comment){return commentMapper.insert(comment);}

    public List<Comment> commentList(CommentExample example){return commentMapper.selectByExample(example);}

    public Users selectByid(Integer userId ){
        return usersMapper.selectByPrimaryKey(userId);
    }

    public List<Difficulty> selectByExampleid(Integer difficultyId){return difficultyMapper.selectByExampleid(difficultyId);}

   //最近学习
    public int insertRe(Recently recently){return recentlyMapper.insert(recently);}
    //最近浏览
    public int insertRecen(RecentlyClassify recentlyclassify){return recentlyclassifyMapper.insert(recentlyclassify);}
    //收藏
    public int insertCollect(Collect collect){return  collectMapper.insert(collect);}



}
