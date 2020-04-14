package com.yunjing.emer.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StoreageExample() {
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

        public Criteria andStoreageIdIsNull() {
            addCriterion("storeage_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreageIdIsNotNull() {
            addCriterion("storeage_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreageIdEqualTo(Integer value) {
            addCriterion("storeage_id =", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdNotEqualTo(Integer value) {
            addCriterion("storeage_id <>", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdGreaterThan(Integer value) {
            addCriterion("storeage_id >", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("storeage_id >=", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdLessThan(Integer value) {
            addCriterion("storeage_id <", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdLessThanOrEqualTo(Integer value) {
            addCriterion("storeage_id <=", value, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdIn(List<Integer> values) {
            addCriterion("storeage_id in", values, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdNotIn(List<Integer> values) {
            addCriterion("storeage_id not in", values, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdBetween(Integer value1, Integer value2) {
            addCriterion("storeage_id between", value1, value2, "storeageId");
            return (Criteria) this;
        }

        public Criteria andStoreageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("storeage_id not between", value1, value2, "storeageId");
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

        public Criteria andTransportDayIsNull() {
            addCriterion("transport_day is null");
            return (Criteria) this;
        }

        public Criteria andTransportDayIsNotNull() {
            addCriterion("transport_day is not null");
            return (Criteria) this;
        }

        public Criteria andTransportDayEqualTo(Double value) {
            addCriterion("transport_day =", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayNotEqualTo(Double value) {
            addCriterion("transport_day <>", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayGreaterThan(Double value) {
            addCriterion("transport_day >", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayGreaterThanOrEqualTo(Double value) {
            addCriterion("transport_day >=", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayLessThan(Double value) {
            addCriterion("transport_day <", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayLessThanOrEqualTo(Double value) {
            addCriterion("transport_day <=", value, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayIn(List<Double> values) {
            addCriterion("transport_day in", values, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayNotIn(List<Double> values) {
            addCriterion("transport_day not in", values, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayBetween(Double value1, Double value2) {
            addCriterion("transport_day between", value1, value2, "transportDay");
            return (Criteria) this;
        }

        public Criteria andTransportDayNotBetween(Double value1, Double value2) {
            addCriterion("transport_day not between", value1, value2, "transportDay");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(Integer value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(Integer value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(Integer value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(Integer value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<Integer> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<Integer> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(Integer value1, Integer value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealIsNull() {
            addCriterion("transport_day_real is null");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealIsNotNull() {
            addCriterion("transport_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealEqualTo(Double value) {
            addCriterion("transport_day_real =", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealNotEqualTo(Double value) {
            addCriterion("transport_day_real <>", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealGreaterThan(Double value) {
            addCriterion("transport_day_real >", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("transport_day_real >=", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealLessThan(Double value) {
            addCriterion("transport_day_real <", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealLessThanOrEqualTo(Double value) {
            addCriterion("transport_day_real <=", value, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealIn(List<Double> values) {
            addCriterion("transport_day_real in", values, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealNotIn(List<Double> values) {
            addCriterion("transport_day_real not in", values, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealBetween(Double value1, Double value2) {
            addCriterion("transport_day_real between", value1, value2, "transportDayReal");
            return (Criteria) this;
        }

        public Criteria andTransportDayRealNotBetween(Double value1, Double value2) {
            addCriterion("transport_day_real not between", value1, value2, "transportDayReal");
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