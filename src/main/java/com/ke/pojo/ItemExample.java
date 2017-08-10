package com.ke.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemtitleIsNull() {
            addCriterion("itemTitle is null");
            return (Criteria) this;
        }

        public Criteria andItemtitleIsNotNull() {
            addCriterion("itemTitle is not null");
            return (Criteria) this;
        }

        public Criteria andItemtitleEqualTo(String value) {
            addCriterion("itemTitle =", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleNotEqualTo(String value) {
            addCriterion("itemTitle <>", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleGreaterThan(String value) {
            addCriterion("itemTitle >", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleGreaterThanOrEqualTo(String value) {
            addCriterion("itemTitle >=", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleLessThan(String value) {
            addCriterion("itemTitle <", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleLessThanOrEqualTo(String value) {
            addCriterion("itemTitle <=", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleLike(String value) {
            addCriterion("itemTitle like", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleNotLike(String value) {
            addCriterion("itemTitle not like", value, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleIn(List<String> values) {
            addCriterion("itemTitle in", values, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleNotIn(List<String> values) {
            addCriterion("itemTitle not in", values, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleBetween(String value1, String value2) {
            addCriterion("itemTitle between", value1, value2, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemtitleNotBetween(String value1, String value2) {
            addCriterion("itemTitle not between", value1, value2, "itemtitle");
            return (Criteria) this;
        }

        public Criteria andItemurlIsNull() {
            addCriterion("itemUrl is null");
            return (Criteria) this;
        }

        public Criteria andItemurlIsNotNull() {
            addCriterion("itemUrl is not null");
            return (Criteria) this;
        }

        public Criteria andItemurlEqualTo(String value) {
            addCriterion("itemUrl =", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotEqualTo(String value) {
            addCriterion("itemUrl <>", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlGreaterThan(String value) {
            addCriterion("itemUrl >", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlGreaterThanOrEqualTo(String value) {
            addCriterion("itemUrl >=", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLessThan(String value) {
            addCriterion("itemUrl <", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLessThanOrEqualTo(String value) {
            addCriterion("itemUrl <=", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlLike(String value) {
            addCriterion("itemUrl like", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotLike(String value) {
            addCriterion("itemUrl not like", value, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlIn(List<String> values) {
            addCriterion("itemUrl in", values, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotIn(List<String> values) {
            addCriterion("itemUrl not in", values, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlBetween(String value1, String value2) {
            addCriterion("itemUrl between", value1, value2, "itemurl");
            return (Criteria) this;
        }

        public Criteria andItemurlNotBetween(String value1, String value2) {
            addCriterion("itemUrl not between", value1, value2, "itemurl");
            return (Criteria) this;
        }

        public Criteria andViewtimesIsNull() {
            addCriterion("viewTimes is null");
            return (Criteria) this;
        }

        public Criteria andViewtimesIsNotNull() {
            addCriterion("viewTimes is not null");
            return (Criteria) this;
        }

        public Criteria andViewtimesEqualTo(Integer value) {
            addCriterion("viewTimes =", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesNotEqualTo(Integer value) {
            addCriterion("viewTimes <>", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesGreaterThan(Integer value) {
            addCriterion("viewTimes >", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewTimes >=", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesLessThan(Integer value) {
            addCriterion("viewTimes <", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesLessThanOrEqualTo(Integer value) {
            addCriterion("viewTimes <=", value, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesIn(List<Integer> values) {
            addCriterion("viewTimes in", values, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesNotIn(List<Integer> values) {
            addCriterion("viewTimes not in", values, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesBetween(Integer value1, Integer value2) {
            addCriterion("viewTimes between", value1, value2, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andViewtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("viewTimes not between", value1, value2, "viewtimes");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNull() {
            addCriterion("sectionId is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionId is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Integer value) {
            addCriterion("sectionId =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Integer value) {
            addCriterion("sectionId <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Integer value) {
            addCriterion("sectionId >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionId >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Integer value) {
            addCriterion("sectionId <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("sectionId <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Integer> values) {
            addCriterion("sectionId in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Integer> values) {
            addCriterion("sectionId not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Integer value1, Integer value2) {
            addCriterion("sectionId between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionId not between", value1, value2, "sectionid");
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