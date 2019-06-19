package com.entity;

import java.util.Date;
import java.util.List;

public class Users {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userAccount;

    private String userIdcard;

    private String userIdcardimage;

    private String userAddress;

    private Double userMoney;

    private String userSchool;

    private Date userAdmissiondate;

    private Integer userDegreetypeid;

    private String userEncrypted;

    private Integer userLogintimeid;

    private String userEmail;

    private String userSignature;

    private String userHeadimage;

    private String userPhone;

    private Integer userStatus;

    private Integer userPositionId;

    private Position position;

    private List<Article> articles;

    public void setUserLogintimeid(Integer userLogintimeid) {
        this.userLogintimeid = userLogintimeid;
    }

    public Integer getUserPositionId() {
        return userPositionId;
    }

    public void setUserPositionId(Integer userPositionId) {
        this.userPositionId = userPositionId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    public String getUserIdcardimage() {
        return userIdcardimage;
    }

    public void setUserIdcardimage(String userIdcardimage) {
        this.userIdcardimage = userIdcardimage == null ? null : userIdcardimage.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Double userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public Date getUserAdmissiondate() {
        return userAdmissiondate;
    }

    public void setUserAdmissiondate(Date userAdmissiondate) {
        this.userAdmissiondate = userAdmissiondate;
    }

    public Integer getUserDegreetypeid() {
        return userDegreetypeid;
    }

    public void setUserDegreetypeid(Integer userDegreetypeid) {
        this.userDegreetypeid = userDegreetypeid;
    }

    public String getUserEncrypted() {
        return userEncrypted;
    }

    public void setUserEncrypted(String userEncrypted) {
        this.userEncrypted = userEncrypted == null ? null : userEncrypted.trim();
    }

    public Integer getUserLogintimeid() {
        return userLogintimeid;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public String getUserHeadimage() {
        return userHeadimage;
    }

    public void setUserHeadimage(String userHeadimage) {
        this.userHeadimage = userHeadimage == null ? null : userHeadimage.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

}