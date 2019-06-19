package com.service;

import com.dao.*;
import com.entity.*;
import com.mukewangelasticsearch.Config.Elasticsearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {
//    @Autowired
//    Elasticsearch elasticsearch;

    @Autowired
    MvMapper mvser;

    @Autowired
    CommentMapper cos;



    public List<Mv> getFindMv(Integer id,Integer number){
        return  mvser.selectByMvCateId(id,number);
    }

    public Mv getMvInfo(Integer id){
        return  mvser.selectByPrimaryKey(id);
    }



    public List<Comment> getUserPing(){
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentMvidEqualTo(101);
        criteria.andCommentTypeEqualTo(2);
        return cos.selectByExample(example);
    }

    public List<Comment> getPing(){
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentMvidEqualTo(101);
        criteria.andCommentTypeEqualTo(0);
        return cos.selectByExample(example);
    }

    public List<Comment> getHui(Integer id){
        CommentExample example=new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andCommentTouidEqualTo(id);
        criteria.andCommentMvidEqualTo(101);
        criteria.andCommentTypeEqualTo(1);
        return cos.selectByExample(example);
    }
}
