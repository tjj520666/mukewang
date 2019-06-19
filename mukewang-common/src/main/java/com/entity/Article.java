package com.entity;

import java.util.Date;

public class Article {
    private Integer articleId;

    private String articleTitle;

    private Integer articleUid;

    private Integer articleLikenum;

    private String articleImage;

    private Date articleTime;

    private Integer articlePersonnum;

    private String articleContent;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleUid() {
        return articleUid;
    }

    public void setArticleUid(Integer articleUid) {
        this.articleUid = articleUid;
    }

    public Integer getArticleLikenum() {
        return articleLikenum;
    }

    public void setArticleLikenum(Integer articleLikenum) {
        this.articleLikenum = articleLikenum;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage == null ? null : articleImage.trim();
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public Integer getArticlePersonnum() {
        return articlePersonnum;
    }

    public void setArticlePersonnum(Integer articlePersonnum) {
        this.articlePersonnum = articlePersonnum;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}