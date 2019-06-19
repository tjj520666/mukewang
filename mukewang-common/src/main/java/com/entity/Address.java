package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Address {
    private Integer addressId;

    private Integer addressUid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addressCreatetime;

    private String addressRegion;

    private String addressSite;

    private Integer addressPostcode;

    private String addressPhone;

    private String addressName;

    private Integer addressIsDefault = 0 ;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressUid=" + addressUid +
                ", addressCreatetime=" + addressCreatetime +
                ", addressRegion='" + addressRegion + '\'' +
                ", addressSite='" + addressSite + '\'' +
                ", addressPostcode=" + addressPostcode +
                ", addressPhone='" + addressPhone + '\'' +
                ", addressName='" + addressName + '\'' +
                ", addressIsDefault=" + addressIsDefault +
                '}';
    }

    public Integer getAddressIsDefault() {
        return addressIsDefault;
    }

    public void setAddressIsDefault(Integer addressIsDefault) {
        this.addressIsDefault = addressIsDefault;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressUid() {
        return addressUid;
    }

    public void setAddressUid(Integer addressUid) {
        this.addressUid = addressUid;
    }

    public Date getAddressCreatetime() {
        return addressCreatetime;
    }

    public void setAddressCreatetime(Date addressCreatetime) {
        this.addressCreatetime = addressCreatetime;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressSite() {
        return addressSite;
    }

    public void setAddressSite(String addressSite) {
        this.addressSite = addressSite;
    }

    public Integer getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(Integer addressPostcode) {
        this.addressPostcode = addressPostcode;
    }


}