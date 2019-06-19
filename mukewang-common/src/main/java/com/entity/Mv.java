package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.searchbox.annotations.JestId;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
//@Document(indexName = "mukewang",type = "mv")
public class Mv {
//    @Id
    private Integer mv;
    @JestId
    private Integer mvId;

    private String mvName;

    private String mvTitle;

    private String mvDetails;

    private Integer mvDifficultyid;
    private  Teacher teacher;
    private Difficulty difficulty;

    private Double mvPrice;

    private Integer mvType1id;

    private Integer mvType2id;

    private Integer mvType3id;

    private String mvImage;

    private Double mvScope;

    private Integer mvPersonnum;

    private Double mvDuration;

    private Integer mvTeacherid;

    private String mvTeacher;

    private String mvKnow;

    private Integer mvRs;

    private Integer mvHotsearch;
    private List<Section> sections;
    @JsonBackReference
    public Teacher getTeacher() {
        return teacher;
    }
    @JsonBackReference
    public void setMv(Integer mv) {
        this.mv = mv;
    }
    @JsonBackReference
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @JsonBackReference
    public Difficulty getDifficulty() {
        return difficulty;
    }
    @JsonBackReference
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getMvId() {
        return mvId;
    }

    public void setMvId(Integer mvId) {
        this.mvId = mvId;
    }

    public String getMvName() {
        return mvName;
    }

    public void setMvName(String mvName) {
        this.mvName = mvName == null ? null : mvName.trim();
    }

    public String getMvTitle() {
        return mvTitle;
    }

    public void setMvTitle(String mvTitle) {
        this.mvTitle = mvTitle == null ? null : mvTitle.trim();
    }

    public String getMvDetails() {
        return mvDetails;
    }

    public void setMvDetails(String mvDetails) {
        this.mvDetails = mvDetails == null ? null : mvDetails.trim();
    }

    public Integer getMvDifficultyid() {
        return mvDifficultyid;
    }

    public void setMvDifficultyid(Integer mvDifficultyid) {
        this.mvDifficultyid = mvDifficultyid;
    }

    public Double getMvPrice() {
        return mvPrice;
    }

    public void setMvPrice(Double mvPrice) {
        this.mvPrice = mvPrice;
    }

    public Integer getMvType1id() {
        return mvType1id;
    }

    public void setMvType1id(Integer mvType1id) {
        this.mvType1id = mvType1id;
    }

    public Integer getMvType2id() {
        return mvType2id;
    }

    public void setMvType2id(Integer mvType2id) {
        this.mvType2id = mvType2id;
    }

    public Integer getMvType3id() {
        return mvType3id;
    }

    public void setMvType3id(Integer mvType3id) {
        this.mvType3id = mvType3id;
    }

    public String getMvImage() {
        return mvImage;
    }

    public void setMvImage(String mvImage) {
        this.mvImage = mvImage == null ? null : mvImage.trim();
    }

    public Double getMvScope() {
        return mvScope;
    }

    public void setMvScope(Double mvScope) {
        this.mvScope = mvScope;
    }

    public Integer getMvPersonnum() {
        return mvPersonnum;
    }

    public void setMvPersonnum(Integer mvPersonnum) {
        this.mvPersonnum = mvPersonnum;
    }

    public Double getMvDuration() {
        return mvDuration;
    }

    public void setMvDuration(Double mvDuration) {
        this.mvDuration = mvDuration;
    }

    public Integer getMvTeacherid() {
        return mvTeacherid;
    }

    public void setMvTeacherid(Integer mvTeacherid) {
        this.mvTeacherid = mvTeacherid;
    }
    @JsonBackReference
    public String getMvTeacher() {
        return mvTeacher;
    }
    @JsonBackReference
    public void setMvTeacher(String mvTeacher) {
        this.mvTeacher = mvTeacher == null ? null : mvTeacher.trim();
    }

    public String getMvKnow() {
        return mvKnow;
    }

    public void setMvKnow(String mvKnow) {
        this.mvKnow = mvKnow == null ? null : mvKnow.trim();
    }

    public Integer getMvRs() {
        return mvRs;
    }

    public void setMvRs(Integer mvRs) {
        this.mvRs = mvRs;
    }

    public Integer getMvHotsearch() {
        return mvHotsearch;
    }

    public void setMvHotsearch(Integer mvHotsearch) {
        this.mvHotsearch = mvHotsearch;
    }
    @JsonManagedReference
    public List<Section> getSections() {
        return sections;
    }
    @JsonManagedReference
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Mv{" +
                "mv=" + mv +
                ", mvId=" + mvId +
                ", mvName='" + mvName + '\'' +
                ", mvTitle='" + mvTitle + '\'' +
                ", mvDetails='" + mvDetails + '\'' +
                ", mvDifficultyid=" + mvDifficultyid +
                ", teacher=" + teacher +
                ", difficulty=" + difficulty +
                ", mvPrice=" + mvPrice +
                ", mvType1id=" + mvType1id +
                ", mvType2id=" + mvType2id +
                ", mvType3id=" + mvType3id +
                ", mvImage='" + mvImage + '\'' +
                ", mvScope=" + mvScope +
                ", mvPersonnum=" + mvPersonnum +
                ", mvDuration=" + mvDuration +
                ", mvTeacherid=" + mvTeacherid +
                ", mvTeacher='" + mvTeacher + '\'' +
                ", mvKnow='" + mvKnow + '\'' +
                ", mvRs=" + mvRs +
                ", mvHotsearch=" + mvHotsearch +
                ", sections=" + sections +
                '}';
    }
}