package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andCollectIdIsNull() {
            addCriterion("collect_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectIdIsNotNull() {
            addCriterion("collect_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectIdEqualTo(Integer value) {
            addCriterion("collect_id =", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotEqualTo(Integer value) {
            addCriterion("collect_id <>", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThan(Integer value) {
            addCriterion("collect_id >", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_id >=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThan(Integer value) {
            addCriterion("collect_id <", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThanOrEqualTo(Integer value) {
            addCriterion("collect_id <=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdIn(List<Integer> values) {
            addCriterion("collect_id in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotIn(List<Integer> values) {
            addCriterion("collect_id not in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdBetween(Integer value1, Integer value2) {
            addCriterion("collect_id between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_id not between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectUidIsNull() {
            addCriterion("collect_uid is null");
            return (Criteria) this;
        }

        public Criteria andCollectUidIsNotNull() {
            addCriterion("collect_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectUidEqualTo(Integer value) {
            addCriterion("collect_uid =", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidNotEqualTo(Integer value) {
            addCriterion("collect_uid <>", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidGreaterThan(Integer value) {
            addCriterion("collect_uid >", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_uid >=", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidLessThan(Integer value) {
            addCriterion("collect_uid <", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidLessThanOrEqualTo(Integer value) {
            addCriterion("collect_uid <=", value, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidIn(List<Integer> values) {
            addCriterion("collect_uid in", values, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidNotIn(List<Integer> values) {
            addCriterion("collect_uid not in", values, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidBetween(Integer value1, Integer value2) {
            addCriterion("collect_uid between", value1, value2, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectUidNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_uid not between", value1, value2, "collectUid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidIsNull() {
            addCriterion("collect_mvid is null");
            return (Criteria) this;
        }

        public Criteria andCollectMvidIsNotNull() {
            addCriterion("collect_mvid is not null");
            return (Criteria) this;
        }

        public Criteria andCollectMvidEqualTo(Integer value) {
            addCriterion("collect_mvid =", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidNotEqualTo(Integer value) {
            addCriterion("collect_mvid <>", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidGreaterThan(Integer value) {
            addCriterion("collect_mvid >", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_mvid >=", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidLessThan(Integer value) {
            addCriterion("collect_mvid <", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidLessThanOrEqualTo(Integer value) {
            addCriterion("collect_mvid <=", value, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidIn(List<Integer> values) {
            addCriterion("collect_mvid in", values, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidNotIn(List<Integer> values) {
            addCriterion("collect_mvid not in", values, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidBetween(Integer value1, Integer value2) {
            addCriterion("collect_mvid between", value1, value2, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectMvidNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_mvid not between", value1, value2, "collectMvid");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeIsNull() {
            addCriterion("collect_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeIsNotNull() {
            addCriterion("collect_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeEqualTo(Date value) {
            addCriterion("collect_createtime =", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeNotEqualTo(Date value) {
            addCriterion("collect_createtime <>", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeGreaterThan(Date value) {
            addCriterion("collect_createtime >", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_createtime >=", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeLessThan(Date value) {
            addCriterion("collect_createtime <", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_createtime <=", value, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeIn(List<Date> values) {
            addCriterion("collect_createtime in", values, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeNotIn(List<Date> values) {
            addCriterion("collect_createtime not in", values, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeBetween(Date value1, Date value2) {
            addCriterion("collect_createtime between", value1, value2, "collectCreatetime");
            return (Criteria) this;
        }

        public Criteria andCollectCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_createtime not between", value1, value2, "collectCreatetime");
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