package com.yunjing.emer.entity;

import java.util.ArrayList;
import java.util.List;

public class WebsiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public WebsiteExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andWebsiteIdIsNull() {
            addCriterion("website_id is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdIsNotNull() {
            addCriterion("website_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdEqualTo(Integer value) {
            addCriterion("website_id =", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotEqualTo(Integer value) {
            addCriterion("website_id <>", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdGreaterThan(Integer value) {
            addCriterion("website_id >", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("website_id >=", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdLessThan(Integer value) {
            addCriterion("website_id <", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("website_id <=", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdIn(List<Integer> values) {
            addCriterion("website_id in", values, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotIn(List<Integer> values) {
            addCriterion("website_id not in", values, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("website_id between", value1, value2, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("website_id not between", value1, value2, "websiteId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andFlourExpIsNull() {
            addCriterion("flour_exp is null");
            return (Criteria) this;
        }

        public Criteria andFlourExpIsNotNull() {
            addCriterion("flour_exp is not null");
            return (Criteria) this;
        }

        public Criteria andFlourExpEqualTo(Double value) {
            addCriterion("flour_exp =", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpNotEqualTo(Double value) {
            addCriterion("flour_exp <>", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpGreaterThan(Double value) {
            addCriterion("flour_exp >", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpGreaterThanOrEqualTo(Double value) {
            addCriterion("flour_exp >=", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpLessThan(Double value) {
            addCriterion("flour_exp <", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpLessThanOrEqualTo(Double value) {
            addCriterion("flour_exp <=", value, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpIn(List<Double> values) {
            addCriterion("flour_exp in", values, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpNotIn(List<Double> values) {
            addCriterion("flour_exp not in", values, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpBetween(Double value1, Double value2) {
            addCriterion("flour_exp between", value1, value2, "flourExp");
            return (Criteria) this;
        }

        public Criteria andFlourExpNotBetween(Double value1, Double value2) {
            addCriterion("flour_exp not between", value1, value2, "flourExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpIsNull() {
            addCriterion("rice_exp is null");
            return (Criteria) this;
        }

        public Criteria andRiceExpIsNotNull() {
            addCriterion("rice_exp is not null");
            return (Criteria) this;
        }

        public Criteria andRiceExpEqualTo(Double value) {
            addCriterion("rice_exp =", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpNotEqualTo(Double value) {
            addCriterion("rice_exp <>", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpGreaterThan(Double value) {
            addCriterion("rice_exp >", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpGreaterThanOrEqualTo(Double value) {
            addCriterion("rice_exp >=", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpLessThan(Double value) {
            addCriterion("rice_exp <", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpLessThanOrEqualTo(Double value) {
            addCriterion("rice_exp <=", value, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpIn(List<Double> values) {
            addCriterion("rice_exp in", values, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpNotIn(List<Double> values) {
            addCriterion("rice_exp not in", values, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpBetween(Double value1, Double value2) {
            addCriterion("rice_exp between", value1, value2, "riceExp");
            return (Criteria) this;
        }

        public Criteria andRiceExpNotBetween(Double value1, Double value2) {
            addCriterion("rice_exp not between", value1, value2, "riceExp");
            return (Criteria) this;
        }

        public Criteria andOilExpIsNull() {
            addCriterion("oil_exp is null");
            return (Criteria) this;
        }

        public Criteria andOilExpIsNotNull() {
            addCriterion("oil_exp is not null");
            return (Criteria) this;
        }

        public Criteria andOilExpEqualTo(Double value) {
            addCriterion("oil_exp =", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpNotEqualTo(Double value) {
            addCriterion("oil_exp <>", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpGreaterThan(Double value) {
            addCriterion("oil_exp >", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_exp >=", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpLessThan(Double value) {
            addCriterion("oil_exp <", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpLessThanOrEqualTo(Double value) {
            addCriterion("oil_exp <=", value, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpIn(List<Double> values) {
            addCriterion("oil_exp in", values, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpNotIn(List<Double> values) {
            addCriterion("oil_exp not in", values, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpBetween(Double value1, Double value2) {
            addCriterion("oil_exp between", value1, value2, "oilExp");
            return (Criteria) this;
        }

        public Criteria andOilExpNotBetween(Double value1, Double value2) {
            addCriterion("oil_exp not between", value1, value2, "oilExp");
            return (Criteria) this;
        }

        public Criteria andElseExpIsNull() {
            addCriterion("else_exp is null");
            return (Criteria) this;
        }

        public Criteria andElseExpIsNotNull() {
            addCriterion("else_exp is not null");
            return (Criteria) this;
        }

        public Criteria andElseExpEqualTo(Double value) {
            addCriterion("else_exp =", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpNotEqualTo(Double value) {
            addCriterion("else_exp <>", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpGreaterThan(Double value) {
            addCriterion("else_exp >", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpGreaterThanOrEqualTo(Double value) {
            addCriterion("else_exp >=", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpLessThan(Double value) {
            addCriterion("else_exp <", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpLessThanOrEqualTo(Double value) {
            addCriterion("else_exp <=", value, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpIn(List<Double> values) {
            addCriterion("else_exp in", values, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpNotIn(List<Double> values) {
            addCriterion("else_exp not in", values, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpBetween(Double value1, Double value2) {
            addCriterion("else_exp between", value1, value2, "elseExp");
            return (Criteria) this;
        }

        public Criteria andElseExpNotBetween(Double value1, Double value2) {
            addCriterion("else_exp not between", value1, value2, "elseExp");
            return (Criteria) this;
        }

        public Criteria andFlourRealIsNull() {
            addCriterion("flour_real is null");
            return (Criteria) this;
        }

        public Criteria andFlourRealIsNotNull() {
            addCriterion("flour_real is not null");
            return (Criteria) this;
        }

        public Criteria andFlourRealEqualTo(Double value) {
            addCriterion("flour_real =", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealNotEqualTo(Double value) {
            addCriterion("flour_real <>", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealGreaterThan(Double value) {
            addCriterion("flour_real >", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealGreaterThanOrEqualTo(Double value) {
            addCriterion("flour_real >=", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealLessThan(Double value) {
            addCriterion("flour_real <", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealLessThanOrEqualTo(Double value) {
            addCriterion("flour_real <=", value, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealIn(List<Double> values) {
            addCriterion("flour_real in", values, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealNotIn(List<Double> values) {
            addCriterion("flour_real not in", values, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealBetween(Double value1, Double value2) {
            addCriterion("flour_real between", value1, value2, "flourReal");
            return (Criteria) this;
        }

        public Criteria andFlourRealNotBetween(Double value1, Double value2) {
            addCriterion("flour_real not between", value1, value2, "flourReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealIsNull() {
            addCriterion("rice_real is null");
            return (Criteria) this;
        }

        public Criteria andRiceRealIsNotNull() {
            addCriterion("rice_real is not null");
            return (Criteria) this;
        }

        public Criteria andRiceRealEqualTo(Double value) {
            addCriterion("rice_real =", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealNotEqualTo(Double value) {
            addCriterion("rice_real <>", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealGreaterThan(Double value) {
            addCriterion("rice_real >", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealGreaterThanOrEqualTo(Double value) {
            addCriterion("rice_real >=", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealLessThan(Double value) {
            addCriterion("rice_real <", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealLessThanOrEqualTo(Double value) {
            addCriterion("rice_real <=", value, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealIn(List<Double> values) {
            addCriterion("rice_real in", values, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealNotIn(List<Double> values) {
            addCriterion("rice_real not in", values, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealBetween(Double value1, Double value2) {
            addCriterion("rice_real between", value1, value2, "riceReal");
            return (Criteria) this;
        }

        public Criteria andRiceRealNotBetween(Double value1, Double value2) {
            addCriterion("rice_real not between", value1, value2, "riceReal");
            return (Criteria) this;
        }

        public Criteria andOilRealIsNull() {
            addCriterion("oil_real is null");
            return (Criteria) this;
        }

        public Criteria andOilRealIsNotNull() {
            addCriterion("oil_real is not null");
            return (Criteria) this;
        }

        public Criteria andOilRealEqualTo(Double value) {
            addCriterion("oil_real =", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealNotEqualTo(Double value) {
            addCriterion("oil_real <>", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealGreaterThan(Double value) {
            addCriterion("oil_real >", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_real >=", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealLessThan(Double value) {
            addCriterion("oil_real <", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealLessThanOrEqualTo(Double value) {
            addCriterion("oil_real <=", value, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealIn(List<Double> values) {
            addCriterion("oil_real in", values, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealNotIn(List<Double> values) {
            addCriterion("oil_real not in", values, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealBetween(Double value1, Double value2) {
            addCriterion("oil_real between", value1, value2, "oilReal");
            return (Criteria) this;
        }

        public Criteria andOilRealNotBetween(Double value1, Double value2) {
            addCriterion("oil_real not between", value1, value2, "oilReal");
            return (Criteria) this;
        }

        public Criteria andElseRealIsNull() {
            addCriterion("else_real is null");
            return (Criteria) this;
        }

        public Criteria andElseRealIsNotNull() {
            addCriterion("else_real is not null");
            return (Criteria) this;
        }

        public Criteria andElseRealEqualTo(Double value) {
            addCriterion("else_real =", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealNotEqualTo(Double value) {
            addCriterion("else_real <>", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealGreaterThan(Double value) {
            addCriterion("else_real >", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealGreaterThanOrEqualTo(Double value) {
            addCriterion("else_real >=", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealLessThan(Double value) {
            addCriterion("else_real <", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealLessThanOrEqualTo(Double value) {
            addCriterion("else_real <=", value, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealIn(List<Double> values) {
            addCriterion("else_real in", values, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealNotIn(List<Double> values) {
            addCriterion("else_real not in", values, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealBetween(Double value1, Double value2) {
            addCriterion("else_real between", value1, value2, "elseReal");
            return (Criteria) this;
        }

        public Criteria andElseRealNotBetween(Double value1, Double value2) {
            addCriterion("else_real not between", value1, value2, "elseReal");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     */
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