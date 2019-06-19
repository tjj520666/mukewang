package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentUidIsNull() {
            addCriterion("comment_uid is null");
            return (Criteria) this;
        }

        public Criteria andCommentUidIsNotNull() {
            addCriterion("comment_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUidEqualTo(Integer value) {
            addCriterion("comment_uid =", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotEqualTo(Integer value) {
            addCriterion("comment_uid <>", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidGreaterThan(Integer value) {
            addCriterion("comment_uid >", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_uid >=", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidLessThan(Integer value) {
            addCriterion("comment_uid <", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_uid <=", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidIn(List<Integer> values) {
            addCriterion("comment_uid in", values, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotIn(List<Integer> values) {
            addCriterion("comment_uid not in", values, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidBetween(Integer value1, Integer value2) {
            addCriterion("comment_uid between", value1, value2, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_uid not between", value1, value2, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUnameIsNull() {
            addCriterion("comment_uname is null");
            return (Criteria) this;
        }

        public Criteria andCommentUnameIsNotNull() {
            addCriterion("comment_uname is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUnameEqualTo(String value) {
            addCriterion("comment_uname =", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameNotEqualTo(String value) {
            addCriterion("comment_uname <>", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameGreaterThan(String value) {
            addCriterion("comment_uname >", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_uname >=", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameLessThan(String value) {
            addCriterion("comment_uname <", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameLessThanOrEqualTo(String value) {
            addCriterion("comment_uname <=", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameLike(String value) {
            addCriterion("comment_uname like", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameNotLike(String value) {
            addCriterion("comment_uname not like", value, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameIn(List<String> values) {
            addCriterion("comment_uname in", values, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameNotIn(List<String> values) {
            addCriterion("comment_uname not in", values, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameBetween(String value1, String value2) {
            addCriterion("comment_uname between", value1, value2, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentUnameNotBetween(String value1, String value2) {
            addCriterion("comment_uname not between", value1, value2, "commentUname");
            return (Criteria) this;
        }

        public Criteria andCommentCidIsNull() {
            addCriterion("comment_cid is null");
            return (Criteria) this;
        }

        public Criteria andCommentCidIsNotNull() {
            addCriterion("comment_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCidEqualTo(Integer value) {
            addCriterion("comment_cid =", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidNotEqualTo(Integer value) {
            addCriterion("comment_cid <>", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidGreaterThan(Integer value) {
            addCriterion("comment_cid >", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_cid >=", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidLessThan(Integer value) {
            addCriterion("comment_cid <", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_cid <=", value, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidIn(List<Integer> values) {
            addCriterion("comment_cid in", values, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidNotIn(List<Integer> values) {
            addCriterion("comment_cid not in", values, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidBetween(Integer value1, Integer value2) {
            addCriterion("comment_cid between", value1, value2, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentCidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_cid not between", value1, value2, "commentCid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidIsNull() {
            addCriterion("comment_touid is null");
            return (Criteria) this;
        }

        public Criteria andCommentTouidIsNotNull() {
            addCriterion("comment_touid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTouidEqualTo(Integer value) {
            addCriterion("comment_touid =", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidNotEqualTo(Integer value) {
            addCriterion("comment_touid <>", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidGreaterThan(Integer value) {
            addCriterion("comment_touid >", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_touid >=", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidLessThan(Integer value) {
            addCriterion("comment_touid <", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_touid <=", value, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidIn(List<Integer> values) {
            addCriterion("comment_touid in", values, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidNotIn(List<Integer> values) {
            addCriterion("comment_touid not in", values, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidBetween(Integer value1, Integer value2) {
            addCriterion("comment_touid between", value1, value2, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentTouidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_touid not between", value1, value2, "commentTouid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidIsNull() {
            addCriterion("comment_mvid is null");
            return (Criteria) this;
        }

        public Criteria andCommentMvidIsNotNull() {
            addCriterion("comment_mvid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentMvidEqualTo(Integer value) {
            addCriterion("comment_mvid =", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidNotEqualTo(Integer value) {
            addCriterion("comment_mvid <>", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidGreaterThan(Integer value) {
            addCriterion("comment_mvid >", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_mvid >=", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidLessThan(Integer value) {
            addCriterion("comment_mvid <", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_mvid <=", value, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidIn(List<Integer> values) {
            addCriterion("comment_mvid in", values, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidNotIn(List<Integer> values) {
            addCriterion("comment_mvid not in", values, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidBetween(Integer value1, Integer value2) {
            addCriterion("comment_mvid between", value1, value2, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentMvidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_mvid not between", value1, value2, "commentMvid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidIsNull() {
            addCriterion("comment_sectionid is null");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidIsNotNull() {
            addCriterion("comment_sectionid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidEqualTo(Integer value) {
            addCriterion("comment_sectionid =", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidNotEqualTo(Integer value) {
            addCriterion("comment_sectionid <>", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidGreaterThan(Integer value) {
            addCriterion("comment_sectionid >", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_sectionid >=", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidLessThan(Integer value) {
            addCriterion("comment_sectionid <", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_sectionid <=", value, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidIn(List<Integer> values) {
            addCriterion("comment_sectionid in", values, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidNotIn(List<Integer> values) {
            addCriterion("comment_sectionid not in", values, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidBetween(Integer value1, Integer value2) {
            addCriterion("comment_sectionid between", value1, value2, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_sectionid not between", value1, value2, "commentSectionid");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleIsNull() {
            addCriterion("comment_sectiontitle is null");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleIsNotNull() {
            addCriterion("comment_sectiontitle is not null");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleEqualTo(String value) {
            addCriterion("comment_sectiontitle =", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleNotEqualTo(String value) {
            addCriterion("comment_sectiontitle <>", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleGreaterThan(String value) {
            addCriterion("comment_sectiontitle >", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleGreaterThanOrEqualTo(String value) {
            addCriterion("comment_sectiontitle >=", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleLessThan(String value) {
            addCriterion("comment_sectiontitle <", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleLessThanOrEqualTo(String value) {
            addCriterion("comment_sectiontitle <=", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleLike(String value) {
            addCriterion("comment_sectiontitle like", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleNotLike(String value) {
            addCriterion("comment_sectiontitle not like", value, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleIn(List<String> values) {
            addCriterion("comment_sectiontitle in", values, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleNotIn(List<String> values) {
            addCriterion("comment_sectiontitle not in", values, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleBetween(String value1, String value2) {
            addCriterion("comment_sectiontitle between", value1, value2, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentSectiontitleNotBetween(String value1, String value2) {
            addCriterion("comment_sectiontitle not between", value1, value2, "commentSectiontitle");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNull() {
            addCriterion("comment_number is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNotNull() {
            addCriterion("comment_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberEqualTo(Integer value) {
            addCriterion("comment_number =", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotEqualTo(Integer value) {
            addCriterion("comment_number <>", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThan(Integer value) {
            addCriterion("comment_number >", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_number >=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThan(Integer value) {
            addCriterion("comment_number <", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("comment_number <=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIn(List<Integer> values) {
            addCriterion("comment_number in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotIn(List<Integer> values) {
            addCriterion("comment_number not in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberBetween(Integer value1, Integer value2) {
            addCriterion("comment_number between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_number not between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Integer value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Integer value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Integer value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Integer value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Integer> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Integer> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Integer value1, Integer value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
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