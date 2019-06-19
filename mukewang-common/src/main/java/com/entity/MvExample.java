package com.entity;

import java.util.ArrayList;
import java.util.List;

public class MvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MvExample() {
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

        public Criteria andMvIdIsNull() {
            addCriterion("mv_id is null");
            return (Criteria) this;
        }

        public Criteria andMvIdIsNotNull() {
            addCriterion("mv_id is not null");
            return (Criteria) this;
        }

        public Criteria andMvIdEqualTo(Integer value) {
            addCriterion("mv_id =", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotEqualTo(Integer value) {
            addCriterion("mv_id <>", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThan(Integer value) {
            addCriterion("mv_id >", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_id >=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThan(Integer value) {
            addCriterion("mv_id <", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdLessThanOrEqualTo(Integer value) {
            addCriterion("mv_id <=", value, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdIn(List<Integer> values) {
            addCriterion("mv_id in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotIn(List<Integer> values) {
            addCriterion("mv_id not in", values, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdBetween(Integer value1, Integer value2) {
            addCriterion("mv_id between", value1, value2, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_id not between", value1, value2, "mvId");
            return (Criteria) this;
        }

        public Criteria andMvNameIsNull() {
            addCriterion("mv_name is null");
            return (Criteria) this;
        }

        public Criteria andMvNameIsNotNull() {
            addCriterion("mv_name is not null");
            return (Criteria) this;
        }

        public Criteria andMvNameEqualTo(String value) {
            addCriterion("mv_name =", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotEqualTo(String value) {
            addCriterion("mv_name <>", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameGreaterThan(String value) {
            addCriterion("mv_name >", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameGreaterThanOrEqualTo(String value) {
            addCriterion("mv_name >=", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLessThan(String value) {
            addCriterion("mv_name <", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLessThanOrEqualTo(String value) {
            addCriterion("mv_name <=", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameLike(String value) {
            addCriterion("mv_name like", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotLike(String value) {
            addCriterion("mv_name not like", value, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameIn(List<String> values) {
            addCriterion("mv_name in", values, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotIn(List<String> values) {
            addCriterion("mv_name not in", values, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameBetween(String value1, String value2) {
            addCriterion("mv_name between", value1, value2, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvNameNotBetween(String value1, String value2) {
            addCriterion("mv_name not between", value1, value2, "mvName");
            return (Criteria) this;
        }

        public Criteria andMvTitleIsNull() {
            addCriterion("mv_title is null");
            return (Criteria) this;
        }

        public Criteria andMvTitleIsNotNull() {
            addCriterion("mv_title is not null");
            return (Criteria) this;
        }

        public Criteria andMvTitleEqualTo(String value) {
            addCriterion("mv_title =", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleNotEqualTo(String value) {
            addCriterion("mv_title <>", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleGreaterThan(String value) {
            addCriterion("mv_title >", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mv_title >=", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleLessThan(String value) {
            addCriterion("mv_title <", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleLessThanOrEqualTo(String value) {
            addCriterion("mv_title <=", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleLike(String value) {
            addCriterion("mv_title like", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleNotLike(String value) {
            addCriterion("mv_title not like", value, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleIn(List<String> values) {
            addCriterion("mv_title in", values, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleNotIn(List<String> values) {
            addCriterion("mv_title not in", values, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleBetween(String value1, String value2) {
            addCriterion("mv_title between", value1, value2, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvTitleNotBetween(String value1, String value2) {
            addCriterion("mv_title not between", value1, value2, "mvTitle");
            return (Criteria) this;
        }

        public Criteria andMvDetailsIsNull() {
            addCriterion("mv_details is null");
            return (Criteria) this;
        }

        public Criteria andMvDetailsIsNotNull() {
            addCriterion("mv_details is not null");
            return (Criteria) this;
        }

        public Criteria andMvDetailsEqualTo(String value) {
            addCriterion("mv_details =", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsNotEqualTo(String value) {
            addCriterion("mv_details <>", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsGreaterThan(String value) {
            addCriterion("mv_details >", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("mv_details >=", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsLessThan(String value) {
            addCriterion("mv_details <", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsLessThanOrEqualTo(String value) {
            addCriterion("mv_details <=", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsLike(String value) {
            addCriterion("mv_details like", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsNotLike(String value) {
            addCriterion("mv_details not like", value, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsIn(List<String> values) {
            addCriterion("mv_details in", values, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsNotIn(List<String> values) {
            addCriterion("mv_details not in", values, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsBetween(String value1, String value2) {
            addCriterion("mv_details between", value1, value2, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDetailsNotBetween(String value1, String value2) {
            addCriterion("mv_details not between", value1, value2, "mvDetails");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidIsNull() {
            addCriterion("mv_difficultyId is null");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidIsNotNull() {
            addCriterion("mv_difficultyId is not null");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidEqualTo(Integer value) {
            addCriterion("mv_difficultyId =", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidNotEqualTo(Integer value) {
            addCriterion("mv_difficultyId <>", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidGreaterThan(Integer value) {
            addCriterion("mv_difficultyId >", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_difficultyId >=", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidLessThan(Integer value) {
            addCriterion("mv_difficultyId <", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidLessThanOrEqualTo(Integer value) {
            addCriterion("mv_difficultyId <=", value, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidIn(List<Integer> values) {
            addCriterion("mv_difficultyId in", values, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidNotIn(List<Integer> values) {
            addCriterion("mv_difficultyId not in", values, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidBetween(Integer value1, Integer value2) {
            addCriterion("mv_difficultyId between", value1, value2, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvDifficultyidNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_difficultyId not between", value1, value2, "mvDifficultyid");
            return (Criteria) this;
        }

        public Criteria andMvPriceIsNull() {
            addCriterion("mv_price is null");
            return (Criteria) this;
        }

        public Criteria andMvPriceIsNotNull() {
            addCriterion("mv_price is not null");
            return (Criteria) this;
        }

        public Criteria andMvPriceEqualTo(Double value) {
            addCriterion("mv_price =", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceNotEqualTo(Double value) {
            addCriterion("mv_price <>", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceGreaterThan(Double value) {
            addCriterion("mv_price >", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mv_price >=", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceLessThan(Double value) {
            addCriterion("mv_price <", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceLessThanOrEqualTo(Double value) {
            addCriterion("mv_price <=", value, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceIn(List<Double> values) {
            addCriterion("mv_price in", values, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceNotIn(List<Double> values) {
            addCriterion("mv_price not in", values, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceBetween(Double value1, Double value2) {
            addCriterion("mv_price between", value1, value2, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvPriceNotBetween(Double value1, Double value2) {
            addCriterion("mv_price not between", value1, value2, "mvPrice");
            return (Criteria) this;
        }

        public Criteria andMvType1idIsNull() {
            addCriterion("mv_type1id is null");
            return (Criteria) this;
        }

        public Criteria andMvType1idIsNotNull() {
            addCriterion("mv_type1id is not null");
            return (Criteria) this;
        }

        public Criteria andMvType1idEqualTo(Integer value) {
            addCriterion("mv_type1id =", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idNotEqualTo(Integer value) {
            addCriterion("mv_type1id <>", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idGreaterThan(Integer value) {
            addCriterion("mv_type1id >", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_type1id >=", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idLessThan(Integer value) {
            addCriterion("mv_type1id <", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idLessThanOrEqualTo(Integer value) {
            addCriterion("mv_type1id <=", value, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idIn(List<Integer> values) {
            addCriterion("mv_type1id in", values, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idNotIn(List<Integer> values) {
            addCriterion("mv_type1id not in", values, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idBetween(Integer value1, Integer value2) {
            addCriterion("mv_type1id between", value1, value2, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType1idNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_type1id not between", value1, value2, "mvType1id");
            return (Criteria) this;
        }

        public Criteria andMvType2idIsNull() {
            addCriterion("mv_type2id is null");
            return (Criteria) this;
        }

        public Criteria andMvType2idIsNotNull() {
            addCriterion("mv_type2id is not null");
            return (Criteria) this;
        }

        public Criteria andMvType2idEqualTo(Integer value) {
            addCriterion("mv_type2id =", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idNotEqualTo(Integer value) {
            addCriterion("mv_type2id <>", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idGreaterThan(Integer value) {
            addCriterion("mv_type2id >", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_type2id >=", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idLessThan(Integer value) {
            addCriterion("mv_type2id <", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idLessThanOrEqualTo(Integer value) {
            addCriterion("mv_type2id <=", value, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idIn(List<Integer> values) {
            addCriterion("mv_type2id in", values, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idNotIn(List<Integer> values) {
            addCriterion("mv_type2id not in", values, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idBetween(Integer value1, Integer value2) {
            addCriterion("mv_type2id between", value1, value2, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType2idNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_type2id not between", value1, value2, "mvType2id");
            return (Criteria) this;
        }

        public Criteria andMvType3idIsNull() {
            addCriterion("mv_type3id is null");
            return (Criteria) this;
        }

        public Criteria andMvType3idIsNotNull() {
            addCriterion("mv_type3id is not null");
            return (Criteria) this;
        }

        public Criteria andMvType3idEqualTo(Integer value) {
            addCriterion("mv_type3id =", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idNotEqualTo(Integer value) {
            addCriterion("mv_type3id <>", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idGreaterThan(Integer value) {
            addCriterion("mv_type3id >", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_type3id >=", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idLessThan(Integer value) {
            addCriterion("mv_type3id <", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idLessThanOrEqualTo(Integer value) {
            addCriterion("mv_type3id <=", value, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idIn(List<Integer> values) {
            addCriterion("mv_type3id in", values, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idNotIn(List<Integer> values) {
            addCriterion("mv_type3id not in", values, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idBetween(Integer value1, Integer value2) {
            addCriterion("mv_type3id between", value1, value2, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvType3idNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_type3id not between", value1, value2, "mvType3id");
            return (Criteria) this;
        }

        public Criteria andMvImageIsNull() {
            addCriterion("mv_image is null");
            return (Criteria) this;
        }

        public Criteria andMvImageIsNotNull() {
            addCriterion("mv_image is not null");
            return (Criteria) this;
        }

        public Criteria andMvImageEqualTo(String value) {
            addCriterion("mv_image =", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageNotEqualTo(String value) {
            addCriterion("mv_image <>", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageGreaterThan(String value) {
            addCriterion("mv_image >", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageGreaterThanOrEqualTo(String value) {
            addCriterion("mv_image >=", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageLessThan(String value) {
            addCriterion("mv_image <", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageLessThanOrEqualTo(String value) {
            addCriterion("mv_image <=", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageLike(String value) {
            addCriterion("mv_image like", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageNotLike(String value) {
            addCriterion("mv_image not like", value, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageIn(List<String> values) {
            addCriterion("mv_image in", values, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageNotIn(List<String> values) {
            addCriterion("mv_image not in", values, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageBetween(String value1, String value2) {
            addCriterion("mv_image between", value1, value2, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvImageNotBetween(String value1, String value2) {
            addCriterion("mv_image not between", value1, value2, "mvImage");
            return (Criteria) this;
        }

        public Criteria andMvScopeIsNull() {
            addCriterion("mv_scope is null");
            return (Criteria) this;
        }

        public Criteria andMvScopeIsNotNull() {
            addCriterion("mv_scope is not null");
            return (Criteria) this;
        }

        public Criteria andMvScopeEqualTo(Double value) {
            addCriterion("mv_scope =", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeNotEqualTo(Double value) {
            addCriterion("mv_scope <>", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeGreaterThan(Double value) {
            addCriterion("mv_scope >", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeGreaterThanOrEqualTo(Double value) {
            addCriterion("mv_scope >=", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeLessThan(Double value) {
            addCriterion("mv_scope <", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeLessThanOrEqualTo(Double value) {
            addCriterion("mv_scope <=", value, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeIn(List<Double> values) {
            addCriterion("mv_scope in", values, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeNotIn(List<Double> values) {
            addCriterion("mv_scope not in", values, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeBetween(Double value1, Double value2) {
            addCriterion("mv_scope between", value1, value2, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvScopeNotBetween(Double value1, Double value2) {
            addCriterion("mv_scope not between", value1, value2, "mvScope");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumIsNull() {
            addCriterion("mv_personnum is null");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumIsNotNull() {
            addCriterion("mv_personnum is not null");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumEqualTo(Integer value) {
            addCriterion("mv_personnum =", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumNotEqualTo(Integer value) {
            addCriterion("mv_personnum <>", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumGreaterThan(Integer value) {
            addCriterion("mv_personnum >", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_personnum >=", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumLessThan(Integer value) {
            addCriterion("mv_personnum <", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumLessThanOrEqualTo(Integer value) {
            addCriterion("mv_personnum <=", value, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumIn(List<Integer> values) {
            addCriterion("mv_personnum in", values, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumNotIn(List<Integer> values) {
            addCriterion("mv_personnum not in", values, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumBetween(Integer value1, Integer value2) {
            addCriterion("mv_personnum between", value1, value2, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvPersonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_personnum not between", value1, value2, "mvPersonnum");
            return (Criteria) this;
        }

        public Criteria andMvDurationIsNull() {
            addCriterion("mv_duration is null");
            return (Criteria) this;
        }

        public Criteria andMvDurationIsNotNull() {
            addCriterion("mv_duration is not null");
            return (Criteria) this;
        }

        public Criteria andMvDurationEqualTo(Double value) {
            addCriterion("mv_duration =", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationNotEqualTo(Double value) {
            addCriterion("mv_duration <>", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationGreaterThan(Double value) {
            addCriterion("mv_duration >", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("mv_duration >=", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationLessThan(Double value) {
            addCriterion("mv_duration <", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationLessThanOrEqualTo(Double value) {
            addCriterion("mv_duration <=", value, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationIn(List<Double> values) {
            addCriterion("mv_duration in", values, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationNotIn(List<Double> values) {
            addCriterion("mv_duration not in", values, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationBetween(Double value1, Double value2) {
            addCriterion("mv_duration between", value1, value2, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvDurationNotBetween(Double value1, Double value2) {
            addCriterion("mv_duration not between", value1, value2, "mvDuration");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridIsNull() {
            addCriterion("mv_teacherid is null");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridIsNotNull() {
            addCriterion("mv_teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridEqualTo(Integer value) {
            addCriterion("mv_teacherid =", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridNotEqualTo(Integer value) {
            addCriterion("mv_teacherid <>", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridGreaterThan(Integer value) {
            addCriterion("mv_teacherid >", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_teacherid >=", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridLessThan(Integer value) {
            addCriterion("mv_teacherid <", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("mv_teacherid <=", value, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridIn(List<Integer> values) {
            addCriterion("mv_teacherid in", values, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridNotIn(List<Integer> values) {
            addCriterion("mv_teacherid not in", values, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("mv_teacherid between", value1, value2, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_teacherid not between", value1, value2, "mvTeacherid");
            return (Criteria) this;
        }

        public Criteria andMvTeacherIsNull() {
            addCriterion("mv_teacher is null");
            return (Criteria) this;
        }

        public Criteria andMvTeacherIsNotNull() {
            addCriterion("mv_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andMvTeacherEqualTo(String value) {
            addCriterion("mv_teacher =", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherNotEqualTo(String value) {
            addCriterion("mv_teacher <>", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherGreaterThan(String value) {
            addCriterion("mv_teacher >", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("mv_teacher >=", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherLessThan(String value) {
            addCriterion("mv_teacher <", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherLessThanOrEqualTo(String value) {
            addCriterion("mv_teacher <=", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherLike(String value) {
            addCriterion("mv_teacher like", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherNotLike(String value) {
            addCriterion("mv_teacher not like", value, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherIn(List<String> values) {
            addCriterion("mv_teacher in", values, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherNotIn(List<String> values) {
            addCriterion("mv_teacher not in", values, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherBetween(String value1, String value2) {
            addCriterion("mv_teacher between", value1, value2, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvTeacherNotBetween(String value1, String value2) {
            addCriterion("mv_teacher not between", value1, value2, "mvTeacher");
            return (Criteria) this;
        }

        public Criteria andMvKnowIsNull() {
            addCriterion("mv_know is null");
            return (Criteria) this;
        }

        public Criteria andMvKnowIsNotNull() {
            addCriterion("mv_know is not null");
            return (Criteria) this;
        }

        public Criteria andMvKnowEqualTo(String value) {
            addCriterion("mv_know =", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowNotEqualTo(String value) {
            addCriterion("mv_know <>", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowGreaterThan(String value) {
            addCriterion("mv_know >", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowGreaterThanOrEqualTo(String value) {
            addCriterion("mv_know >=", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowLessThan(String value) {
            addCriterion("mv_know <", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowLessThanOrEqualTo(String value) {
            addCriterion("mv_know <=", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowLike(String value) {
            addCriterion("mv_know like", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowNotLike(String value) {
            addCriterion("mv_know not like", value, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowIn(List<String> values) {
            addCriterion("mv_know in", values, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowNotIn(List<String> values) {
            addCriterion("mv_know not in", values, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowBetween(String value1, String value2) {
            addCriterion("mv_know between", value1, value2, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvKnowNotBetween(String value1, String value2) {
            addCriterion("mv_know not between", value1, value2, "mvKnow");
            return (Criteria) this;
        }

        public Criteria andMvRsIsNull() {
            addCriterion("mv_rs is null");
            return (Criteria) this;
        }

        public Criteria andMvRsIsNotNull() {
            addCriterion("mv_rs is not null");
            return (Criteria) this;
        }

        public Criteria andMvRsEqualTo(Integer value) {
            addCriterion("mv_rs =", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsNotEqualTo(Integer value) {
            addCriterion("mv_rs <>", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsGreaterThan(Integer value) {
            addCriterion("mv_rs >", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_rs >=", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsLessThan(Integer value) {
            addCriterion("mv_rs <", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsLessThanOrEqualTo(Integer value) {
            addCriterion("mv_rs <=", value, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsIn(List<Integer> values) {
            addCriterion("mv_rs in", values, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsNotIn(List<Integer> values) {
            addCriterion("mv_rs not in", values, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsBetween(Integer value1, Integer value2) {
            addCriterion("mv_rs between", value1, value2, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvRsNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_rs not between", value1, value2, "mvRs");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchIsNull() {
            addCriterion("mv_hotsearch is null");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchIsNotNull() {
            addCriterion("mv_hotsearch is not null");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchEqualTo(Integer value) {
            addCriterion("mv_hotsearch =", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchNotEqualTo(Integer value) {
            addCriterion("mv_hotsearch <>", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchGreaterThan(Integer value) {
            addCriterion("mv_hotsearch >", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchGreaterThanOrEqualTo(Integer value) {
            addCriterion("mv_hotsearch >=", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchLessThan(Integer value) {
            addCriterion("mv_hotsearch <", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchLessThanOrEqualTo(Integer value) {
            addCriterion("mv_hotsearch <=", value, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchIn(List<Integer> values) {
            addCriterion("mv_hotsearch in", values, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchNotIn(List<Integer> values) {
            addCriterion("mv_hotsearch not in", values, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchBetween(Integer value1, Integer value2) {
            addCriterion("mv_hotsearch between", value1, value2, "mvHotsearch");
            return (Criteria) this;
        }

        public Criteria andMvHotsearchNotBetween(Integer value1, Integer value2) {
            addCriterion("mv_hotsearch not between", value1, value2, "mvHotsearch");
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