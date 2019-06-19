package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNull() {
            addCriterion("order_uid is null");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNotNull() {
            addCriterion("order_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUidEqualTo(Integer value) {
            addCriterion("order_uid =", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotEqualTo(Integer value) {
            addCriterion("order_uid <>", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThan(Integer value) {
            addCriterion("order_uid >", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_uid >=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThan(Integer value) {
            addCriterion("order_uid <", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThanOrEqualTo(Integer value) {
            addCriterion("order_uid <=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidIn(List<Integer> values) {
            addCriterion("order_uid in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotIn(List<Integer> values) {
            addCriterion("order_uid not in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidBetween(Integer value1, Integer value2) {
            addCriterion("order_uid between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_uid not between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUnameIsNull() {
            addCriterion("order_uname is null");
            return (Criteria) this;
        }

        public Criteria andOrderUnameIsNotNull() {
            addCriterion("order_uname is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUnameEqualTo(String value) {
            addCriterion("order_uname =", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameNotEqualTo(String value) {
            addCriterion("order_uname <>", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameGreaterThan(String value) {
            addCriterion("order_uname >", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameGreaterThanOrEqualTo(String value) {
            addCriterion("order_uname >=", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameLessThan(String value) {
            addCriterion("order_uname <", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameLessThanOrEqualTo(String value) {
            addCriterion("order_uname <=", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameLike(String value) {
            addCriterion("order_uname like", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameNotLike(String value) {
            addCriterion("order_uname not like", value, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameIn(List<String> values) {
            addCriterion("order_uname in", values, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameNotIn(List<String> values) {
            addCriterion("order_uname not in", values, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameBetween(String value1, String value2) {
            addCriterion("order_uname between", value1, value2, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUnameNotBetween(String value1, String value2) {
            addCriterion("order_uname not between", value1, value2, "orderUname");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressIsNull() {
            addCriterion("order_uaddress is null");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressIsNotNull() {
            addCriterion("order_uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressEqualTo(String value) {
            addCriterion("order_uaddress =", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressNotEqualTo(String value) {
            addCriterion("order_uaddress <>", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressGreaterThan(String value) {
            addCriterion("order_uaddress >", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_uaddress >=", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressLessThan(String value) {
            addCriterion("order_uaddress <", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressLessThanOrEqualTo(String value) {
            addCriterion("order_uaddress <=", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressLike(String value) {
            addCriterion("order_uaddress like", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressNotLike(String value) {
            addCriterion("order_uaddress not like", value, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressIn(List<String> values) {
            addCriterion("order_uaddress in", values, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressNotIn(List<String> values) {
            addCriterion("order_uaddress not in", values, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressBetween(String value1, String value2) {
            addCriterion("order_uaddress between", value1, value2, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderUaddressNotBetween(String value1, String value2) {
            addCriterion("order_uaddress not between", value1, value2, "orderUaddress");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNull() {
            addCriterion("order_createTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNotNull() {
            addCriterion("order_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeEqualTo(Date value) {
            addCriterion("order_createTime =", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotEqualTo(Date value) {
            addCriterion("order_createTime <>", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThan(Date value) {
            addCriterion("order_createTime >", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_createTime >=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThan(Date value) {
            addCriterion("order_createTime <", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_createTime <=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIn(List<Date> values) {
            addCriterion("order_createTime in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotIn(List<Date> values) {
            addCriterion("order_createTime not in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeBetween(Date value1, Date value2) {
            addCriterion("order_createTime between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_createTime not between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureIsNull() {
            addCriterion("order_expenditure is null");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureIsNotNull() {
            addCriterion("order_expenditure is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureEqualTo(Double value) {
            addCriterion("order_expenditure =", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureNotEqualTo(Double value) {
            addCriterion("order_expenditure <>", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureGreaterThan(Double value) {
            addCriterion("order_expenditure >", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureGreaterThanOrEqualTo(Double value) {
            addCriterion("order_expenditure >=", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureLessThan(Double value) {
            addCriterion("order_expenditure <", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureLessThanOrEqualTo(Double value) {
            addCriterion("order_expenditure <=", value, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureIn(List<Double> values) {
            addCriterion("order_expenditure in", values, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureNotIn(List<Double> values) {
            addCriterion("order_expenditure not in", values, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureBetween(Double value1, Double value2) {
            addCriterion("order_expenditure between", value1, value2, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderExpenditureNotBetween(Double value1, Double value2) {
            addCriterion("order_expenditure not between", value1, value2, "orderExpenditure");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberIsNull() {
            addCriterion("order_orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberIsNotNull() {
            addCriterion("order_orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberEqualTo(String value) {
            addCriterion("order_orderNumber =", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberNotEqualTo(String value) {
            addCriterion("order_orderNumber <>", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberGreaterThan(String value) {
            addCriterion("order_orderNumber >", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_orderNumber >=", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberLessThan(String value) {
            addCriterion("order_orderNumber <", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("order_orderNumber <=", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberLike(String value) {
            addCriterion("order_orderNumber like", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberNotLike(String value) {
            addCriterion("order_orderNumber not like", value, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberIn(List<String> values) {
            addCriterion("order_orderNumber in", values, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberNotIn(List<String> values) {
            addCriterion("order_orderNumber not in", values, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberBetween(String value1, String value2) {
            addCriterion("order_orderNumber between", value1, value2, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderOrdernumberNotBetween(String value1, String value2) {
            addCriterion("order_orderNumber not between", value1, value2, "orderOrdernumber");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
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