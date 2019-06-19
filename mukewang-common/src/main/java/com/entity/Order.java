package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer orderId;

    private Integer orderUid;

    private String orderUname;

    private String orderUaddress;

    private Date orderCreatetime;

    private Double orderExpenditure;

    private String orderOrdernumber;

    private Integer orderState;

    private List<Detail> details;
    @JsonBackReference
    public List<Detail> getDetails() {
        return details;
    }
    @JsonBackReference
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUid() {
        return orderUid;
    }

    public void setOrderUid(Integer orderUid) {
        this.orderUid = orderUid;
    }

    public String getOrderUname() {
        return orderUname;
    }

    public void setOrderUname(String orderUname) {
        this.orderUname = orderUname == null ? null : orderUname.trim();
    }

    public String getOrderUaddress() {
        return orderUaddress;
    }

    public void setOrderUaddress(String orderUaddress) {
        this.orderUaddress = orderUaddress == null ? null : orderUaddress.trim();
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public Double getOrderExpenditure() {
        return orderExpenditure;
    }

    public void setOrderExpenditure(Double orderExpenditure) {
        this.orderExpenditure = orderExpenditure;
    }

    public String getOrderOrdernumber() {
        return orderOrdernumber;
    }

    public void setOrderOrdernumber(String orderOrdernumber) {
        this.orderOrdernumber = orderOrdernumber == null ? null : orderOrdernumber.trim();
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}