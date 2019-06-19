package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.List;

public class Comment {
    private List<Comment> comment;

    private Date commentTime;

    private Integer commentId;

    private Integer commentUid;

    private String commentUname;

    private Integer commentTouid;

    private Users user;

    private Integer commentCid;

    private Integer commentMvid;

    private Integer commentSectionid;

    private String commentSectiontitle;

    private String commentContent;

    private Integer commentNumber;

    private Integer commentType;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentUid() {
        return commentUid;
    }

    public void setCommentUid(Integer commentUid) {
        this.commentUid = commentUid;
    }

    public String getCommentUname() {
        return commentUname;
    }

    public void setCommentUname(String commentUname) {
        this.commentUname = commentUname == null ? null : commentUname.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
    @JsonBackReference
    public List<Comment> getComment() {
        return comment;
    }
    @JsonBackReference
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public Integer getCommentTouid() {
        return commentTouid;
    }

    public void setCommentTouid(Integer commentTouid) {
        this.commentTouid = commentTouid;
    }

    public Integer getCommentCid() {
        return commentCid;
    }

    public void setCommentCid(Integer commentCid) {
        this.commentCid = commentCid;
    }
    @JsonBackReference
    public Users getUser() {
        return user;
    }
    @JsonBackReference
    public void setUser(Users user) {
        this.user = user;
    }

    public Integer getCommentMvid() {
        return commentMvid;
    }

    public void setCommentMvid(Integer commentMvid) {
        this.commentMvid = commentMvid;
    }

    public Integer getCommentSectionid() {
        return commentSectionid;
    }

    public void setCommentSectionid(Integer commentSectionid) {
        this.commentSectionid = commentSectionid;
    }

    public String getCommentSectiontitle() {
        return commentSectiontitle;
    }

    public void setCommentSectiontitle(String commentSectiontitle) {
        this.commentSectiontitle = commentSectiontitle == null ? null : commentSectiontitle.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }
}