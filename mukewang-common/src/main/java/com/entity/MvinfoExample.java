package com.entity;

import java.util.ArrayList;
import java.util.List;

public class MvinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MvinfoExample() {
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

        public Criteria andMvinfoIdIsNull() {
            addCriterion("mvinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdIsNotNull() {
            addCriterion("mvinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdEqualTo(Integer value) {
            addCriterion("mvinfo_id =", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdNotEqualTo(Integer value) {
            addCriterion("mvinfo_id <>", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdGreaterThan(Integer value) {
            addCriterion("mvinfo_id >", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mvinfo_id >=", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdLessThan(Integer value) {
            addCriterion("mvinfo_id <", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("mvinfo_id <=", value, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdIn(List<Integer> values) {
            addCriterion("mvinfo_id in", values, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdNotIn(List<Integer> values) {
            addCriterion("mvinfo_id not in", values, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("mvinfo_id between", value1, value2, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mvinfo_id not between", value1, value2, "mvinfoId");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameIsNull() {
            addCriterion("mvinfo_name is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameIsNotNull() {
            addCriterion("mvinfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameEqualTo(String value) {
            addCriterion("mvinfo_name =", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameNotEqualTo(String value) {
            addCriterion("mvinfo_name <>", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameGreaterThan(String value) {
            addCriterion("mvinfo_name >", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("mvinfo_name >=", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameLessThan(String value) {
            addCriterion("mvinfo_name <", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameLessThanOrEqualTo(String value) {
            addCriterion("mvinfo_name <=", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameLike(String value) {
            addCriterion("mvinfo_name like", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameNotLike(String value) {
            addCriterion("mvinfo_name not like", value, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameIn(List<String> values) {
            addCriterion("mvinfo_name in", values, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameNotIn(List<String> values) {
            addCriterion("mvinfo_name not in", values, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameBetween(String value1, String value2) {
            addCriterion("mvinfo_name between", value1, value2, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoNameNotBetween(String value1, String value2) {
            addCriterion("mvinfo_name not between", value1, value2, "mvinfoName");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeIsNull() {
            addCriterion("mvinfo_time is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeIsNotNull() {
            addCriterion("mvinfo_time is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeEqualTo(Double value) {
            addCriterion("mvinfo_time =", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeNotEqualTo(Double value) {
            addCriterion("mvinfo_time <>", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeGreaterThan(Double value) {
            addCriterion("mvinfo_time >", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("mvinfo_time >=", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeLessThan(Double value) {
            addCriterion("mvinfo_time <", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeLessThanOrEqualTo(Double value) {
            addCriterion("mvinfo_time <=", value, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeIn(List<Double> values) {
            addCriterion("mvinfo_time in", values, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeNotIn(List<Double> values) {
            addCriterion("mvinfo_time not in", values, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeBetween(Double value1, Double value2) {
            addCriterion("mvinfo_time between", value1, value2, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoTimeNotBetween(Double value1, Double value2) {
            addCriterion("mvinfo_time not between", value1, value2, "mvinfoTime");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvIsNull() {
            addCriterion("mvinfo_mv is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvIsNotNull() {
            addCriterion("mvinfo_mv is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvEqualTo(String value) {
            addCriterion("mvinfo_mv =", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvNotEqualTo(String value) {
            addCriterion("mvinfo_mv <>", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvGreaterThan(String value) {
            addCriterion("mvinfo_mv >", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvGreaterThanOrEqualTo(String value) {
            addCriterion("mvinfo_mv >=", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvLessThan(String value) {
            addCriterion("mvinfo_mv <", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvLessThanOrEqualTo(String value) {
            addCriterion("mvinfo_mv <=", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvLike(String value) {
            addCriterion("mvinfo_mv like", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvNotLike(String value) {
            addCriterion("mvinfo_mv not like", value, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvIn(List<String> values) {
            addCriterion("mvinfo_mv in", values, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvNotIn(List<String> values) {
            addCriterion("mvinfo_mv not in", values, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvBetween(String value1, String value2) {
            addCriterion("mvinfo_mv between", value1, value2, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoMvNotBetween(String value1, String value2) {
            addCriterion("mvinfo_mv not between", value1, value2, "mvinfoMv");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionIsNull() {
            addCriterion("mvinfo_section is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionIsNotNull() {
            addCriterion("mvinfo_section is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionEqualTo(Integer value) {
            addCriterion("mvinfo_section =", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionNotEqualTo(Integer value) {
            addCriterion("mvinfo_section <>", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionGreaterThan(Integer value) {
            addCriterion("mvinfo_section >", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("mvinfo_section >=", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionLessThan(Integer value) {
            addCriterion("mvinfo_section <", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionLessThanOrEqualTo(Integer value) {
            addCriterion("mvinfo_section <=", value, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionIn(List<Integer> values) {
            addCriterion("mvinfo_section in", values, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionNotIn(List<Integer> values) {
            addCriterion("mvinfo_section not in", values, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionBetween(Integer value1, Integer value2) {
            addCriterion("mvinfo_section between", value1, value2, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoSectionNotBetween(Integer value1, Integer value2) {
            addCriterion("mvinfo_section not between", value1, value2, "mvinfoSection");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoIsNull() {
            addCriterion("mvinfo_info is null");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoIsNotNull() {
            addCriterion("mvinfo_info is not null");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoEqualTo(String value) {
            addCriterion("mvinfo_info =", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoNotEqualTo(String value) {
            addCriterion("mvinfo_info <>", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoGreaterThan(String value) {
            addCriterion("mvinfo_info >", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mvinfo_info >=", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoLessThan(String value) {
            addCriterion("mvinfo_info <", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoLessThanOrEqualTo(String value) {
            addCriterion("mvinfo_info <=", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoLike(String value) {
            addCriterion("mvinfo_info like", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoNotLike(String value) {
            addCriterion("mvinfo_info not like", value, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoIn(List<String> values) {
            addCriterion("mvinfo_info in", values, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoNotIn(List<String> values) {
            addCriterion("mvinfo_info not in", values, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoBetween(String value1, String value2) {
            addCriterion("mvinfo_info between", value1, value2, "mvinfoInfo");
            return (Criteria) this;
        }

        public Criteria andMvinfoInfoNotBetween(String value1, String value2) {
            addCriterion("mvinfo_info not between", value1, value2, "mvinfoInfo");
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