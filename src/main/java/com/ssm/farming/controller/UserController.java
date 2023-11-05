package com.ssm.farming.controller;

import com.ssm.farming.mapper.ArticleMapper;
import com.ssm.farming.mapper.NewsMapper;
import com.ssm.farming.mapper.ReporterMapper;
import com.ssm.farming.mapper.UserMapper;
import com.ssm.farming.pojo.*;
import com.ssm.farming.service.ArticleService;
import com.ssm.farming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    
    @Autowired
    ArticleMapper articleMapper;

    @Autowired
    NewsMapper newsMapper;

    @Autowired
    ReporterMapper reporterMapper;

    @Autowired
    ArticleService articleService;

    @RequestMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request, Model model)throws Exception{
        ModelAndView mv = new ModelAndView();

        // 参数校验。用户名或密码为空
        if (user == null || user.getName() == null || user.getPassword() == null) {
            return new ModelAndView("redirect:/index.html");
        }

        // 首页显示文章信息
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().getAllCriteria();
        List<Article> articles = articleMapper.selectByExample(articleExample);
        model.addAttribute("articles",articles);

        // 首页显示新闻信息
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().getAllCriteria();
        List<News> news = newsMapper.selectByExample(newsExample);
        model.addAttribute("newsList",news);

        // 登陆校验：根据用户名密码查询用户
        user = userService.checkLogin(user.getName(),user.getPassword());
        if(user != null){
            request.getSession().setAttribute("user",user);
            mv.addObject(user);
            // 农民
            if(user.getStatus() == 0){
                mv.setViewName("/home");
                //专家
            }else if(user.getStatus() == 1){
                //根据专家id列出文章
                List<Article> articlesById = articleService.selectByExpertId(user.getId());
                model.addAttribute("expertId",articlesById.get(0).getExpertId());
                model.addAttribute("articlesById",articlesById);
                // 将专家姓名传到前端
                model.addAttribute("user",user);
                System.out.println(user.getName());
                mv.setViewName("/expert_home");
                //卖家
            }else if(user.getStatus() == 2){
                mv.setViewName("/seller_home");
            } else if(user.getStatus() == 3){
                model.addAttribute("user",user);
                mv.setViewName("/reporter_home");
        }
            return mv;
        } else {
            // 用户名或密码错误
            return new ModelAndView("redirect:/index.html");
        }
    }

    @RequestMapping("/register")
    public String register(){
        return "redirect:/register.html";
    }

    @RequestMapping("/addUser")
    @Transactional
    public String addUser(User user){
        userMapper.insertSelective(user);
//        int i=5/0;
//        userMapper.insertSelective(user);
        return "redirect:/index.html";
    }
}
