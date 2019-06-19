package com.entity;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andUsectionIdIsNull() {
            addCriterion("usection_id is null");
            return (Criteria) this;
        }

        public Criteria andUsectionIdIsNotNull() {
            addCriterion("usection_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsectionIdEqualTo(Integer value) {
            addCriterion("usection_id =", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdNotEqualTo(Integer value) {
            addCriterion("usection_id <>", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdGreaterThan(Integer value) {
            addCriterion("usection_id >", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usection_id >=", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdLessThan(Integer value) {
            addCriterion("usection_id <", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("usection_id <=", value, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdIn(List<Integer> values) {
            addCriterion("usection_id in", values, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdNotIn(List<Integer> values) {
            addCriterion("usection_id not in", values, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdBetween(Integer value1, Integer value2) {
            addCriterion("usection_id between", value1, value2, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usection_id not between", value1, value2, "usectionId");
            return (Criteria) this;
        }

        public Criteria andUsectionUidIsNull() {
            addCriterion("usection_uid is null");
            return (Criteria) this;
        }

        public Criteria andUsectionUidIsNotNull() {
            addCriterion("usection_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUsectionUidEqualTo(Integer value) {
            addCriterion("usection_uid =", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidNotEqualTo(Integer value) {
            addCriterion("usection_uid <>", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidGreaterThan(Integer value) {
            addCriterion("usection_uid >", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usection_uid >=", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidLessThan(Integer value) {
            addCriterion("usection_uid <", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidLessThanOrEqualTo(Integer value) {
            addCriterion("usection_uid <=", value, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidIn(List<Integer> values) {
            addCriterion("usection_uid in", values, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidNotIn(List<Integer> values) {
            addCriterion("usection_uid not in", values, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidBetween(Integer value1, Integer value2) {
            addCriterion("usection_uid between", value1, value2, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionUidNotBetween(Integer value1, Integer value2) {
            addCriterion("usection_uid not between", value1, value2, "usectionUid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidIsNull() {
            addCriterion("usection_mvid is null");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidIsNotNull() {
            addCriterion("usection_mvid is not null");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidEqualTo(Integer value) {
            addCriterion("usection_mvid =", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidNotEqualTo(Integer value) {
            addCriterion("usection_mvid <>", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidGreaterThan(Integer value) {
            addCriterion("usection_mvid >", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usection_mvid >=", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidLessThan(Integer value) {
            addCriterion("usection_mvid <", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidLessThanOrEqualTo(Integer value) {
            addCriterion("usection_mvid <=", value, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidIn(List<Integer> values) {
            addCriterion("usection_mvid in", values, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidNotIn(List<Integer> values) {
            addCriterion("usection_mvid not in", values, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidBetween(Integer value1, Integer value2) {
            addCriterion("usection_mvid between", value1, value2, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionMvidNotBetween(Integer value1, Integer value2) {
            addCriterion("usection_mvid not between", value1, value2, "usectionMvid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidIsNull() {
            addCriterion("usection_sectionid is null");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidIsNotNull() {
            addCriterion("usection_sectionid is not null");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidEqualTo(Integer value) {
            addCriterion("usection_sectionid =", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidNotEqualTo(Integer value) {
            addCriterion("usection_sectionid <>", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidGreaterThan(Integer value) {
            addCriterion("usection_sectionid >", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usection_sectionid >=", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidLessThan(Integer value) {
            addCriterion("usection_sectionid <", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("usection_sectionid <=", value, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidIn(List<Integer> values) {
            addCriterion("usection_sectionid in", values, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidNotIn(List<Integer> values) {
            addCriterion("usection_sectionid not in", values, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidBetween(Integer value1, Integer value2) {
            addCriterion("usection_sectionid between", value1, value2, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("usection_sectionid not between", value1, value2, "usectionSectionid");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusIsNull() {
            addCriterion("usection_status is null");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusIsNotNull() {
            addCriterion("usection_status is not null");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusEqualTo(Integer value) {
            addCriterion("usection_status =", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusNotEqualTo(Integer value) {
            addCriterion("usection_status <>", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusGreaterThan(Integer value) {
            addCriterion("usection_status >", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("usection_status >=", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusLessThan(Integer value) {
            addCriterion("usection_status <", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("usection_status <=", value, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusIn(List<Integer> values) {
            addCriterion("usection_status in", values, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusNotIn(List<Integer> values) {
            addCriterion("usection_status not in", values, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("usection_status between", value1, value2, "usectionStatus");
            return (Criteria) this;
        }

        public Criteria andUsectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("usection_status not between", value1, value2, "usectionStatus");
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