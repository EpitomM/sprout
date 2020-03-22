package com.ssm.farming.controller;

import com.ssm.farming.mapper.NewsMapper;
import com.ssm.farming.pojo.News;
import com.ssm.farming.pojo.NewsExample;
import com.ssm.farming.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsMapper newsMapper;
    
    @RequestMapping("/listNews")
    public String listAll(Model model){
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().getAllCriteria();
        List<News> news = newsMapper.selectByExample(newsExample);
        model.addAttribute("newsList",news);
        return "listAllNews";
    }

    @RequestMapping("/readMoreNews/{id}")
    public String listMore(Model model,@PathVariable("id") String id){
        NewsVo news = newsMapper.selectByPrimaryKey(Integer.parseInt(id));
        model.addAttribute("newsList",news);
        return "listNews";
    }

}
