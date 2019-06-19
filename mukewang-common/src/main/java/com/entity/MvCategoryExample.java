package com.entity;

import java.util.ArrayList;
import java.util.List;

public class MvCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MvCategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNull() {
            addCriterion("category_title is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNotNull() {
            addCriterion("category_title is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleEqualTo(String value) {
            addCriterion("category_title =", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotEqualTo(String value) {
            addCriterion("category_title <>", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThan(String value) {
            addCriterion("category_title >", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("category_title >=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThan(String value) {
            addCriterion("category_title <", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThanOrEqualTo(String value) {
            addCriterion("category_title <=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLike(String value) {
            addCriterion("category_title like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotLike(String value) {
            addCriterion("category_title not like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIn(List<String> values) {
            addCriterion("category_title in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotIn(List<String> values) {
            addCriterion("category_title not in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleBetween(String value1, String value2) {
            addCriterion("category_title between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotBetween(String value1, String value2) {
            addCriterion("category_title not between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNull() {
            addCriterion("category_type is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("category_type is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Integer value) {
            addCriterion("category_type =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Integer value) {
            addCriterion("category_type <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Integer value) {
            addCriterion("category_type >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_type >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Integer value) {
            addCriterion("category_type <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("category_type <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Integer> values) {
            addCriterion("category_type in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Integer> values) {
            addCriterion("category_type not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("category_type between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("category_type not between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIsNull() {
            addCriterion("category_parentid is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIsNotNull() {
            addCriterion("category_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidEqualTo(Integer value) {
            addCriterion("category_parentid =", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotEqualTo(Integer value) {
            addCriterion("category_parentid <>", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidGreaterThan(Integer value) {
            addCriterion("category_parentid >", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_parentid >=", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidLessThan(Integer value) {
            addCriterion("category_parentid <", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidLessThanOrEqualTo(Integer value) {
            addCriterion("category_parentid <=", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIn(List<Integer> values) {
            addCriterion("category_parentid in", values, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotIn(List<Integer> values) {
            addCriterion("category_parentid not in", values, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidBetween(Integer value1, Integer value2) {
            addCriterion("category_parentid between", value1, value2, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("category_parentid not between", value1, value2, "categoryParentid");
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