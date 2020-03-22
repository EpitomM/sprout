package com.ssm.farming.pojo;

import java.util.Date;

public class Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.expert_id
     *
     * @mbggenerated
     */
    private Integer expertId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.info_code
     *
     * @mbggenerated
     */
    private String infoCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.id
     *
     * @return the value of tb_article.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.id
     *
     * @param id the value for tb_article.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.title
     *
     * @return the value of tb_article.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.title
     *
     * @param title the value for tb_article.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.date
     *
     * @return the value of tb_article.date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.date
     *
     * @param date the value for tb_article.date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.source
     *
     * @return the value of tb_article.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.source
     *
     * @param source the value for tb_article.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.content
     *
     * @return the value of tb_article.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.content
     *
     * @param content the value for tb_article.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.expert_id
     *
     * @return the value of tb_article.expert_id
     *
     * @mbggenerated
     */
    public Integer getExpertId() {
        return expertId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.expert_id
     *
     * @param expertId the value for tb_article.expert_id
     *
     * @mbggenerated
     */
    public void setExpertId(Integer expertId) {
        this.expertId = expertId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.info_code
     *
     * @return the value of tb_article.info_code
     *
     * @mbggenerated
     */
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.info_code
     *
     * @param infoCode the value for tb_article.info_code
     *
     * @mbggenerated
     */
    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode == null ? null : infoCode.trim();
    }
}