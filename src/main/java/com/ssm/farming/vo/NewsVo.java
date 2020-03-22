package com.ssm.farming.vo;

import com.ssm.farming.pojo.News;

public class NewsVo extends News {

    // 新闻的作者名称
    private String name;
    private String office;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString()+"NewsVo{" +
                "name='" + name + '\'' +
                '}';
    }
}
