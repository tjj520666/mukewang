package com.controllr;

import com.entity.Article;
import com.entity.Users;
import com.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class DiscussionControllr {

    @Autowired
    private DiscussionService discussionService;

    @RequestMapping("/shouji")
    public String getShouJi(Model model)throws
    Exception{
        List<Article> articles = discussionService.selectAll();
        System.out.println(articles);
        for(int i=0;i<articles.size();i++){
            DateFormat dateFormat=new SimpleDateFormat("MM-dd");
            String time=dateFormat.format(articles.get(i).getArticleTime());
            articles.get(i).setArticleTime(dateFormat.parse(time));
        }
        model.addAttribute("shouji",articles);
        return "discussion/RainPage";
    }

    @RequestMapping("/shoujiId")
    public String getShoujiId(Model model,Integer articleId,Integer articleUid)throws Exception{
        Article article = discussionService.ArQueryAll(articleId);
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String time=dateFormat.format(article.getArticleTime());
        article.setArticleTime(dateFormat.parse(time));
        Users users = discussionService.selectId(articleUid);
        model.addAttribute("article",article);
        model.addAttribute("users",users);
        return "discussion/Rain";
    }

}
