package com.entity;

public class RecentlyClassify {

    private Integer id;

    private Integer classifyId;

    private String classifyName;

    private Integer userId;

    private Integer mvType; //0 免费 1实战

    public Integer getmvType() {
        return mvType;
    }

    public void setmvType(Integer type) {
        this.mvType = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RecentlyClassify{" +
                "id=" + id +
                ", classifyId=" + classifyId +
                ", classifyName='" + classifyName + '\'' +
                ", userId=" + userId +
                ", type=" + mvType +
                '}';
    }
}
