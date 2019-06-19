package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Recently {

    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;//时间

    private String mvImage;//图片路径

    private String mvName;//mv名称

    private String upgrading;//更新状态

    private Integer thenstudy;//已学

    private Integer sessionTime;//用时

    private Integer note;//笔记

    private Integer code;//代码

    private Integer quiz;//问答

    private Integer classify;//分类

    private Integer userId;//用户id

    private Integer mvType;

    public Integer getMvType() {
        return mvType;
    }

    public void setMvType(Integer mvType) {
        this.mvType = mvType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMvImage() {
        return mvImage;
    }

    public void setMvImage(String mvImage) {
        this.mvImage = mvImage;
    }

    public String getMvName() {
        return mvName;
    }

    public void setMvName(String mvName) {
        this.mvName = mvName;
    }

    public String getUpgrading() {
        return upgrading;
    }

    public void setUpgrading(String upDate) {
        this.upgrading = upDate;
    }

    public Integer getThenstudy() {
        return thenstudy;
    }

    public void setThenstudy(Integer thenstudy) {
        this.thenstudy = thenstudy;
    }

    public Integer getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Integer sessionTime) {
        this.sessionTime = sessionTime;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getQuiz() {
        return quiz;
    }

    public void setQuiz(Integer quiz) {
        this.quiz = quiz;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Recently{" +
                "id=" + id +
                ", time=" + time +
                ", mvImage='" + mvImage + '\'' +
                ", mvName='" + mvName + '\'' +
                ", upDate='" + upgrading + '\'' +
                ", thenstudy=" + thenstudy +
                ", sessionTime=" + sessionTime +
                ", note=" + note +
                ", code=" + code +
                ", quiz=" + quiz +
                ", classify=" + classify +
                ", userId=" + userId +
                ", mvType=" + mvType +
                '}';
    }
}
