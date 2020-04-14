package com.yunjing.emer.entity;

import java.util.ArrayList;
import java.util.List;

public class MachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MachineExample() {
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

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(Integer value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Integer value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Integer value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Integer value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Integer> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Integer> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
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

        public Criteria andWheatDayIsNull() {
            addCriterion("wheat_day is null");
            return (Criteria) this;
        }

        public Criteria andWheatDayIsNotNull() {
            addCriterion("wheat_day is not null");
            return (Criteria) this;
        }

        public Criteria andWheatDayEqualTo(Double value) {
            addCriterion("wheat_day =", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayNotEqualTo(Double value) {
            addCriterion("wheat_day <>", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayGreaterThan(Double value) {
            addCriterion("wheat_day >", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayGreaterThanOrEqualTo(Double value) {
            addCriterion("wheat_day >=", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayLessThan(Double value) {
            addCriterion("wheat_day <", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayLessThanOrEqualTo(Double value) {
            addCriterion("wheat_day <=", value, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayIn(List<Double> values) {
            addCriterion("wheat_day in", values, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayNotIn(List<Double> values) {
            addCriterion("wheat_day not in", values, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayBetween(Double value1, Double value2) {
            addCriterion("wheat_day between", value1, value2, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayNotBetween(Double value1, Double value2) {
            addCriterion("wheat_day not between", value1, value2, "wheatDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayIsNull() {
            addCriterion("paddy_day is null");
            return (Criteria) this;
        }

        public Criteria andPaddyDayIsNotNull() {
            addCriterion("paddy_day is not null");
            return (Criteria) this;
        }

        public Criteria andPaddyDayEqualTo(Double value) {
            addCriterion("paddy_day =", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayNotEqualTo(Double value) {
            addCriterion("paddy_day <>", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayGreaterThan(Double value) {
            addCriterion("paddy_day >", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayGreaterThanOrEqualTo(Double value) {
            addCriterion("paddy_day >=", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayLessThan(Double value) {
            addCriterion("paddy_day <", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayLessThanOrEqualTo(Double value) {
            addCriterion("paddy_day <=", value, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayIn(List<Double> values) {
            addCriterion("paddy_day in", values, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayNotIn(List<Double> values) {
            addCriterion("paddy_day not in", values, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayBetween(Double value1, Double value2) {
            addCriterion("paddy_day between", value1, value2, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andPaddyDayNotBetween(Double value1, Double value2) {
            addCriterion("paddy_day not between", value1, value2, "paddyDay");
            return (Criteria) this;
        }

        public Criteria andOilDayIsNull() {
            addCriterion("oil_day is null");
            return (Criteria) this;
        }

        public Criteria andOilDayIsNotNull() {
            addCriterion("oil_day is not null");
            return (Criteria) this;
        }

        public Criteria andOilDayEqualTo(Double value) {
            addCriterion("oil_day =", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayNotEqualTo(Double value) {
            addCriterion("oil_day <>", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayGreaterThan(Double value) {
            addCriterion("oil_day >", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_day >=", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayLessThan(Double value) {
            addCriterion("oil_day <", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayLessThanOrEqualTo(Double value) {
            addCriterion("oil_day <=", value, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayIn(List<Double> values) {
            addCriterion("oil_day in", values, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayNotIn(List<Double> values) {
            addCriterion("oil_day not in", values, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayBetween(Double value1, Double value2) {
            addCriterion("oil_day between", value1, value2, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilDayNotBetween(Double value1, Double value2) {
            addCriterion("oil_day not between", value1, value2, "oilDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayIsNull() {
            addCriterion("oil_concise_day is null");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayIsNotNull() {
            addCriterion("oil_concise_day is not null");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayEqualTo(Double value) {
            addCriterion("oil_concise_day =", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayNotEqualTo(Double value) {
            addCriterion("oil_concise_day <>", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayGreaterThan(Double value) {
            addCriterion("oil_concise_day >", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_concise_day >=", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayLessThan(Double value) {
            addCriterion("oil_concise_day <", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayLessThanOrEqualTo(Double value) {
            addCriterion("oil_concise_day <=", value, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayIn(List<Double> values) {
            addCriterion("oil_concise_day in", values, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayNotIn(List<Double> values) {
            addCriterion("oil_concise_day not in", values, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayBetween(Double value1, Double value2) {
            addCriterion("oil_concise_day between", value1, value2, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayNotBetween(Double value1, Double value2) {
            addCriterion("oil_concise_day not between", value1, value2, "oilConciseDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayIsNull() {
            addCriterion("oil_subp_day is null");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayIsNotNull() {
            addCriterion("oil_subp_day is not null");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayEqualTo(Double value) {
            addCriterion("oil_subp_day =", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayNotEqualTo(Double value) {
            addCriterion("oil_subp_day <>", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayGreaterThan(Double value) {
            addCriterion("oil_subp_day >", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_subp_day >=", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayLessThan(Double value) {
            addCriterion("oil_subp_day <", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayLessThanOrEqualTo(Double value) {
            addCriterion("oil_subp_day <=", value, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayIn(List<Double> values) {
            addCriterion("oil_subp_day in", values, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayNotIn(List<Double> values) {
            addCriterion("oil_subp_day not in", values, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayBetween(Double value1, Double value2) {
            addCriterion("oil_subp_day between", value1, value2, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayNotBetween(Double value1, Double value2) {
            addCriterion("oil_subp_day not between", value1, value2, "oilSubpDay");
            return (Criteria) this;
        }

        public Criteria andElseDayIsNull() {
            addCriterion("else_day is null");
            return (Criteria) this;
        }

        public Criteria andElseDayIsNotNull() {
            addCriterion("else_day is not null");
            return (Criteria) this;
        }

        public Criteria andElseDayEqualTo(Double value) {
            addCriterion("else_day =", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayNotEqualTo(Double value) {
            addCriterion("else_day <>", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayGreaterThan(Double value) {
            addCriterion("else_day >", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayGreaterThanOrEqualTo(Double value) {
            addCriterion("else_day >=", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayLessThan(Double value) {
            addCriterion("else_day <", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayLessThanOrEqualTo(Double value) {
            addCriterion("else_day <=", value, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayIn(List<Double> values) {
            addCriterion("else_day in", values, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayNotIn(List<Double> values) {
            addCriterion("else_day not in", values, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayBetween(Double value1, Double value2) {
            addCriterion("else_day between", value1, value2, "elseDay");
            return (Criteria) this;
        }

        public Criteria andElseDayNotBetween(Double value1, Double value2) {
            addCriterion("else_day not between", value1, value2, "elseDay");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealIsNull() {
            addCriterion("wheat_day_real is null");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealIsNotNull() {
            addCriterion("wheat_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealEqualTo(Double value) {
            addCriterion("wheat_day_real =", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealNotEqualTo(Double value) {
            addCriterion("wheat_day_real <>", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealGreaterThan(Double value) {
            addCriterion("wheat_day_real >", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("wheat_day_real >=", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealLessThan(Double value) {
            addCriterion("wheat_day_real <", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealLessThanOrEqualTo(Double value) {
            addCriterion("wheat_day_real <=", value, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealIn(List<Double> values) {
            addCriterion("wheat_day_real in", values, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealNotIn(List<Double> values) {
            addCriterion("wheat_day_real not in", values, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealBetween(Double value1, Double value2) {
            addCriterion("wheat_day_real between", value1, value2, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andWheatDayRealNotBetween(Double value1, Double value2) {
            addCriterion("wheat_day_real not between", value1, value2, "wheatDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealIsNull() {
            addCriterion("paddy_day_real is null");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealIsNotNull() {
            addCriterion("paddy_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealEqualTo(Double value) {
            addCriterion("paddy_day_real =", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealNotEqualTo(Double value) {
            addCriterion("paddy_day_real <>", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealGreaterThan(Double value) {
            addCriterion("paddy_day_real >", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("paddy_day_real >=", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealLessThan(Double value) {
            addCriterion("paddy_day_real <", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealLessThanOrEqualTo(Double value) {
            addCriterion("paddy_day_real <=", value, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealIn(List<Double> values) {
            addCriterion("paddy_day_real in", values, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealNotIn(List<Double> values) {
            addCriterion("paddy_day_real not in", values, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealBetween(Double value1, Double value2) {
            addCriterion("paddy_day_real between", value1, value2, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andPaddyDayRealNotBetween(Double value1, Double value2) {
            addCriterion("paddy_day_real not between", value1, value2, "paddyDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealIsNull() {
            addCriterion("oil_day_real is null");
            return (Criteria) this;
        }

        public Criteria andOilDayRealIsNotNull() {
            addCriterion("oil_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andOilDayRealEqualTo(Double value) {
            addCriterion("oil_day_real =", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealNotEqualTo(Double value) {
            addCriterion("oil_day_real <>", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealGreaterThan(Double value) {
            addCriterion("oil_day_real >", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_day_real >=", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealLessThan(Double value) {
            addCriterion("oil_day_real <", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealLessThanOrEqualTo(Double value) {
            addCriterion("oil_day_real <=", value, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealIn(List<Double> values) {
            addCriterion("oil_day_real in", values, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealNotIn(List<Double> values) {
            addCriterion("oil_day_real not in", values, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealBetween(Double value1, Double value2) {
            addCriterion("oil_day_real between", value1, value2, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilDayRealNotBetween(Double value1, Double value2) {
            addCriterion("oil_day_real not between", value1, value2, "oilDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealIsNull() {
            addCriterion("oil_concise_day_real is null");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealIsNotNull() {
            addCriterion("oil_concise_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealEqualTo(Double value) {
            addCriterion("oil_concise_day_real =", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealNotEqualTo(Double value) {
            addCriterion("oil_concise_day_real <>", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealGreaterThan(Double value) {
            addCriterion("oil_concise_day_real >", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_concise_day_real >=", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealLessThan(Double value) {
            addCriterion("oil_concise_day_real <", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealLessThanOrEqualTo(Double value) {
            addCriterion("oil_concise_day_real <=", value, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealIn(List<Double> values) {
            addCriterion("oil_concise_day_real in", values, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealNotIn(List<Double> values) {
            addCriterion("oil_concise_day_real not in", values, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealBetween(Double value1, Double value2) {
            addCriterion("oil_concise_day_real between", value1, value2, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilConciseDayRealNotBetween(Double value1, Double value2) {
            addCriterion("oil_concise_day_real not between", value1, value2, "oilConciseDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealIsNull() {
            addCriterion("oil_subp_day_real is null");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealIsNotNull() {
            addCriterion("oil_subp_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealEqualTo(Double value) {
            addCriterion("oil_subp_day_real =", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealNotEqualTo(Double value) {
            addCriterion("oil_subp_day_real <>", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealGreaterThan(Double value) {
            addCriterion("oil_subp_day_real >", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("oil_subp_day_real >=", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealLessThan(Double value) {
            addCriterion("oil_subp_day_real <", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealLessThanOrEqualTo(Double value) {
            addCriterion("oil_subp_day_real <=", value, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealIn(List<Double> values) {
            addCriterion("oil_subp_day_real in", values, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealNotIn(List<Double> values) {
            addCriterion("oil_subp_day_real not in", values, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealBetween(Double value1, Double value2) {
            addCriterion("oil_subp_day_real between", value1, value2, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andOilSubpDayRealNotBetween(Double value1, Double value2) {
            addCriterion("oil_subp_day_real not between", value1, value2, "oilSubpDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealIsNull() {
            addCriterion("else_day_real is null");
            return (Criteria) this;
        }

        public Criteria andElseDayRealIsNotNull() {
            addCriterion("else_day_real is not null");
            return (Criteria) this;
        }

        public Criteria andElseDayRealEqualTo(Double value) {
            addCriterion("else_day_real =", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealNotEqualTo(Double value) {
            addCriterion("else_day_real <>", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealGreaterThan(Double value) {
            addCriterion("else_day_real >", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealGreaterThanOrEqualTo(Double value) {
            addCriterion("else_day_real >=", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealLessThan(Double value) {
            addCriterion("else_day_real <", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealLessThanOrEqualTo(Double value) {
            addCriterion("else_day_real <=", value, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealIn(List<Double> values) {
            addCriterion("else_day_real in", values, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealNotIn(List<Double> values) {
            addCriterion("else_day_real not in", values, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealBetween(Double value1, Double value2) {
            addCriterion("else_day_real between", value1, value2, "elseDayReal");
            return (Criteria) this;
        }

        public Criteria andElseDayRealNotBetween(Double value1, Double value2) {
            addCriterion("else_day_real not between", value1, value2, "elseDayReal");
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