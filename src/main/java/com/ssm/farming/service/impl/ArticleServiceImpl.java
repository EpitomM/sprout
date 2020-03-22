package com.ssm.farming.service.impl;

import com.ssm.farming.mapper.ArticleMapper;
import com.ssm.farming.pojo.Article;
import com.ssm.farming.pojo.ArticleExample;
import com.ssm.farming.pojo.User;
import com.ssm.farming.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    
    @Autowired
    ArticleMapper articleMapper;
    
    
    @Override
    public List<Article> selectByExpertId(Integer id) {
        List<Article> articles = articleMapper.selectArticleByUserId(id);
        return articles;
    }

    @Override
    public User selectUserByArticle(Integer id) {
        User user = articleMapper.selectUserByArticle(id);
        return user;
    }
}
