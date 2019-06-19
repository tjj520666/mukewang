package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;
@JsonIgnoreProperties(value = "{section}")
public class Mvinfo implements Serializable {
    @JsonBackReference
    private List<Section>sectionList;

    private Integer mvinfoId;

    private String mvinfoName;
    private Double mvinfoTime;

    private String mvinfoMv;

    private Integer mvinfoSection;
    @JsonIgnore
    @JsonManagedReference
    @JsonBackReference
    private Section section;
    @JsonIgnore
    @JsonManagedReference
    @JsonBackReference
    public Section getSection() {
        return section;
    }
    @JsonIgnore
    @JsonManagedReference
    @JsonBackReference
    public void setSection(Section section) {
        this.section = section;
    }

    private String mvinfoInfo;
    @JsonBackReference
    public List<Section> getSectionList() {
        return sectionList;
    }
    @JsonBackReference
    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }

    public Integer getMvinfoId() {
        return mvinfoId;
    }

    public void setMvinfoId(Integer mvinfoId) {
        this.mvinfoId = mvinfoId;
    }

    public String getMvinfoName() {
        return mvinfoName;
    }

    public void setMvinfoName(String mvinfoName) {
        this.mvinfoName = mvinfoName == null ? null : mvinfoName.trim();
    }

    public Double getMvinfoTime() {
        return mvinfoTime;
    }

    public void setMvinfoTime(Double mvinfoTime) {
        this.mvinfoTime = mvinfoTime;
    }

    public String getMvinfoMv() {
        return mvinfoMv;
    }

    public void setMvinfoMv(String mvinfoMv) {
        this.mvinfoMv = mvinfoMv == null ? null : mvinfoMv.trim();
    }

    public Integer getMvinfoSection() {
        return mvinfoSection;
    }

    public void setMvinfoSection(Integer mvinfoSection) {
        this.mvinfoSection = mvinfoSection;
    }

    public String getMvinfoInfo() {
        return mvinfoInfo;
    }

    public void setMvinfoInfo(String mvinfoInfo) {
        this.mvinfoInfo = mvinfoInfo == null ? null : mvinfoInfo.trim();
    }
}