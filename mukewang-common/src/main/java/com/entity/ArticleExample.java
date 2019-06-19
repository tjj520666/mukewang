package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleUidIsNull() {
            addCriterion("article_uid is null");
            return (Criteria) this;
        }

        public Criteria andArticleUidIsNotNull() {
            addCriterion("article_uid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUidEqualTo(Integer value) {
            addCriterion("article_uid =", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidNotEqualTo(Integer value) {
            addCriterion("article_uid <>", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidGreaterThan(Integer value) {
            addCriterion("article_uid >", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_uid >=", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidLessThan(Integer value) {
            addCriterion("article_uid <", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidLessThanOrEqualTo(Integer value) {
            addCriterion("article_uid <=", value, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidIn(List<Integer> values) {
            addCriterion("article_uid in", values, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidNotIn(List<Integer> values) {
            addCriterion("article_uid not in", values, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidBetween(Integer value1, Integer value2) {
            addCriterion("article_uid between", value1, value2, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleUidNotBetween(Integer value1, Integer value2) {
            addCriterion("article_uid not between", value1, value2, "articleUid");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumIsNull() {
            addCriterion("article_likenum is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumIsNotNull() {
            addCriterion("article_likenum is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumEqualTo(Integer value) {
            addCriterion("article_likenum =", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumNotEqualTo(Integer value) {
            addCriterion("article_likenum <>", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumGreaterThan(Integer value) {
            addCriterion("article_likenum >", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_likenum >=", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumLessThan(Integer value) {
            addCriterion("article_likenum <", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("article_likenum <=", value, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumIn(List<Integer> values) {
            addCriterion("article_likenum in", values, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumNotIn(List<Integer> values) {
            addCriterion("article_likenum not in", values, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumBetween(Integer value1, Integer value2) {
            addCriterion("article_likenum between", value1, value2, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_likenum not between", value1, value2, "articleLikenum");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNull() {
            addCriterion("article_image is null");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNotNull() {
            addCriterion("article_image is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImageEqualTo(String value) {
            addCriterion("article_image =", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotEqualTo(String value) {
            addCriterion("article_image <>", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThan(String value) {
            addCriterion("article_image >", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThanOrEqualTo(String value) {
            addCriterion("article_image >=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThan(String value) {
            addCriterion("article_image <", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThanOrEqualTo(String value) {
            addCriterion("article_image <=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLike(String value) {
            addCriterion("article_image like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotLike(String value) {
            addCriterion("article_image not like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageIn(List<String> values) {
            addCriterion("article_image in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotIn(List<String> values) {
            addCriterion("article_image not in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageBetween(String value1, String value2) {
            addCriterion("article_image between", value1, value2, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotBetween(String value1, String value2) {
            addCriterion("article_image not between", value1, value2, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNull() {
            addCriterion("article_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIsNotNull() {
            addCriterion("article_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTimeEqualTo(Date value) {
            addCriterion("article_time =", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotEqualTo(Date value) {
            addCriterion("article_time <>", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThan(Date value) {
            addCriterion("article_time >", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_time >=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThan(Date value) {
            addCriterion("article_time <", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_time <=", value, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeIn(List<Date> values) {
            addCriterion("article_time in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotIn(List<Date> values) {
            addCriterion("article_time not in", values, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeBetween(Date value1, Date value2) {
            addCriterion("article_time between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticleTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_time not between", value1, value2, "articleTime");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumIsNull() {
            addCriterion("article_personnum is null");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumIsNotNull() {
            addCriterion("article_personnum is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumEqualTo(Integer value) {
            addCriterion("article_personnum =", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumNotEqualTo(Integer value) {
            addCriterion("article_personnum <>", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumGreaterThan(Integer value) {
            addCriterion("article_personnum >", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_personnum >=", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumLessThan(Integer value) {
            addCriterion("article_personnum <", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumLessThanOrEqualTo(Integer value) {
            addCriterion("article_personnum <=", value, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumIn(List<Integer> values) {
            addCriterion("article_personnum in", values, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumNotIn(List<Integer> values) {
            addCriterion("article_personnum not in", values, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumBetween(Integer value1, Integer value2) {
            addCriterion("article_personnum between", value1, value2, "articlePersonnum");
            return (Criteria) this;
        }

        public Criteria andArticlePersonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("article_personnum not between", value1, value2, "articlePersonnum");
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