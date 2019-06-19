package com.service;

import com.dao.ArticleMapper;
import com.dao.UsersMapper;
import com.entity.Article;
import com.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private UsersMapper usersMapper;

    //全部文章
    public List<Article> selectAll(){return articleMapper.selectByExample(null);}

    //单个
    public Article ArQueryAll(Integer articleId){return  articleMapper.selectByPrimaryKey(articleId);}
    public Users selectId(Integer articleUid){return usersMapper.selectByPrimaryKey(articleUid);}

    public int addViewCount(Article article){return articleMapper.insert(article);}

}
