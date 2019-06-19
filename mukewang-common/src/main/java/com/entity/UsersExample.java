package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNull() {
            addCriterion("user_idCard is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNotNull() {
            addCriterion("user_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardEqualTo(String value) {
            addCriterion("user_idCard =", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotEqualTo(String value) {
            addCriterion("user_idCard <>", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThan(String value) {
            addCriterion("user_idCard >", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("user_idCard >=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThan(String value) {
            addCriterion("user_idCard <", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThanOrEqualTo(String value) {
            addCriterion("user_idCard <=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLike(String value) {
            addCriterion("user_idCard like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotLike(String value) {
            addCriterion("user_idCard not like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIn(List<String> values) {
            addCriterion("user_idCard in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotIn(List<String> values) {
            addCriterion("user_idCard not in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardBetween(String value1, String value2) {
            addCriterion("user_idCard between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotBetween(String value1, String value2) {
            addCriterion("user_idCard not between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageIsNull() {
            addCriterion("user_idCardImage is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageIsNotNull() {
            addCriterion("user_idCardImage is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageEqualTo(String value) {
            addCriterion("user_idCardImage =", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageNotEqualTo(String value) {
            addCriterion("user_idCardImage <>", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageGreaterThan(String value) {
            addCriterion("user_idCardImage >", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageGreaterThanOrEqualTo(String value) {
            addCriterion("user_idCardImage >=", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageLessThan(String value) {
            addCriterion("user_idCardImage <", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageLessThanOrEqualTo(String value) {
            addCriterion("user_idCardImage <=", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageLike(String value) {
            addCriterion("user_idCardImage like", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageNotLike(String value) {
            addCriterion("user_idCardImage not like", value, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageIn(List<String> values) {
            addCriterion("user_idCardImage in", values, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageNotIn(List<String> values) {
            addCriterion("user_idCardImage not in", values, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageBetween(String value1, String value2) {
            addCriterion("user_idCardImage between", value1, value2, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserIdcardimageNotBetween(String value1, String value2) {
            addCriterion("user_idCardImage not between", value1, value2, "userIdcardimage");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNull() {
            addCriterion("user_money is null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNotNull() {
            addCriterion("user_money is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyEqualTo(Double value) {
            addCriterion("user_money =", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotEqualTo(Double value) {
            addCriterion("user_money <>", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThan(Double value) {
            addCriterion("user_money >", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("user_money >=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThan(Double value) {
            addCriterion("user_money <", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThanOrEqualTo(Double value) {
            addCriterion("user_money <=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIn(List<Double> values) {
            addCriterion("user_money in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotIn(List<Double> values) {
            addCriterion("user_money not in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyBetween(Double value1, Double value2) {
            addCriterion("user_money between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotBetween(Double value1, Double value2) {
            addCriterion("user_money not between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNull() {
            addCriterion("user_school is null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIsNotNull() {
            addCriterion("user_school is not null");
            return (Criteria) this;
        }

        public Criteria andUserSchoolEqualTo(String value) {
            addCriterion("user_school =", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotEqualTo(String value) {
            addCriterion("user_school <>", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThan(String value) {
            addCriterion("user_school >", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("user_school >=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThan(String value) {
            addCriterion("user_school <", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLessThanOrEqualTo(String value) {
            addCriterion("user_school <=", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolLike(String value) {
            addCriterion("user_school like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotLike(String value) {
            addCriterion("user_school not like", value, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolIn(List<String> values) {
            addCriterion("user_school in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotIn(List<String> values) {
            addCriterion("user_school not in", values, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolBetween(String value1, String value2) {
            addCriterion("user_school between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserSchoolNotBetween(String value1, String value2) {
            addCriterion("user_school not between", value1, value2, "userSchool");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateIsNull() {
            addCriterion("user_admissionDate is null");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateIsNotNull() {
            addCriterion("user_admissionDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateEqualTo(Date value) {
            addCriterion("user_admissionDate =", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateNotEqualTo(Date value) {
            addCriterion("user_admissionDate <>", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateGreaterThan(Date value) {
            addCriterion("user_admissionDate >", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_admissionDate >=", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateLessThan(Date value) {
            addCriterion("user_admissionDate <", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateLessThanOrEqualTo(Date value) {
            addCriterion("user_admissionDate <=", value, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateIn(List<Date> values) {
            addCriterion("user_admissionDate in", values, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateNotIn(List<Date> values) {
            addCriterion("user_admissionDate not in", values, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateBetween(Date value1, Date value2) {
            addCriterion("user_admissionDate between", value1, value2, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserAdmissiondateNotBetween(Date value1, Date value2) {
            addCriterion("user_admissionDate not between", value1, value2, "userAdmissiondate");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidIsNull() {
            addCriterion("user_degreeTypeId is null");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidIsNotNull() {
            addCriterion("user_degreeTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidEqualTo(Integer value) {
            addCriterion("user_degreeTypeId =", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidNotEqualTo(Integer value) {
            addCriterion("user_degreeTypeId <>", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidGreaterThan(Integer value) {
            addCriterion("user_degreeTypeId >", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_degreeTypeId >=", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidLessThan(Integer value) {
            addCriterion("user_degreeTypeId <", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("user_degreeTypeId <=", value, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidIn(List<Integer> values) {
            addCriterion("user_degreeTypeId in", values, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidNotIn(List<Integer> values) {
            addCriterion("user_degreeTypeId not in", values, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidBetween(Integer value1, Integer value2) {
            addCriterion("user_degreeTypeId between", value1, value2, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserDegreetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_degreeTypeId not between", value1, value2, "userDegreetypeid");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedIsNull() {
            addCriterion("user_encrypted is null");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedIsNotNull() {
            addCriterion("user_encrypted is not null");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedEqualTo(String value) {
            addCriterion("user_encrypted =", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedNotEqualTo(String value) {
            addCriterion("user_encrypted <>", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedGreaterThan(String value) {
            addCriterion("user_encrypted >", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedGreaterThanOrEqualTo(String value) {
            addCriterion("user_encrypted >=", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedLessThan(String value) {
            addCriterion("user_encrypted <", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedLessThanOrEqualTo(String value) {
            addCriterion("user_encrypted <=", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedLike(String value) {
            addCriterion("user_encrypted like", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedNotLike(String value) {
            addCriterion("user_encrypted not like", value, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedIn(List<String> values) {
            addCriterion("user_encrypted in", values, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedNotIn(List<String> values) {
            addCriterion("user_encrypted not in", values, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedBetween(String value1, String value2) {
            addCriterion("user_encrypted between", value1, value2, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserEncryptedNotBetween(String value1, String value2) {
            addCriterion("user_encrypted not between", value1, value2, "userEncrypted");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidIsNull() {
            addCriterion("user_loginTimeId is null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidIsNotNull() {
            addCriterion("user_loginTimeId is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidEqualTo(Integer value) {
            addCriterion("user_loginTimeId =", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidNotEqualTo(Integer value) {
            addCriterion("user_loginTimeId <>", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidGreaterThan(Integer value) {
            addCriterion("user_loginTimeId >", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_loginTimeId >=", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidLessThan(Integer value) {
            addCriterion("user_loginTimeId <", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidLessThanOrEqualTo(Integer value) {
            addCriterion("user_loginTimeId <=", value, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidIn(List<Integer> values) {
            addCriterion("user_loginTimeId in", values, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidNotIn(List<Integer> values) {
            addCriterion("user_loginTimeId not in", values, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidBetween(Integer value1, Integer value2) {
            addCriterion("user_loginTimeId between", value1, value2, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("user_loginTimeId not between", value1, value2, "userLogintimeid");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIsNull() {
            addCriterion("user_headImage is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIsNotNull() {
            addCriterion("user_headImage is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageEqualTo(String value) {
            addCriterion("user_headImage =", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotEqualTo(String value) {
            addCriterion("user_headImage <>", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageGreaterThan(String value) {
            addCriterion("user_headImage >", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("user_headImage >=", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLessThan(String value) {
            addCriterion("user_headImage <", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLessThanOrEqualTo(String value) {
            addCriterion("user_headImage <=", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLike(String value) {
            addCriterion("user_headImage like", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotLike(String value) {
            addCriterion("user_headImage not like", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIn(List<String> values) {
            addCriterion("user_headImage in", values, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotIn(List<String> values) {
            addCriterion("user_headImage not in", values, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageBetween(String value1, String value2) {
            addCriterion("user_headImage between", value1, value2, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotBetween(String value1, String value2) {
            addCriterion("user_headImage not between", value1, value2, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}