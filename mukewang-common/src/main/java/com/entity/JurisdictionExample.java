package com.entity;

import java.util.ArrayList;
import java.util.List;

public class JurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JurisdictionExample() {
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

        public Criteria andJurisdictionIdIsNull() {
            addCriterion("jurisdiction_id is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdIsNotNull() {
            addCriterion("jurisdiction_id is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdEqualTo(Integer value) {
            addCriterion("jurisdiction_id =", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdNotEqualTo(Integer value) {
            addCriterion("jurisdiction_id <>", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdGreaterThan(Integer value) {
            addCriterion("jurisdiction_id >", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurisdiction_id >=", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdLessThan(Integer value) {
            addCriterion("jurisdiction_id <", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdLessThanOrEqualTo(Integer value) {
            addCriterion("jurisdiction_id <=", value, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdIn(List<Integer> values) {
            addCriterion("jurisdiction_id in", values, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdNotIn(List<Integer> values) {
            addCriterion("jurisdiction_id not in", values, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdBetween(Integer value1, Integer value2) {
            addCriterion("jurisdiction_id between", value1, value2, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jurisdiction_id not between", value1, value2, "jurisdictionId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridIsNull() {
            addCriterion("jurisdiction_ujurid is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridIsNotNull() {
            addCriterion("jurisdiction_ujurid is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridEqualTo(Integer value) {
            addCriterion("jurisdiction_ujurid =", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridNotEqualTo(Integer value) {
            addCriterion("jurisdiction_ujurid <>", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridGreaterThan(Integer value) {
            addCriterion("jurisdiction_ujurid >", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurisdiction_ujurid >=", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridLessThan(Integer value) {
            addCriterion("jurisdiction_ujurid <", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridLessThanOrEqualTo(Integer value) {
            addCriterion("jurisdiction_ujurid <=", value, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridIn(List<Integer> values) {
            addCriterion("jurisdiction_ujurid in", values, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridNotIn(List<Integer> values) {
            addCriterion("jurisdiction_ujurid not in", values, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridBetween(Integer value1, Integer value2) {
            addCriterion("jurisdiction_ujurid between", value1, value2, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUjuridNotBetween(Integer value1, Integer value2) {
            addCriterion("jurisdiction_ujurid not between", value1, value2, "jurisdictionUjurid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIsNull() {
            addCriterion("jurisdiction_name is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIsNotNull() {
            addCriterion("jurisdiction_name is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameEqualTo(String value) {
            addCriterion("jurisdiction_name =", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotEqualTo(String value) {
            addCriterion("jurisdiction_name <>", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameGreaterThan(String value) {
            addCriterion("jurisdiction_name >", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction_name >=", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLessThan(String value) {
            addCriterion("jurisdiction_name <", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction_name <=", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLike(String value) {
            addCriterion("jurisdiction_name like", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotLike(String value) {
            addCriterion("jurisdiction_name not like", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIn(List<String> values) {
            addCriterion("jurisdiction_name in", values, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotIn(List<String> values) {
            addCriterion("jurisdiction_name not in", values, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameBetween(String value1, String value2) {
            addCriterion("jurisdiction_name between", value1, value2, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotBetween(String value1, String value2) {
            addCriterion("jurisdiction_name not between", value1, value2, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconIsNull() {
            addCriterion("jurisdiction_icon is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconIsNotNull() {
            addCriterion("jurisdiction_icon is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconEqualTo(String value) {
            addCriterion("jurisdiction_icon =", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconNotEqualTo(String value) {
            addCriterion("jurisdiction_icon <>", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconGreaterThan(String value) {
            addCriterion("jurisdiction_icon >", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction_icon >=", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconLessThan(String value) {
            addCriterion("jurisdiction_icon <", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction_icon <=", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconLike(String value) {
            addCriterion("jurisdiction_icon like", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconNotLike(String value) {
            addCriterion("jurisdiction_icon not like", value, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconIn(List<String> values) {
            addCriterion("jurisdiction_icon in", values, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconNotIn(List<String> values) {
            addCriterion("jurisdiction_icon not in", values, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconBetween(String value1, String value2) {
            addCriterion("jurisdiction_icon between", value1, value2, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIconNotBetween(String value1, String value2) {
            addCriterion("jurisdiction_icon not between", value1, value2, "jurisdictionIcon");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlIsNull() {
            addCriterion("jurisdiction_url is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlIsNotNull() {
            addCriterion("jurisdiction_url is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlEqualTo(String value) {
            addCriterion("jurisdiction_url =", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlNotEqualTo(String value) {
            addCriterion("jurisdiction_url <>", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlGreaterThan(String value) {
            addCriterion("jurisdiction_url >", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction_url >=", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlLessThan(String value) {
            addCriterion("jurisdiction_url <", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction_url <=", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlLike(String value) {
            addCriterion("jurisdiction_url like", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlNotLike(String value) {
            addCriterion("jurisdiction_url not like", value, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlIn(List<String> values) {
            addCriterion("jurisdiction_url in", values, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlNotIn(List<String> values) {
            addCriterion("jurisdiction_url not in", values, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlBetween(String value1, String value2) {
            addCriterion("jurisdiction_url between", value1, value2, "jurisdictionUrl");
            return (Criteria) this;
        }

        public Criteria andJurisdictionUrlNotBetween(String value1, String value2) {
            addCriterion("jurisdiction_url not between", value1, value2, "jurisdictionUrl");
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