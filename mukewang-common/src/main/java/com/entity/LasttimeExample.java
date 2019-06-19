package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LasttimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LasttimeExample() {
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

        public Criteria andLasttimeIdIsNull() {
            addCriterion("lasttime_id is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdIsNotNull() {
            addCriterion("lasttime_id is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdEqualTo(Integer value) {
            addCriterion("lasttime_id =", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdNotEqualTo(Integer value) {
            addCriterion("lasttime_id <>", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdGreaterThan(Integer value) {
            addCriterion("lasttime_id >", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lasttime_id >=", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdLessThan(Integer value) {
            addCriterion("lasttime_id <", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("lasttime_id <=", value, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdIn(List<Integer> values) {
            addCriterion("lasttime_id in", values, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdNotIn(List<Integer> values) {
            addCriterion("lasttime_id not in", values, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdBetween(Integer value1, Integer value2) {
            addCriterion("lasttime_id between", value1, value2, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lasttime_id not between", value1, value2, "lasttimeId");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeIsNull() {
            addCriterion("lasttime_loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeIsNotNull() {
            addCriterion("lasttime_loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeEqualTo(Date value) {
            addCriterion("lasttime_loginTime =", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeNotEqualTo(Date value) {
            addCriterion("lasttime_loginTime <>", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeGreaterThan(Date value) {
            addCriterion("lasttime_loginTime >", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lasttime_loginTime >=", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeLessThan(Date value) {
            addCriterion("lasttime_loginTime <", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lasttime_loginTime <=", value, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeIn(List<Date> values) {
            addCriterion("lasttime_loginTime in", values, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeNotIn(List<Date> values) {
            addCriterion("lasttime_loginTime not in", values, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeBetween(Date value1, Date value2) {
            addCriterion("lasttime_loginTime between", value1, value2, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lasttime_loginTime not between", value1, value2, "lasttimeLogintime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressIsNull() {
            addCriterion("lasttime_loginAddress is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressIsNotNull() {
            addCriterion("lasttime_loginAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressEqualTo(String value) {
            addCriterion("lasttime_loginAddress =", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressNotEqualTo(String value) {
            addCriterion("lasttime_loginAddress <>", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressGreaterThan(String value) {
            addCriterion("lasttime_loginAddress >", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressGreaterThanOrEqualTo(String value) {
            addCriterion("lasttime_loginAddress >=", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressLessThan(String value) {
            addCriterion("lasttime_loginAddress <", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressLessThanOrEqualTo(String value) {
            addCriterion("lasttime_loginAddress <=", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressLike(String value) {
            addCriterion("lasttime_loginAddress like", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressNotLike(String value) {
            addCriterion("lasttime_loginAddress not like", value, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressIn(List<String> values) {
            addCriterion("lasttime_loginAddress in", values, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressNotIn(List<String> values) {
            addCriterion("lasttime_loginAddress not in", values, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressBetween(String value1, String value2) {
            addCriterion("lasttime_loginAddress between", value1, value2, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginaddressNotBetween(String value1, String value2) {
            addCriterion("lasttime_loginAddress not between", value1, value2, "lasttimeLoginaddress");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpIsNull() {
            addCriterion("lasttime_ip is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpIsNotNull() {
            addCriterion("lasttime_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpEqualTo(String value) {
            addCriterion("lasttime_ip =", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpNotEqualTo(String value) {
            addCriterion("lasttime_ip <>", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpGreaterThan(String value) {
            addCriterion("lasttime_ip >", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpGreaterThanOrEqualTo(String value) {
            addCriterion("lasttime_ip >=", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpLessThan(String value) {
            addCriterion("lasttime_ip <", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpLessThanOrEqualTo(String value) {
            addCriterion("lasttime_ip <=", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpLike(String value) {
            addCriterion("lasttime_ip like", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpNotLike(String value) {
            addCriterion("lasttime_ip not like", value, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpIn(List<String> values) {
            addCriterion("lasttime_ip in", values, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpNotIn(List<String> values) {
            addCriterion("lasttime_ip not in", values, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpBetween(String value1, String value2) {
            addCriterion("lasttime_ip between", value1, value2, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeIpNotBetween(String value1, String value2) {
            addCriterion("lasttime_ip not between", value1, value2, "lasttimeIp");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentIsNull() {
            addCriterion("lasttime_loginEquipment is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentIsNotNull() {
            addCriterion("lasttime_loginEquipment is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentEqualTo(String value) {
            addCriterion("lasttime_loginEquipment =", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentNotEqualTo(String value) {
            addCriterion("lasttime_loginEquipment <>", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentGreaterThan(String value) {
            addCriterion("lasttime_loginEquipment >", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentGreaterThanOrEqualTo(String value) {
            addCriterion("lasttime_loginEquipment >=", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentLessThan(String value) {
            addCriterion("lasttime_loginEquipment <", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentLessThanOrEqualTo(String value) {
            addCriterion("lasttime_loginEquipment <=", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentLike(String value) {
            addCriterion("lasttime_loginEquipment like", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentNotLike(String value) {
            addCriterion("lasttime_loginEquipment not like", value, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentIn(List<String> values) {
            addCriterion("lasttime_loginEquipment in", values, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentNotIn(List<String> values) {
            addCriterion("lasttime_loginEquipment not in", values, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentBetween(String value1, String value2) {
            addCriterion("lasttime_loginEquipment between", value1, value2, "lasttimeLoginequipment");
            return (Criteria) this;
        }

        public Criteria andLasttimeLoginequipmentNotBetween(String value1, String value2) {
            addCriterion("lasttime_loginEquipment not between", value1, value2, "lasttimeLoginequipment");
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