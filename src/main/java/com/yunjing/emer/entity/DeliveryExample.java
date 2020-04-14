package com.yunjing.emer.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DeliveryExample() {
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

        public Criteria andDeliveryIdIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(Integer value) {
            addCriterion("delivery_id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "deliveryId");
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

        public Criteria andWareAbilityIsNull() {
            addCriterion("ware_ability is null");
            return (Criteria) this;
        }

        public Criteria andWareAbilityIsNotNull() {
            addCriterion("ware_ability is not null");
            return (Criteria) this;
        }

        public Criteria andWareAbilityEqualTo(Double value) {
            addCriterion("ware_ability =", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityNotEqualTo(Double value) {
            addCriterion("ware_ability <>", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityGreaterThan(Double value) {
            addCriterion("ware_ability >", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityGreaterThanOrEqualTo(Double value) {
            addCriterion("ware_ability >=", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityLessThan(Double value) {
            addCriterion("ware_ability <", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityLessThanOrEqualTo(Double value) {
            addCriterion("ware_ability <=", value, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityIn(List<Double> values) {
            addCriterion("ware_ability in", values, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityNotIn(List<Double> values) {
            addCriterion("ware_ability not in", values, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityBetween(Double value1, Double value2) {
            addCriterion("ware_ability between", value1, value2, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andWareAbilityNotBetween(Double value1, Double value2) {
            addCriterion("ware_ability not between", value1, value2, "wareAbility");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayIsNull() {
            addCriterion("delivery_day is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayIsNotNull() {
            addCriterion("delivery_day is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayEqualTo(Double value) {
            addCriterion("delivery_day =", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayNotEqualTo(Double value) {
            addCriterion("delivery_day <>", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayGreaterThan(Double value) {
            addCriterion("delivery_day >", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_day >=", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayLessThan(Double value) {
            addCriterion("delivery_day <", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayLessThanOrEqualTo(Double value) {
            addCriterion("delivery_day <=", value, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayIn(List<Double> values) {
            addCriterion("delivery_day in", values, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayNotIn(List<Double> values) {
            addCriterion("delivery_day not in", values, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayBetween(Double value1, Double value2) {
            addCriterion("delivery_day between", value1, value2, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayNotBetween(Double value1, Double value2) {
            addCriterion("delivery_day not between", value1, value2, "deliveryDay");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("`range` is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("`range` is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("`range` =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("`range` <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("`range` >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("`range` >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("`range` <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("`range` <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("`range` like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("`range` not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("`range` in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("`range` not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("`range` between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("`range` not between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Double value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Double value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Double value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Double value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Double value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Double value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Double> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Double> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Double value1, Double value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Double value1, Double value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNull() {
            addCriterion("delivery_num is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIsNotNull() {
            addCriterion("delivery_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumEqualTo(Integer value) {
            addCriterion("delivery_num =", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotEqualTo(Integer value) {
            addCriterion("delivery_num <>", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThan(Integer value) {
            addCriterion("delivery_num >", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_num >=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThan(Integer value) {
            addCriterion("delivery_num <", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_num <=", value, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumIn(List<Integer> values) {
            addCriterion("delivery_num in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotIn(List<Integer> values) {
            addCriterion("delivery_num not in", values, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumBetween(Integer value1, Integer value2) {
            addCriterion("delivery_num between", value1, value2, "deliveryNum");
            return (Criteria) this;
        }

        public Criteria andDeliveryNumNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_num not between", value1, value2, "deliveryNum");
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

        public Criteria andDeliveryDayRealIsNull() {
            addCriterion("delivery_day_real is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealIsNotNull() {
            addCriterion("delivery_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealEqualTo(Double value) {
            addCriterion("delivery_day_real =", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealNotEqualTo(Double value) {
            addCriterion("delivery_day_real <>", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealGreaterThan(Double value) {
            addCriterion("delivery_day_real >", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("delivery_day_real >=", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealLessThan(Double value) {
            addCriterion("delivery_day_real <", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealLessThanOrEqualTo(Double value) {
            addCriterion("delivery_day_real <=", value, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealIn(List<Double> values) {
            addCriterion("delivery_day_real in", values, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealNotIn(List<Double> values) {
            addCriterion("delivery_day_real not in", values, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealBetween(Double value1, Double value2) {
            addCriterion("delivery_day_real between", value1, value2, "deliveryDayReal");
            return (Criteria) this;
        }

        public Criteria andDeliveryDayRealNotBetween(Double value1, Double value2) {
            addCriterion("delivery_day_real not between", value1, value2, "deliveryDayReal");
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