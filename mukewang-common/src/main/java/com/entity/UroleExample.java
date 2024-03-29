package com.entity;

import java.util.ArrayList;
import java.util.List;

public class UroleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UroleExample() {
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

        public Criteria andUroleIdIsNull() {
            addCriterion("urole_id is null");
            return (Criteria) this;
        }

        public Criteria andUroleIdIsNotNull() {
            addCriterion("urole_id is not null");
            return (Criteria) this;
        }

        public Criteria andUroleIdEqualTo(Integer value) {
            addCriterion("urole_id =", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotEqualTo(Integer value) {
            addCriterion("urole_id <>", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdGreaterThan(Integer value) {
            addCriterion("urole_id >", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("urole_id >=", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdLessThan(Integer value) {
            addCriterion("urole_id <", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdLessThanOrEqualTo(Integer value) {
            addCriterion("urole_id <=", value, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdIn(List<Integer> values) {
            addCriterion("urole_id in", values, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotIn(List<Integer> values) {
            addCriterion("urole_id not in", values, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdBetween(Integer value1, Integer value2) {
            addCriterion("urole_id between", value1, value2, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("urole_id not between", value1, value2, "uroleId");
            return (Criteria) this;
        }

        public Criteria andUroleUidIsNull() {
            addCriterion("urole_uid is null");
            return (Criteria) this;
        }

        public Criteria andUroleUidIsNotNull() {
            addCriterion("urole_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUroleUidEqualTo(Integer value) {
            addCriterion("urole_uid =", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidNotEqualTo(Integer value) {
            addCriterion("urole_uid <>", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidGreaterThan(Integer value) {
            addCriterion("urole_uid >", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("urole_uid >=", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidLessThan(Integer value) {
            addCriterion("urole_uid <", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidLessThanOrEqualTo(Integer value) {
            addCriterion("urole_uid <=", value, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidIn(List<Integer> values) {
            addCriterion("urole_uid in", values, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidNotIn(List<Integer> values) {
            addCriterion("urole_uid not in", values, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidBetween(Integer value1, Integer value2) {
            addCriterion("urole_uid between", value1, value2, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleUidNotBetween(Integer value1, Integer value2) {
            addCriterion("urole_uid not between", value1, value2, "uroleUid");
            return (Criteria) this;
        }

        public Criteria andUroleRidIsNull() {
            addCriterion("urole_rid is null");
            return (Criteria) this;
        }

        public Criteria andUroleRidIsNotNull() {
            addCriterion("urole_rid is not null");
            return (Criteria) this;
        }

        public Criteria andUroleRidEqualTo(Integer value) {
            addCriterion("urole_rid =", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidNotEqualTo(Integer value) {
            addCriterion("urole_rid <>", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidGreaterThan(Integer value) {
            addCriterion("urole_rid >", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("urole_rid >=", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidLessThan(Integer value) {
            addCriterion("urole_rid <", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidLessThanOrEqualTo(Integer value) {
            addCriterion("urole_rid <=", value, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidIn(List<Integer> values) {
            addCriterion("urole_rid in", values, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidNotIn(List<Integer> values) {
            addCriterion("urole_rid not in", values, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidBetween(Integer value1, Integer value2) {
            addCriterion("urole_rid between", value1, value2, "uroleRid");
            return (Criteria) this;
        }

        public Criteria andUroleRidNotBetween(Integer value1, Integer value2) {
            addCriterion("urole_rid not between", value1, value2, "uroleRid");
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