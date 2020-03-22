package com.ssm.farming.controller;

import com.ssm.farming.mapper.ArticleMapper;
import com.ssm.farming.mapper.ExpertMapper;
import com.ssm.farming.mapper.UserMapper;
import com.ssm.farming.pojo.Article;
import com.ssm.farming.pojo.ArticleExample;
import com.ssm.farming.pojo.User;
import com.ssm.farming.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    ExpertMapper expertMapper;

    @Autowired
    ArticleService articleService;

    @RequestMapping("listAllArticles")
    public String listAll(Model model){
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().getAllCriteria();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        model.addAttribute("articles",articles);
        return "listArticles";
    }

    @RequestMapping("/addArticle")
    public String addUser(Article article, Model model){
        // 添加文章
        articleMapper.insert(article);
        // 根据专家id列出专家写的文章
        System.out.println(article.getExpertId());
        return "redirect:listArticleByExpertId/"+article.getExpertId();
    }

    @RequestMapping("/listArticleByExpertId/{id}")
    public ModelAndView listArticleById(@PathVariable("id") Integer id, Model model){
        ModelAndView mv = new ModelAndView();
        // 根据专家id列出专家写的文章
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andExpertIdEqualTo(id);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        model.addAttribute("articlesById",articles);
        User user = articleService.selectUserByArticle(id);
        model.addAttribute("user",user);
        model.addAttribute("expertId",id);
        mv.setViewName("expert_home");
        return mv;
    }

    @RequestMapping("/deleteArticle/{id}")
    public String deleteArticle(@PathVariable("id") Integer id){
        Article article = articleMapper.selectByPrimaryKey(id);
        Integer expertId = article.getExpertId();
        // 删除文章
        articleMapper.deleteByPrimaryKey(id);
        return "redirect:/article/listArticleByExpertId/"+expertId;
    }


}
