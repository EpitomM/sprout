package com.ssm.farming.controller;

import com.ssm.farming.mapper.ReporterMapper;
import com.ssm.farming.mapper.UserMapper;
import com.ssm.farming.pojo.Reporter;
import com.ssm.farming.pojo.ReporterExample;
import com.ssm.farming.pojo.User;
import com.ssm.farming.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reporter")
public class ReporterController {

    @Autowired
    ReporterMapper reporterMapper;

    @Autowired
    UserMapper userMapper;
    
    @RequestMapping("/update")
    public String update(Reporter reporter,Model model){
        ReporterExample reporterExample = new ReporterExample();
        reporterExample.createCriteria().andUserIdEqualTo(reporter.getUserId());
        List<Reporter> reporters = reporterMapper.selectByExample(reporterExample);
        reporter.setId(reporters.get(0).getId());
        reporterMapper.updateByExample(reporter,reporterExample);
        // 跳转页面
        User user = userMapper.selectByPrimaryKey(reporter.getUserId());
        model.addAttribute("user",user);
        return "reporter_home";
    }


}
