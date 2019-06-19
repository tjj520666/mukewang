package com.service;

import com.dao.*;
import com.entity.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mukewangelasticsearch.Config.Elasticsearch;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
@Service
public class MvCategroyService {
    @Autowired
    JestClient jestClient;
    @Autowired
    CommentMapper cos;
//    @Autowired
//    Elasticsearch elasticsearch;
    @Autowired
    MvCategoryMapper mvcate;
    @Autowired
    MvMapper mvser;
    @Autowired
    ArticleMapper art;
    @Autowired
    TeacherMapper teas;
    @Autowired
    CarouselMapper car;
    @Autowired
    UsersMapper user;
    public List<MvCategory> getFind(Integer id){
        MvCategoryExample example=new MvCategoryExample();
        MvCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryParentidEqualTo(id);
        return mvcate.selectByExample(example);
    }
    public List<Mv> getFindMv(Integer id,Integer number){
        return  mvser.selectByMvCateId(id,number);
    }
    public List<Carousel> getAllCar(){
        return  car.selectByExample(null);
    }
    public List<Article> getFindAct(Integer number){
        ArticleExample example=new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        criteria.andArticleIdBetween(1,number);
        return  art.selectByExample(example);
    }
    public List<Teacher> getTeas(){
        return teas.selectSome();
    }

    public List<Users> getUser(Integer number){
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdBetween(1,number);
        return  user.selectByExample(example);
    }


    public void getAll()throws Exception{
        List<Mv> mvs = mvser.selectByAll();
        for (Mv mv : mvs) {
            Index build = new Index.Builder(mv).index("mukewang").type("mv").build();
            jestClient.execute(build);
        }

    }

    public List<Mv> getFind(String name){
        List<Mv> mv=new ArrayList<>();
        String json="{\n" +
                "\t\"query\" : {\n" +
                "\t\t\"match\" : {\n" +
                "\t\t\t\"mvName\" : \""+name+"\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\t\n" +
                "}";

        System.out.println("json = " + json);
        Search build = new Search.Builder(json).addIndex("mukewang").addType("mv").build();
        SearchResult execute = null;
        try {
            execute = jestClient.execute(build);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<SearchResult.Hit<Mv, Void>> hits = execute.getHits(Mv.class);
        for(SearchResult.Hit<Mv, Void> hit: hits){
            Mv source = hit.source;
            mv.add(source);
        }
        return mv;
    }


//    public List<Mv> getFindMv(Integer id,Integer number){
//        return  mvser.selectByMvCateId(id,number);
//    }

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
