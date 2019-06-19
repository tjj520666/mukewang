package com.entity;

import java.util.ArrayList;
import java.util.List;

public class UjurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UjurisdictionExample() {
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

        public Criteria andUjurisdictionIdIsNull() {
            addCriterion("ujurisdiction_id is null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdIsNotNull() {
            addCriterion("ujurisdiction_id is not null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdEqualTo(Integer value) {
            addCriterion("ujurisdiction_id =", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdNotEqualTo(Integer value) {
            addCriterion("ujurisdiction_id <>", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdGreaterThan(Integer value) {
            addCriterion("ujurisdiction_id >", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_id >=", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdLessThan(Integer value) {
            addCriterion("ujurisdiction_id <", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdLessThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_id <=", value, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdIn(List<Integer> values) {
            addCriterion("ujurisdiction_id in", values, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdNotIn(List<Integer> values) {
            addCriterion("ujurisdiction_id not in", values, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_id between", value1, value2, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_id not between", value1, value2, "ujurisdictionId");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidIsNull() {
            addCriterion("ujurisdiction_rid is null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidIsNotNull() {
            addCriterion("ujurisdiction_rid is not null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidEqualTo(Integer value) {
            addCriterion("ujurisdiction_rid =", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidNotEqualTo(Integer value) {
            addCriterion("ujurisdiction_rid <>", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidGreaterThan(Integer value) {
            addCriterion("ujurisdiction_rid >", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_rid >=", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidLessThan(Integer value) {
            addCriterion("ujurisdiction_rid <", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidLessThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_rid <=", value, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidIn(List<Integer> values) {
            addCriterion("ujurisdiction_rid in", values, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidNotIn(List<Integer> values) {
            addCriterion("ujurisdiction_rid not in", values, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_rid between", value1, value2, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionRidNotBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_rid not between", value1, value2, "ujurisdictionRid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridIsNull() {
            addCriterion("ujurisdiction_jurid is null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridIsNotNull() {
            addCriterion("ujurisdiction_jurid is not null");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridEqualTo(Integer value) {
            addCriterion("ujurisdiction_jurid =", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridNotEqualTo(Integer value) {
            addCriterion("ujurisdiction_jurid <>", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridGreaterThan(Integer value) {
            addCriterion("ujurisdiction_jurid >", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_jurid >=", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridLessThan(Integer value) {
            addCriterion("ujurisdiction_jurid <", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridLessThanOrEqualTo(Integer value) {
            addCriterion("ujurisdiction_jurid <=", value, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridIn(List<Integer> values) {
            addCriterion("ujurisdiction_jurid in", values, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridNotIn(List<Integer> values) {
            addCriterion("ujurisdiction_jurid not in", values, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_jurid between", value1, value2, "ujurisdictionJurid");
            return (Criteria) this;
        }

        public Criteria andUjurisdictionJuridNotBetween(Integer value1, Integer value2) {
            addCriterion("ujurisdiction_jurid not between", value1, value2, "ujurisdictionJurid");
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