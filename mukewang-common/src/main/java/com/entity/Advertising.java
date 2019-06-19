package com.entity;

public class Advertising {
    private Integer advertisingId;

    private String advertisingImage;

    private String advertisingHref;

    public Integer getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(Integer advertisingId) {
        this.advertisingId = advertisingId;
    }

    public String getAdvertisingImage() {
        return advertisingImage;
    }

    public void setAdvertisingImage(String advertisingImage) {
        this.advertisingImage = advertisingImage == null ? null : advertisingImage.trim();
    }

    public String getAdvertisingHref() {
        return advertisingHref;
    }

    public void setAdvertisingHref(String advertisingHref) {
        this.advertisingHref = advertisingHref == null ? null : advertisingHref.trim();
    }
}