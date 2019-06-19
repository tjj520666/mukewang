package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Detail {
    private Integer detailId;

    private Integer detailOrderid;

    private Integer detailMvid;

    private Integer detailNumber;

    private Double detailMoney;

    private Mv mv;
    @JsonBackReference
    public Mv getMv() {
        return mv;
    }
    @JsonBackReference
    public void setMv(Mv mv) {
        this.mv = mv;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getDetailOrderid() {
        return detailOrderid;
    }

    public void setDetailOrderid(Integer detailOrderid) {
        this.detailOrderid = detailOrderid;
    }

    public Integer getDetailMvid() {
        return detailMvid;
    }

    public void setDetailMvid(Integer detailMvid) {
        this.detailMvid = detailMvid;
    }

    public Integer getDetailNumber() {
        return detailNumber;
    }

    public void setDetailNumber(Integer detailNumber) {
        this.detailNumber = detailNumber;
    }

    public Double getDetailMoney() {
        return detailMoney;
    }

    public void setDetailMoney(Double detailMoney) {
        this.detailMoney = detailMoney;
    }
}