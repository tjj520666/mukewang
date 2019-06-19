package com.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherUidIsNull() {
            addCriterion("teacher_uid is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUidIsNotNull() {
            addCriterion("teacher_uid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUidEqualTo(Integer value) {
            addCriterion("teacher_uid =", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidNotEqualTo(Integer value) {
            addCriterion("teacher_uid <>", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidGreaterThan(Integer value) {
            addCriterion("teacher_uid >", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_uid >=", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidLessThan(Integer value) {
            addCriterion("teacher_uid <", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_uid <=", value, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidIn(List<Integer> values) {
            addCriterion("teacher_uid in", values, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidNotIn(List<Integer> values) {
            addCriterion("teacher_uid not in", values, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidBetween(Integer value1, Integer value2) {
            addCriterion("teacher_uid between", value1, value2, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherUidNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_uid not between", value1, value2, "teacherUid");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNull() {
            addCriterion("teacher_title is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNotNull() {
            addCriterion("teacher_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleEqualTo(String value) {
            addCriterion("teacher_title =", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotEqualTo(String value) {
            addCriterion("teacher_title <>", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThan(String value) {
            addCriterion("teacher_title >", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_title >=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThan(String value) {
            addCriterion("teacher_title <", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_title <=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLike(String value) {
            addCriterion("teacher_title like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotLike(String value) {
            addCriterion("teacher_title not like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIn(List<String> values) {
            addCriterion("teacher_title in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotIn(List<String> values) {
            addCriterion("teacher_title not in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleBetween(String value1, String value2) {
            addCriterion("teacher_title between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotBetween(String value1, String value2) {
            addCriterion("teacher_title not between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIsNull() {
            addCriterion("teacher_intro is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIsNotNull() {
            addCriterion("teacher_intro is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroEqualTo(String value) {
            addCriterion("teacher_intro =", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotEqualTo(String value) {
            addCriterion("teacher_intro <>", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroGreaterThan(String value) {
            addCriterion("teacher_intro >", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_intro >=", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLessThan(String value) {
            addCriterion("teacher_intro <", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLessThanOrEqualTo(String value) {
            addCriterion("teacher_intro <=", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLike(String value) {
            addCriterion("teacher_intro like", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotLike(String value) {
            addCriterion("teacher_intro not like", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIn(List<String> values) {
            addCriterion("teacher_intro in", values, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotIn(List<String> values) {
            addCriterion("teacher_intro not in", values, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroBetween(String value1, String value2) {
            addCriterion("teacher_intro between", value1, value2, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotBetween(String value1, String value2) {
            addCriterion("teacher_intro not between", value1, value2, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherMvIsNull() {
            addCriterion("teacher_mv is null");
            return (Criteria) this;
        }

        public Criteria andTeacherMvIsNotNull() {
            addCriterion("teacher_mv is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherMvEqualTo(String value) {
            addCriterion("teacher_mv =", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvNotEqualTo(String value) {
            addCriterion("teacher_mv <>", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvGreaterThan(String value) {
            addCriterion("teacher_mv >", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_mv >=", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvLessThan(String value) {
            addCriterion("teacher_mv <", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvLessThanOrEqualTo(String value) {
            addCriterion("teacher_mv <=", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvLike(String value) {
            addCriterion("teacher_mv like", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvNotLike(String value) {
            addCriterion("teacher_mv not like", value, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvIn(List<String> values) {
            addCriterion("teacher_mv in", values, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvNotIn(List<String> values) {
            addCriterion("teacher_mv not in", values, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvBetween(String value1, String value2) {
            addCriterion("teacher_mv between", value1, value2, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherMvNotBetween(String value1, String value2) {
            addCriterion("teacher_mv not between", value1, value2, "teacherMv");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanIsNull() {
            addCriterion("teacher_shizhan is null");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanIsNotNull() {
            addCriterion("teacher_shizhan is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanEqualTo(String value) {
            addCriterion("teacher_shizhan =", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanNotEqualTo(String value) {
            addCriterion("teacher_shizhan <>", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanGreaterThan(String value) {
            addCriterion("teacher_shizhan >", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_shizhan >=", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanLessThan(String value) {
            addCriterion("teacher_shizhan <", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanLessThanOrEqualTo(String value) {
            addCriterion("teacher_shizhan <=", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanLike(String value) {
            addCriterion("teacher_shizhan like", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanNotLike(String value) {
            addCriterion("teacher_shizhan not like", value, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanIn(List<String> values) {
            addCriterion("teacher_shizhan in", values, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanNotIn(List<String> values) {
            addCriterion("teacher_shizhan not in", values, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanBetween(String value1, String value2) {
            addCriterion("teacher_shizhan between", value1, value2, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShizhanNotBetween(String value1, String value2) {
            addCriterion("teacher_shizhan not between", value1, value2, "teacherShizhan");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiIsNull() {
            addCriterion("teacher_shouji is null");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiIsNotNull() {
            addCriterion("teacher_shouji is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiEqualTo(String value) {
            addCriterion("teacher_shouji =", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiNotEqualTo(String value) {
            addCriterion("teacher_shouji <>", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiGreaterThan(String value) {
            addCriterion("teacher_shouji >", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_shouji >=", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiLessThan(String value) {
            addCriterion("teacher_shouji <", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiLessThanOrEqualTo(String value) {
            addCriterion("teacher_shouji <=", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiLike(String value) {
            addCriterion("teacher_shouji like", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiNotLike(String value) {
            addCriterion("teacher_shouji not like", value, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiIn(List<String> values) {
            addCriterion("teacher_shouji in", values, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiNotIn(List<String> values) {
            addCriterion("teacher_shouji not in", values, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiBetween(String value1, String value2) {
            addCriterion("teacher_shouji between", value1, value2, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherShoujiNotBetween(String value1, String value2) {
            addCriterion("teacher_shouji not between", value1, value2, "teacherShouji");
            return (Criteria) this;
        }

        public Criteria andTeacherFansIsNull() {
            addCriterion("teacher_fans is null");
            return (Criteria) this;
        }

        public Criteria andTeacherFansIsNotNull() {
            addCriterion("teacher_fans is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherFansEqualTo(Integer value) {
            addCriterion("teacher_fans =", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansNotEqualTo(Integer value) {
            addCriterion("teacher_fans <>", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansGreaterThan(Integer value) {
            addCriterion("teacher_fans >", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_fans >=", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansLessThan(Integer value) {
            addCriterion("teacher_fans <", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_fans <=", value, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansIn(List<Integer> values) {
            addCriterion("teacher_fans in", values, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansNotIn(List<Integer> values) {
            addCriterion("teacher_fans not in", values, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansBetween(Integer value1, Integer value2) {
            addCriterion("teacher_fans between", value1, value2, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherFansNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_fans not between", value1, value2, "teacherFans");
            return (Criteria) this;
        }

        public Criteria andTeacherImageIsNull() {
            addCriterion("teacher_image is null");
            return (Criteria) this;
        }

        public Criteria andTeacherImageIsNotNull() {
            addCriterion("teacher_image is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherImageEqualTo(String value) {
            addCriterion("teacher_image =", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageNotEqualTo(String value) {
            addCriterion("teacher_image <>", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageGreaterThan(String value) {
            addCriterion("teacher_image >", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_image >=", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageLessThan(String value) {
            addCriterion("teacher_image <", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageLessThanOrEqualTo(String value) {
            addCriterion("teacher_image <=", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageLike(String value) {
            addCriterion("teacher_image like", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageNotLike(String value) {
            addCriterion("teacher_image not like", value, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageIn(List<String> values) {
            addCriterion("teacher_image in", values, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageNotIn(List<String> values) {
            addCriterion("teacher_image not in", values, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageBetween(String value1, String value2) {
            addCriterion("teacher_image between", value1, value2, "teacherImage");
            return (Criteria) this;
        }

        public Criteria andTeacherImageNotBetween(String value1, String value2) {
            addCriterion("teacher_image not between", value1, value2, "teacherImage");
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