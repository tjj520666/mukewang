package com.entity;

public class Jurisdiction {
    private Integer jurisdictionId;

    private Integer jurisdictionUjurid;

    private String jurisdictionName;

    private String jurisdictionIcon;

    private String jurisdictionUrl;

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public Integer getJurisdictionUjurid() {
        return jurisdictionUjurid;
    }

    public void setJurisdictionUjurid(Integer jurisdictionUjurid) {
        this.jurisdictionUjurid = jurisdictionUjurid;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName == null ? null : jurisdictionName.trim();
    }

    public String getJurisdictionIcon() {
        return jurisdictionIcon;
    }

    public void setJurisdictionIcon(String jurisdictionIcon) {
        this.jurisdictionIcon = jurisdictionIcon == null ? null : jurisdictionIcon.trim();
    }

    public String getJurisdictionUrl() {
        return jurisdictionUrl;
    }

    public void setJurisdictionUrl(String jurisdictionUrl) {
        this.jurisdictionUrl = jurisdictionUrl == null ? null : jurisdictionUrl.trim();
    }
}