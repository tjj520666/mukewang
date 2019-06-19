package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Shoppingcart {
    private Integer shoppingcartId;

    private Integer shoppingcartUid;

    private Integer shoppingcartGid;

    private Integer shoppingcartMvid;

    private Double shoppingcartMoney;

    private Mv mv;

    private double shifu;

    public double getShifu() {
        return shifu;
    }

    public void setShifu(double shifu) {
        this.shifu = shifu;
    }

    public Integer getShoppingcartId() {
        return shoppingcartId;
    }

    public void setShoppingcartId(Integer shoppingcartId) {
        this.shoppingcartId = shoppingcartId;
    }

    public Integer getShoppingcartUid() {
        return shoppingcartUid;
    }

    public void setShoppingcartUid(Integer shoppingcartUid) {
        this.shoppingcartUid = shoppingcartUid;
    }

    public Integer getShoppingcartGid() {
        return shoppingcartGid;
    }

    public void setShoppingcartGid(Integer shoppingcartGid) {
        this.shoppingcartGid = shoppingcartGid;
    }

    public Integer getShoppingcartMvid() {
        return shoppingcartMvid;
    }

    public void setShoppingcartMvid(Integer shoppingcartMvid) {
        this.shoppingcartMvid = shoppingcartMvid;
    }

    public Double getShoppingcartMoney() {
        return shoppingcartMoney;
    }
    @JsonBackReference
    public Mv getMv() {
        return mv;
    }
    @JsonBackReference
    public void setMv(Mv mv) {
        this.mv = mv;
    }

    public void setShoppingcartMoney(Double shoppingcartMoney) {
        this.shoppingcartMoney = shoppingcartMoney;
    }
}