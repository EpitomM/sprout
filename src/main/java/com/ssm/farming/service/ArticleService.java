package com.ssm.farming.service;

import com.ssm.farming.pojo.Article;
import com.ssm.farming.pojo.User;

import java.util.List;

public interface ArticleService {

    /**
     * 根据专家 id 列出文章
     * @param id
     * @return
     */
    List<Article> selectByExpertId(Integer id);

    /**
     * 根据Article的expert_id查找User
     */
    User selectUserByArticle(Integer id);
}
