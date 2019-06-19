package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingcartExample() {
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

        public Criteria andShoppingcartIdIsNull() {
            addCriterion("shoppingcart_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdIsNotNull() {
            addCriterion("shoppingcart_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdEqualTo(Integer value) {
            addCriterion("shoppingcart_id =", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotEqualTo(Integer value) {
            addCriterion("shoppingcart_id <>", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdGreaterThan(Integer value) {
            addCriterion("shoppingcart_id >", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_id >=", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdLessThan(Integer value) {
            addCriterion("shoppingcart_id <", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_id <=", value, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdIn(List<Integer> values) {
            addCriterion("shoppingcart_id in", values, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotIn(List<Integer> values) {
            addCriterion("shoppingcart_id not in", values, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_id between", value1, value2, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_id not between", value1, value2, "shoppingcartId");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidIsNull() {
            addCriterion("shoppingcart_uid is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidIsNotNull() {
            addCriterion("shoppingcart_uid is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidEqualTo(Integer value) {
            addCriterion("shoppingcart_uid =", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidNotEqualTo(Integer value) {
            addCriterion("shoppingcart_uid <>", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidGreaterThan(Integer value) {
            addCriterion("shoppingcart_uid >", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_uid >=", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidLessThan(Integer value) {
            addCriterion("shoppingcart_uid <", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_uid <=", value, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidIn(List<Integer> values) {
            addCriterion("shoppingcart_uid in", values, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidNotIn(List<Integer> values) {
            addCriterion("shoppingcart_uid not in", values, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_uid between", value1, value2, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartUidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_uid not between", value1, value2, "shoppingcartUid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidIsNull() {
            addCriterion("shoppingcart_gid is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidIsNotNull() {
            addCriterion("shoppingcart_gid is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidEqualTo(Integer value) {
            addCriterion("shoppingcart_gid =", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidNotEqualTo(Integer value) {
            addCriterion("shoppingcart_gid <>", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidGreaterThan(Integer value) {
            addCriterion("shoppingcart_gid >", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_gid >=", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidLessThan(Integer value) {
            addCriterion("shoppingcart_gid <", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_gid <=", value, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidIn(List<Integer> values) {
            addCriterion("shoppingcart_gid in", values, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidNotIn(List<Integer> values) {
            addCriterion("shoppingcart_gid not in", values, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_gid between", value1, value2, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartGidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_gid not between", value1, value2, "shoppingcartGid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidIsNull() {
            addCriterion("shoppingcart_mvid is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidIsNotNull() {
            addCriterion("shoppingcart_mvid is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidEqualTo(Integer value) {
            addCriterion("shoppingcart_mvid =", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidNotEqualTo(Integer value) {
            addCriterion("shoppingcart_mvid <>", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidGreaterThan(Integer value) {
            addCriterion("shoppingcart_mvid >", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_mvid >=", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidLessThan(Integer value) {
            addCriterion("shoppingcart_mvid <", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidLessThanOrEqualTo(Integer value) {
            addCriterion("shoppingcart_mvid <=", value, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidIn(List<Integer> values) {
            addCriterion("shoppingcart_mvid in", values, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidNotIn(List<Integer> values) {
            addCriterion("shoppingcart_mvid not in", values, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_mvid between", value1, value2, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMvidNotBetween(Integer value1, Integer value2) {
            addCriterion("shoppingcart_mvid not between", value1, value2, "shoppingcartMvid");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyIsNull() {
            addCriterion("shoppingcart_money is null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyIsNotNull() {
            addCriterion("shoppingcart_money is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyEqualTo(Double value) {
            addCriterion("shoppingcart_money =", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyNotEqualTo(Double value) {
            addCriterion("shoppingcart_money <>", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyGreaterThan(Double value) {
            addCriterion("shoppingcart_money >", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("shoppingcart_money >=", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyLessThan(Double value) {
            addCriterion("shoppingcart_money <", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyLessThanOrEqualTo(Double value) {
            addCriterion("shoppingcart_money <=", value, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyIn(List<Double> values) {
            addCriterion("shoppingcart_money in", values, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyNotIn(List<Double> values) {
            addCriterion("shoppingcart_money not in", values, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyBetween(Double value1, Double value2) {
            addCriterion("shoppingcart_money between", value1, value2, "shoppingcartMoney");
            return (Criteria) this;
        }

        public Criteria andShoppingcartMoneyNotBetween(Double value1, Double value2) {
            addCriterion("shoppingcart_money not between", value1, value2, "shoppingcartMoney");
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