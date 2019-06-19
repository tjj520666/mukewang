package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

public class MvCategory {
    private Integer categoryId;

    private String categoryTitle;

    private List<Mv> mvs;
    @JsonBackReference
    public List<Mv> getMvs() {
        return mvs;
    }
    @JsonBackReference
    public void setMvs(List<Mv> mvs) {
        this.mvs = mvs;
    }

    private List<MvCategory> categories;
    @JsonBackReference
    public List<MvCategory> getCategories() {
        return categories;
    }
    @JsonBackReference
    public void setCategories(List<MvCategory> categories) {
        this.categories = categories;
    }

    private Integer categoryType;

    private Integer categoryParentid;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle == null ? null : categoryTitle.trim();
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getCategoryParentid() {
        return categoryParentid;
    }

    public void setCategoryParentid(Integer categoryParentid) {
        this.categoryParentid = categoryParentid;
    }
}