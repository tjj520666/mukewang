package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNull() {
            addCriterion("address_uid is null");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNotNull() {
            addCriterion("address_uid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUidEqualTo(Integer value) {
            addCriterion("address_uid =", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotEqualTo(Integer value) {
            addCriterion("address_uid <>", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThan(Integer value) {
            addCriterion("address_uid >", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_uid >=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThan(Integer value) {
            addCriterion("address_uid <", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThanOrEqualTo(Integer value) {
            addCriterion("address_uid <=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidIn(List<Integer> values) {
            addCriterion("address_uid in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotIn(List<Integer> values) {
            addCriterion("address_uid not in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidBetween(Integer value1, Integer value2) {
            addCriterion("address_uid between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotBetween(Integer value1, Integer value2) {
            addCriterion("address_uid not between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIsNull() {
            addCriterion("address_createTime is null");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIsNotNull() {
            addCriterion("address_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeEqualTo(Date value) {
            addCriterion("address_createTime =", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotEqualTo(Date value) {
            addCriterion("address_createTime <>", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeGreaterThan(Date value) {
            addCriterion("address_createTime >", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("address_createTime >=", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeLessThan(Date value) {
            addCriterion("address_createTime <", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("address_createTime <=", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIn(List<Date> values) {
            addCriterion("address_createTime in", values, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotIn(List<Date> values) {
            addCriterion("address_createTime not in", values, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeBetween(Date value1, Date value2) {
            addCriterion("address_createTime between", value1, value2, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("address_createTime not between", value1, value2, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultIsNull() {
            addCriterion("address_isDefault is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultIsNotNull() {
            addCriterion("address_isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultEqualTo(String value) {
            addCriterion("address_isDefault =", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultNotEqualTo(String value) {
            addCriterion("address_isDefault <>", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultGreaterThan(String value) {
            addCriterion("address_isDefault >", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("address_isDefault >=", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultLessThan(String value) {
            addCriterion("address_isDefault <", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("address_isDefault <=", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultLike(String value) {
            addCriterion("address_isDefault like", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultNotLike(String value) {
            addCriterion("address_isDefault not like", value, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultIn(List<String> values) {
            addCriterion("address_isDefault in", values, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultNotIn(List<String> values) {
            addCriterion("address_isDefault not in", values, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultBetween(String value1, String value2) {
            addCriterion("address_isDefault between", value1, value2, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsdefaultNotBetween(String value1, String value2) {
            addCriterion("address_isDefault not between", value1, value2, "addressIsdefault");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkIsNull() {
            addCriterion("address_remark is null");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkIsNotNull() {
            addCriterion("address_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkEqualTo(String value) {
            addCriterion("address_remark =", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkNotEqualTo(String value) {
            addCriterion("address_remark <>", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkGreaterThan(String value) {
            addCriterion("address_remark >", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("address_remark >=", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkLessThan(String value) {
            addCriterion("address_remark <", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkLessThanOrEqualTo(String value) {
            addCriterion("address_remark <=", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkLike(String value) {
            addCriterion("address_remark like", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkNotLike(String value) {
            addCriterion("address_remark not like", value, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkIn(List<String> values) {
            addCriterion("address_remark in", values, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkNotIn(List<String> values) {
            addCriterion("address_remark not in", values, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkBetween(String value1, String value2) {
            addCriterion("address_remark between", value1, value2, "addressRemark");
            return (Criteria) this;
        }

        public Criteria andAddressRemarkNotBetween(String value1, String value2) {
            addCriterion("address_remark not between", value1, value2, "addressRemark");
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