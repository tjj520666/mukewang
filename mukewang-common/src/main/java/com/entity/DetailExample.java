package com.entity;

import java.util.ArrayList;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidIsNull() {
            addCriterion("detail_orderid is null");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidIsNotNull() {
            addCriterion("detail_orderid is not null");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidEqualTo(Integer value) {
            addCriterion("detail_orderid =", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidNotEqualTo(Integer value) {
            addCriterion("detail_orderid <>", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidGreaterThan(Integer value) {
            addCriterion("detail_orderid >", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_orderid >=", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidLessThan(Integer value) {
            addCriterion("detail_orderid <", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("detail_orderid <=", value, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidIn(List<Integer> values) {
            addCriterion("detail_orderid in", values, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidNotIn(List<Integer> values) {
            addCriterion("detail_orderid not in", values, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidBetween(Integer value1, Integer value2) {
            addCriterion("detail_orderid between", value1, value2, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_orderid not between", value1, value2, "detailOrderid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidIsNull() {
            addCriterion("detail_mvid is null");
            return (Criteria) this;
        }

        public Criteria andDetailMvidIsNotNull() {
            addCriterion("detail_mvid is not null");
            return (Criteria) this;
        }

        public Criteria andDetailMvidEqualTo(Integer value) {
            addCriterion("detail_mvid =", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidNotEqualTo(Integer value) {
            addCriterion("detail_mvid <>", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidGreaterThan(Integer value) {
            addCriterion("detail_mvid >", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_mvid >=", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidLessThan(Integer value) {
            addCriterion("detail_mvid <", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidLessThanOrEqualTo(Integer value) {
            addCriterion("detail_mvid <=", value, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidIn(List<Integer> values) {
            addCriterion("detail_mvid in", values, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidNotIn(List<Integer> values) {
            addCriterion("detail_mvid not in", values, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidBetween(Integer value1, Integer value2) {
            addCriterion("detail_mvid between", value1, value2, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailMvidNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_mvid not between", value1, value2, "detailMvid");
            return (Criteria) this;
        }

        public Criteria andDetailNumberIsNull() {
            addCriterion("detail_number is null");
            return (Criteria) this;
        }

        public Criteria andDetailNumberIsNotNull() {
            addCriterion("detail_number is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNumberEqualTo(Integer value) {
            addCriterion("detail_number =", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotEqualTo(Integer value) {
            addCriterion("detail_number <>", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberGreaterThan(Integer value) {
            addCriterion("detail_number >", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_number >=", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberLessThan(Integer value) {
            addCriterion("detail_number <", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberLessThanOrEqualTo(Integer value) {
            addCriterion("detail_number <=", value, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberIn(List<Integer> values) {
            addCriterion("detail_number in", values, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotIn(List<Integer> values) {
            addCriterion("detail_number not in", values, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberBetween(Integer value1, Integer value2) {
            addCriterion("detail_number between", value1, value2, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_number not between", value1, value2, "detailNumber");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyIsNull() {
            addCriterion("detail_money is null");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyIsNotNull() {
            addCriterion("detail_money is not null");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyEqualTo(Double value) {
            addCriterion("detail_money =", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyNotEqualTo(Double value) {
            addCriterion("detail_money <>", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyGreaterThan(Double value) {
            addCriterion("detail_money >", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("detail_money >=", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyLessThan(Double value) {
            addCriterion("detail_money <", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyLessThanOrEqualTo(Double value) {
            addCriterion("detail_money <=", value, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyIn(List<Double> values) {
            addCriterion("detail_money in", values, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyNotIn(List<Double> values) {
            addCriterion("detail_money not in", values, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyBetween(Double value1, Double value2) {
            addCriterion("detail_money between", value1, value2, "detailMoney");
            return (Criteria) this;
        }

        public Criteria andDetailMoneyNotBetween(Double value1, Double value2) {
            addCriterion("detail_money not between", value1, value2, "detailMoney");
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