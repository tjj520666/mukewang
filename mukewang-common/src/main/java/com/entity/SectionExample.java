package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
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

        public Criteria andSectionIdIsNull() {
            addCriterion("section_id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("section_id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("section_id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("section_id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("section_id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("section_id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleIsNull() {
            addCriterion("section_onsale is null");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleIsNotNull() {
            addCriterion("section_onsale is not null");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleEqualTo(Integer value) {
            addCriterion("section_onsale =", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleNotEqualTo(Integer value) {
            addCriterion("section_onsale <>", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleGreaterThan(Integer value) {
            addCriterion("section_onsale >", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_onsale >=", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleLessThan(Integer value) {
            addCriterion("section_onsale <", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleLessThanOrEqualTo(Integer value) {
            addCriterion("section_onsale <=", value, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleIn(List<Integer> values) {
            addCriterion("section_onsale in", values, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleNotIn(List<Integer> values) {
            addCriterion("section_onsale not in", values, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleBetween(Integer value1, Integer value2) {
            addCriterion("section_onsale between", value1, value2, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionOnsaleNotBetween(Integer value1, Integer value2) {
            addCriterion("section_onsale not between", value1, value2, "sectionOnsale");
            return (Criteria) this;
        }

        public Criteria andSectionTitleIsNull() {
            addCriterion("section_title is null");
            return (Criteria) this;
        }

        public Criteria andSectionTitleIsNotNull() {
            addCriterion("section_title is not null");
            return (Criteria) this;
        }

        public Criteria andSectionTitleEqualTo(String value) {
            addCriterion("section_title =", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleNotEqualTo(String value) {
            addCriterion("section_title <>", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleGreaterThan(String value) {
            addCriterion("section_title >", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("section_title >=", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleLessThan(String value) {
            addCriterion("section_title <", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleLessThanOrEqualTo(String value) {
            addCriterion("section_title <=", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleLike(String value) {
            addCriterion("section_title like", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleNotLike(String value) {
            addCriterion("section_title not like", value, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleIn(List<String> values) {
            addCriterion("section_title in", values, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleNotIn(List<String> values) {
            addCriterion("section_title not in", values, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleBetween(String value1, String value2) {
            addCriterion("section_title between", value1, value2, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionTitleNotBetween(String value1, String value2) {
            addCriterion("section_title not between", value1, value2, "sectionTitle");
            return (Criteria) this;
        }

        public Criteria andSectionIntroIsNull() {
            addCriterion("section_intro is null");
            return (Criteria) this;
        }

        public Criteria andSectionIntroIsNotNull() {
            addCriterion("section_intro is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIntroEqualTo(String value) {
            addCriterion("section_intro =", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroNotEqualTo(String value) {
            addCriterion("section_intro <>", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroGreaterThan(String value) {
            addCriterion("section_intro >", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroGreaterThanOrEqualTo(String value) {
            addCriterion("section_intro >=", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroLessThan(String value) {
            addCriterion("section_intro <", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroLessThanOrEqualTo(String value) {
            addCriterion("section_intro <=", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroLike(String value) {
            addCriterion("section_intro like", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroNotLike(String value) {
            addCriterion("section_intro not like", value, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroIn(List<String> values) {
            addCriterion("section_intro in", values, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroNotIn(List<String> values) {
            addCriterion("section_intro not in", values, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroBetween(String value1, String value2) {
            addCriterion("section_intro between", value1, value2, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionIntroNotBetween(String value1, String value2) {
            addCriterion("section_intro not between", value1, value2, "sectionIntro");
            return (Criteria) this;
        }

        public Criteria andSectionMvIsNull() {
            addCriterion("section_mv is null");
            return (Criteria) this;
        }

        public Criteria andSectionMvIsNotNull() {
            addCriterion("section_mv is not null");
            return (Criteria) this;
        }

        public Criteria andSectionMvEqualTo(Integer value) {
            addCriterion("section_mv =", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvNotEqualTo(Integer value) {
            addCriterion("section_mv <>", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvGreaterThan(Integer value) {
            addCriterion("section_mv >", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_mv >=", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvLessThan(Integer value) {
            addCriterion("section_mv <", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvLessThanOrEqualTo(Integer value) {
            addCriterion("section_mv <=", value, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvIn(List<Integer> values) {
            addCriterion("section_mv in", values, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvNotIn(List<Integer> values) {
            addCriterion("section_mv not in", values, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvBetween(Integer value1, Integer value2) {
            addCriterion("section_mv between", value1, value2, "sectionMv");
            return (Criteria) this;
        }

        public Criteria andSectionMvNotBetween(Integer value1, Integer value2) {
            addCriterion("section_mv not between", value1, value2, "sectionMv");
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