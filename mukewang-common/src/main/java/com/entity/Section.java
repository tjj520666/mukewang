package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Section implements Serializable {
    public Section() {
    }

    private Integer sectionId;

    private Integer sectionOnsale;

    private String sectionTitle;

    private String sectionIntro;

    private Integer sectionMv;

    private  List<Comment>comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    //    @JsonManagedReference
    @JsonBackReference
    private List<Mvinfo> mvinfos;

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getSectionOnsale() {
        return sectionOnsale;
    }

    public void setSectionOnsale(Integer sectionOnsale) {
        this.sectionOnsale = sectionOnsale;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle == null ? null : sectionTitle.trim();
    }

    public String getSectionIntro() {
        return sectionIntro;
    }

    public void setSectionIntro(String sectionIntro) {
        this.sectionIntro = sectionIntro == null ? null : sectionIntro.trim();
    }

    public Integer getSectionMv() {
        return sectionMv;
    }

    public void setSectionMv(Integer sectionMv) {
        this.sectionMv = sectionMv;
    }
    @JsonBackReference
    public List<Mvinfo> getMvinfos() {
        return mvinfos;
    }
    @JsonBackReference
    public void setMvinfos(List<Mvinfo> mvinfos) {
        this.mvinfos = mvinfos;
    }
}