package com.entity;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisingExample() {
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

        public Criteria andAdvertisingIdIsNull() {
            addCriterion("advertising_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIsNotNull() {
            addCriterion("advertising_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdEqualTo(Integer value) {
            addCriterion("advertising_id =", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotEqualTo(Integer value) {
            addCriterion("advertising_id <>", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThan(Integer value) {
            addCriterion("advertising_id >", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertising_id >=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThan(Integer value) {
            addCriterion("advertising_id <", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdLessThanOrEqualTo(Integer value) {
            addCriterion("advertising_id <=", value, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdIn(List<Integer> values) {
            addCriterion("advertising_id in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotIn(List<Integer> values) {
            addCriterion("advertising_id not in", values, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdBetween(Integer value1, Integer value2) {
            addCriterion("advertising_id between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("advertising_id not between", value1, value2, "advertisingId");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageIsNull() {
            addCriterion("advertising_image is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageIsNotNull() {
            addCriterion("advertising_image is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageEqualTo(String value) {
            addCriterion("advertising_image =", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageNotEqualTo(String value) {
            addCriterion("advertising_image <>", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageGreaterThan(String value) {
            addCriterion("advertising_image >", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_image >=", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageLessThan(String value) {
            addCriterion("advertising_image <", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageLessThanOrEqualTo(String value) {
            addCriterion("advertising_image <=", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageLike(String value) {
            addCriterion("advertising_image like", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageNotLike(String value) {
            addCriterion("advertising_image not like", value, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageIn(List<String> values) {
            addCriterion("advertising_image in", values, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageNotIn(List<String> values) {
            addCriterion("advertising_image not in", values, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageBetween(String value1, String value2) {
            addCriterion("advertising_image between", value1, value2, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingImageNotBetween(String value1, String value2) {
            addCriterion("advertising_image not between", value1, value2, "advertisingImage");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefIsNull() {
            addCriterion("advertising_href is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefIsNotNull() {
            addCriterion("advertising_href is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefEqualTo(String value) {
            addCriterion("advertising_href =", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefNotEqualTo(String value) {
            addCriterion("advertising_href <>", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefGreaterThan(String value) {
            addCriterion("advertising_href >", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefGreaterThanOrEqualTo(String value) {
            addCriterion("advertising_href >=", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefLessThan(String value) {
            addCriterion("advertising_href <", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefLessThanOrEqualTo(String value) {
            addCriterion("advertising_href <=", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefLike(String value) {
            addCriterion("advertising_href like", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefNotLike(String value) {
            addCriterion("advertising_href not like", value, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefIn(List<String> values) {
            addCriterion("advertising_href in", values, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefNotIn(List<String> values) {
            addCriterion("advertising_href not in", values, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefBetween(String value1, String value2) {
            addCriterion("advertising_href between", value1, value2, "advertisingHref");
            return (Criteria) this;
        }

        public Criteria andAdvertisingHrefNotBetween(String value1, String value2) {
            addCriterion("advertising_href not between", value1, value2, "advertisingHref");
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