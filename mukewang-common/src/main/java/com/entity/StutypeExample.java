package com.entity;

import java.util.ArrayList;
import java.util.List;

public class StutypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StutypeExample() {
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

        public Criteria andStutypeIdIsNull() {
            addCriterion("stutype_id is null");
            return (Criteria) this;
        }

        public Criteria andStutypeIdIsNotNull() {
            addCriterion("stutype_id is not null");
            return (Criteria) this;
        }

        public Criteria andStutypeIdEqualTo(Integer value) {
            addCriterion("stutype_id =", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdNotEqualTo(Integer value) {
            addCriterion("stutype_id <>", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdGreaterThan(Integer value) {
            addCriterion("stutype_id >", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stutype_id >=", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdLessThan(Integer value) {
            addCriterion("stutype_id <", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("stutype_id <=", value, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdIn(List<Integer> values) {
            addCriterion("stutype_id in", values, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdNotIn(List<Integer> values) {
            addCriterion("stutype_id not in", values, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdBetween(Integer value1, Integer value2) {
            addCriterion("stutype_id between", value1, value2, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stutype_id not between", value1, value2, "stutypeId");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameIsNull() {
            addCriterion("stutype_stuname is null");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameIsNotNull() {
            addCriterion("stutype_stuname is not null");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameEqualTo(String value) {
            addCriterion("stutype_stuname =", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameNotEqualTo(String value) {
            addCriterion("stutype_stuname <>", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameGreaterThan(String value) {
            addCriterion("stutype_stuname >", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stutype_stuname >=", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameLessThan(String value) {
            addCriterion("stutype_stuname <", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameLessThanOrEqualTo(String value) {
            addCriterion("stutype_stuname <=", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameLike(String value) {
            addCriterion("stutype_stuname like", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameNotLike(String value) {
            addCriterion("stutype_stuname not like", value, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameIn(List<String> values) {
            addCriterion("stutype_stuname in", values, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameNotIn(List<String> values) {
            addCriterion("stutype_stuname not in", values, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameBetween(String value1, String value2) {
            addCriterion("stutype_stuname between", value1, value2, "stutypeStuname");
            return (Criteria) this;
        }

        public Criteria andStutypeStunameNotBetween(String value1, String value2) {
            addCriterion("stutype_stuname not between", value1, value2, "stutypeStuname");
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