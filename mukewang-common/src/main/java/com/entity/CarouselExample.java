package com.entity;

import java.util.ArrayList;
import java.util.List;

public class CarouselExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarouselExample() {
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

        public Criteria andCarouselIdIsNull() {
            addCriterion("carousel_id is null");
            return (Criteria) this;
        }

        public Criteria andCarouselIdIsNotNull() {
            addCriterion("carousel_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselIdEqualTo(Integer value) {
            addCriterion("carousel_id =", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotEqualTo(Integer value) {
            addCriterion("carousel_id <>", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdGreaterThan(Integer value) {
            addCriterion("carousel_id >", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carousel_id >=", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdLessThan(Integer value) {
            addCriterion("carousel_id <", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdLessThanOrEqualTo(Integer value) {
            addCriterion("carousel_id <=", value, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdIn(List<Integer> values) {
            addCriterion("carousel_id in", values, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotIn(List<Integer> values) {
            addCriterion("carousel_id not in", values, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdBetween(Integer value1, Integer value2) {
            addCriterion("carousel_id between", value1, value2, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carousel_id not between", value1, value2, "carouselId");
            return (Criteria) this;
        }

        public Criteria andCarouselImageIsNull() {
            addCriterion("carousel_image is null");
            return (Criteria) this;
        }

        public Criteria andCarouselImageIsNotNull() {
            addCriterion("carousel_image is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselImageEqualTo(String value) {
            addCriterion("carousel_image =", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageNotEqualTo(String value) {
            addCriterion("carousel_image <>", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageGreaterThan(String value) {
            addCriterion("carousel_image >", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_image >=", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageLessThan(String value) {
            addCriterion("carousel_image <", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageLessThanOrEqualTo(String value) {
            addCriterion("carousel_image <=", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageLike(String value) {
            addCriterion("carousel_image like", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageNotLike(String value) {
            addCriterion("carousel_image not like", value, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageIn(List<String> values) {
            addCriterion("carousel_image in", values, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageNotIn(List<String> values) {
            addCriterion("carousel_image not in", values, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageBetween(String value1, String value2) {
            addCriterion("carousel_image between", value1, value2, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselImageNotBetween(String value1, String value2) {
            addCriterion("carousel_image not between", value1, value2, "carouselImage");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefIsNull() {
            addCriterion("carousel_href is null");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefIsNotNull() {
            addCriterion("carousel_href is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefEqualTo(String value) {
            addCriterion("carousel_href =", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefNotEqualTo(String value) {
            addCriterion("carousel_href <>", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefGreaterThan(String value) {
            addCriterion("carousel_href >", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_href >=", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefLessThan(String value) {
            addCriterion("carousel_href <", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefLessThanOrEqualTo(String value) {
            addCriterion("carousel_href <=", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefLike(String value) {
            addCriterion("carousel_href like", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefNotLike(String value) {
            addCriterion("carousel_href not like", value, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefIn(List<String> values) {
            addCriterion("carousel_href in", values, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefNotIn(List<String> values) {
            addCriterion("carousel_href not in", values, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefBetween(String value1, String value2) {
            addCriterion("carousel_href between", value1, value2, "carouselHref");
            return (Criteria) this;
        }

        public Criteria andCarouselHrefNotBetween(String value1, String value2) {
            addCriterion("carousel_href not between", value1, value2, "carouselHref");
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