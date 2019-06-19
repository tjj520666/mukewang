package com.entity;

public class Carousel {
    private Integer carouselId;

    private String carouselImage;

    private String carouselHref;

    public Integer getCarouselId() {
        return carouselId;
    }

    public void setCarouselId(Integer carouselId) {
        this.carouselId = carouselId;
    }

    public String getCarouselImage() {
        return carouselImage;
    }

    public void setCarouselImage(String carouselImage) {
        this.carouselImage = carouselImage == null ? null : carouselImage.trim();
    }

    public String getCarouselHref() {
        return carouselHref;
    }

    public void setCarouselHref(String carouselHref) {
        this.carouselHref = carouselHref == null ? null : carouselHref.trim();
    }
}