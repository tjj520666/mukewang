package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Teacher {
    private Integer teacherId;
    private Users users;
    private String teacherName;

    private Integer teacherUid;

    private String teacherTitle;

    private String teacherIntro;

    private String teacherMv;

    private String teacherShizhan;

    private String teacherShouji;

    private Integer teacherFans;

    private String teacherImage;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherUid() {
        return teacherUid;
    }

    public void setTeacherUid(Integer teacherUid) {
        this.teacherUid = teacherUid;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle == null ? null : teacherTitle.trim();
    }

    public String getTeacherIntro() {
        return teacherIntro;
    }

    public void setTeacherIntro(String teacherIntro) {
        this.teacherIntro = teacherIntro == null ? null : teacherIntro.trim();
    }
    @JsonBackReference
    public Users getUsers() {
        return users;
    }
    @JsonBackReference
    public void setUsers(Users users) {
        this.users = users;
    }

    public String getTeacherMv() {
        return teacherMv;
    }

    public void setTeacherMv(String teacherMv) {
        this.teacherMv = teacherMv == null ? null : teacherMv.trim();
    }

    public String getTeacherShizhan() {
        return teacherShizhan;
    }

    public void setTeacherShizhan(String teacherShizhan) {
        this.teacherShizhan = teacherShizhan == null ? null : teacherShizhan.trim();
    }

    public String getTeacherShouji() {
        return teacherShouji;
    }

    public void setTeacherShouji(String teacherShouji) {
        this.teacherShouji = teacherShouji == null ? null : teacherShouji.trim();
    }

    public Integer getTeacherFans() {
        return teacherFans;
    }

    public void setTeacherFans(Integer teacherFans) {
        this.teacherFans = teacherFans;
    }

    public String getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(String teacherImage) {
        this.teacherImage = teacherImage == null ? null : teacherImage.trim();
    }
}