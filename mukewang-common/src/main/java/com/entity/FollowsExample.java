package com.entity;

import java.util.ArrayList;
import java.util.List;

public class FollowsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowsExample() {
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

        public Criteria andFollowsIdIsNull() {
            addCriterion("follows_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowsIdIsNotNull() {
            addCriterion("follows_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowsIdEqualTo(Integer value) {
            addCriterion("follows_id =", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdNotEqualTo(Integer value) {
            addCriterion("follows_id <>", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdGreaterThan(Integer value) {
            addCriterion("follows_id >", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("follows_id >=", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdLessThan(Integer value) {
            addCriterion("follows_id <", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdLessThanOrEqualTo(Integer value) {
            addCriterion("follows_id <=", value, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdIn(List<Integer> values) {
            addCriterion("follows_id in", values, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdNotIn(List<Integer> values) {
            addCriterion("follows_id not in", values, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdBetween(Integer value1, Integer value2) {
            addCriterion("follows_id between", value1, value2, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("follows_id not between", value1, value2, "followsId");
            return (Criteria) this;
        }

        public Criteria andFollowsUidIsNull() {
            addCriterion("follows_uid is null");
            return (Criteria) this;
        }

        public Criteria andFollowsUidIsNotNull() {
            addCriterion("follows_uid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowsUidEqualTo(Integer value) {
            addCriterion("follows_uid =", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidNotEqualTo(Integer value) {
            addCriterion("follows_uid <>", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidGreaterThan(Integer value) {
            addCriterion("follows_uid >", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("follows_uid >=", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidLessThan(Integer value) {
            addCriterion("follows_uid <", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidLessThanOrEqualTo(Integer value) {
            addCriterion("follows_uid <=", value, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidIn(List<Integer> values) {
            addCriterion("follows_uid in", values, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidNotIn(List<Integer> values) {
            addCriterion("follows_uid not in", values, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidBetween(Integer value1, Integer value2) {
            addCriterion("follows_uid between", value1, value2, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsUidNotBetween(Integer value1, Integer value2) {
            addCriterion("follows_uid not between", value1, value2, "followsUid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidIsNull() {
            addCriterion("follows_followid is null");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidIsNotNull() {
            addCriterion("follows_followid is not null");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidEqualTo(Integer value) {
            addCriterion("follows_followid =", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidNotEqualTo(Integer value) {
            addCriterion("follows_followid <>", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidGreaterThan(Integer value) {
            addCriterion("follows_followid >", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("follows_followid >=", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidLessThan(Integer value) {
            addCriterion("follows_followid <", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidLessThanOrEqualTo(Integer value) {
            addCriterion("follows_followid <=", value, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidIn(List<Integer> values) {
            addCriterion("follows_followid in", values, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidNotIn(List<Integer> values) {
            addCriterion("follows_followid not in", values, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidBetween(Integer value1, Integer value2) {
            addCriterion("follows_followid between", value1, value2, "followsFollowid");
            return (Criteria) this;
        }

        public Criteria andFollowsFollowidNotBetween(Integer value1, Integer value2) {
            addCriterion("follows_followid not between", value1, value2, "followsFollowid");
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