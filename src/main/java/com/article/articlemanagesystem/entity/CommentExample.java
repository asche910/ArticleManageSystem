package com.article.articlemanagesystem.entity;

import java.util.ArrayList;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Long value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Long value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Long value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Long value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Long value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Long value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Long> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Long> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Long value1, Long value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Long value1, Long value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("likeNum is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Integer value) {
            addCriterion("likeNum =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Integer value) {
            addCriterion("likeNum <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Integer value) {
            addCriterion("likeNum >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeNum >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Integer value) {
            addCriterion("likeNum <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("likeNum <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Integer> values) {
            addCriterion("likeNum in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Integer> values) {
            addCriterion("likeNum not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Integer value1, Integer value2) {
            addCriterion("likeNum between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("likeNum not between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andUserauthorIsNull() {
            addCriterion("userAuthor is null");
            return (Criteria) this;
        }

        public Criteria andUserauthorIsNotNull() {
            addCriterion("userAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andUserauthorEqualTo(String value) {
            addCriterion("userAuthor =", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorNotEqualTo(String value) {
            addCriterion("userAuthor <>", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorGreaterThan(String value) {
            addCriterion("userAuthor >", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorGreaterThanOrEqualTo(String value) {
            addCriterion("userAuthor >=", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorLessThan(String value) {
            addCriterion("userAuthor <", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorLessThanOrEqualTo(String value) {
            addCriterion("userAuthor <=", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorLike(String value) {
            addCriterion("userAuthor like", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorNotLike(String value) {
            addCriterion("userAuthor not like", value, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorIn(List<String> values) {
            addCriterion("userAuthor in", values, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorNotIn(List<String> values) {
            addCriterion("userAuthor not in", values, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorBetween(String value1, String value2) {
            addCriterion("userAuthor between", value1, value2, "userauthor");
            return (Criteria) this;
        }

        public Criteria andUserauthorNotBetween(String value1, String value2) {
            addCriterion("userAuthor not between", value1, value2, "userauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorIsNull() {
            addCriterion("imgAuthor is null");
            return (Criteria) this;
        }

        public Criteria andImgauthorIsNotNull() {
            addCriterion("imgAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andImgauthorEqualTo(String value) {
            addCriterion("imgAuthor =", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorNotEqualTo(String value) {
            addCriterion("imgAuthor <>", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorGreaterThan(String value) {
            addCriterion("imgAuthor >", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorGreaterThanOrEqualTo(String value) {
            addCriterion("imgAuthor >=", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorLessThan(String value) {
            addCriterion("imgAuthor <", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorLessThanOrEqualTo(String value) {
            addCriterion("imgAuthor <=", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorLike(String value) {
            addCriterion("imgAuthor like", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorNotLike(String value) {
            addCriterion("imgAuthor not like", value, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorIn(List<String> values) {
            addCriterion("imgAuthor in", values, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorNotIn(List<String> values) {
            addCriterion("imgAuthor not in", values, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorBetween(String value1, String value2) {
            addCriterion("imgAuthor between", value1, value2, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andImgauthorNotBetween(String value1, String value2) {
            addCriterion("imgAuthor not between", value1, value2, "imgauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorIsNull() {
            addCriterion("nameAuthor is null");
            return (Criteria) this;
        }

        public Criteria andNameauthorIsNotNull() {
            addCriterion("nameAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andNameauthorEqualTo(String value) {
            addCriterion("nameAuthor =", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorNotEqualTo(String value) {
            addCriterion("nameAuthor <>", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorGreaterThan(String value) {
            addCriterion("nameAuthor >", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorGreaterThanOrEqualTo(String value) {
            addCriterion("nameAuthor >=", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorLessThan(String value) {
            addCriterion("nameAuthor <", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorLessThanOrEqualTo(String value) {
            addCriterion("nameAuthor <=", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorLike(String value) {
            addCriterion("nameAuthor like", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorNotLike(String value) {
            addCriterion("nameAuthor not like", value, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorIn(List<String> values) {
            addCriterion("nameAuthor in", values, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorNotIn(List<String> values) {
            addCriterion("nameAuthor not in", values, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorBetween(String value1, String value2) {
            addCriterion("nameAuthor between", value1, value2, "nameauthor");
            return (Criteria) this;
        }

        public Criteria andNameauthorNotBetween(String value1, String value2) {
            addCriterion("nameAuthor not between", value1, value2, "nameauthor");
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