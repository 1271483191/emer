package com.yunjing.emer.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuestionnaireExample() {
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

        public Criteria andQuestionnaireidIsNull() {
            addCriterion("questionnaireID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidIsNotNull() {
            addCriterion("questionnaireID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidEqualTo(Integer value) {
            addCriterion("questionnaireID =", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidNotEqualTo(Integer value) {
            addCriterion("questionnaireID <>", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidGreaterThan(Integer value) {
            addCriterion("questionnaireID >", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionnaireID >=", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidLessThan(Integer value) {
            addCriterion("questionnaireID <", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidLessThanOrEqualTo(Integer value) {
            addCriterion("questionnaireID <=", value, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidIn(List<Integer> values) {
            addCriterion("questionnaireID in", values, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidNotIn(List<Integer> values) {
            addCriterion("questionnaireID not in", values, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidBetween(Integer value1, Integer value2) {
            addCriterion("questionnaireID between", value1, value2, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionnaireID not between", value1, value2, "questionnaireid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCitieIsNull() {
            addCriterion("citie is null");
            return (Criteria) this;
        }

        public Criteria andCitieIsNotNull() {
            addCriterion("citie is not null");
            return (Criteria) this;
        }

        public Criteria andCitieEqualTo(String value) {
            addCriterion("citie =", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieNotEqualTo(String value) {
            addCriterion("citie <>", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieGreaterThan(String value) {
            addCriterion("citie >", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieGreaterThanOrEqualTo(String value) {
            addCriterion("citie >=", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieLessThan(String value) {
            addCriterion("citie <", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieLessThanOrEqualTo(String value) {
            addCriterion("citie <=", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieLike(String value) {
            addCriterion("citie like", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieNotLike(String value) {
            addCriterion("citie not like", value, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieIn(List<String> values) {
            addCriterion("citie in", values, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieNotIn(List<String> values) {
            addCriterion("citie not in", values, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieBetween(String value1, String value2) {
            addCriterion("citie between", value1, value2, "citie");
            return (Criteria) this;
        }

        public Criteria andCitieNotBetween(String value1, String value2) {
            addCriterion("citie not between", value1, value2, "citie");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("`user` is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("`user` is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("`user` =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("`user` <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("`user` >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("`user` >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("`user` <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("`user` <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("`user` like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("`user` not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("`user` in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("`user` not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("`user` between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("`user` not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andFamerTypeIsNull() {
            addCriterion("famer_type is null");
            return (Criteria) this;
        }

        public Criteria andFamerTypeIsNotNull() {
            addCriterion("famer_type is not null");
            return (Criteria) this;
        }

        public Criteria andFamerTypeEqualTo(String value) {
            addCriterion("famer_type =", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeNotEqualTo(String value) {
            addCriterion("famer_type <>", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeGreaterThan(String value) {
            addCriterion("famer_type >", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("famer_type >=", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeLessThan(String value) {
            addCriterion("famer_type <", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeLessThanOrEqualTo(String value) {
            addCriterion("famer_type <=", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeLike(String value) {
            addCriterion("famer_type like", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeNotLike(String value) {
            addCriterion("famer_type not like", value, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeIn(List<String> values) {
            addCriterion("famer_type in", values, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeNotIn(List<String> values) {
            addCriterion("famer_type not in", values, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeBetween(String value1, String value2) {
            addCriterion("famer_type between", value1, value2, "famerType");
            return (Criteria) this;
        }

        public Criteria andFamerTypeNotBetween(String value1, String value2) {
            addCriterion("famer_type not between", value1, value2, "famerType");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainIsNull() {
            addCriterion("harvest_grain is null");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainIsNotNull() {
            addCriterion("harvest_grain is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainEqualTo(Float value) {
            addCriterion("harvest_grain =", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainNotEqualTo(Float value) {
            addCriterion("harvest_grain <>", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainGreaterThan(Float value) {
            addCriterion("harvest_grain >", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainGreaterThanOrEqualTo(Float value) {
            addCriterion("harvest_grain >=", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainLessThan(Float value) {
            addCriterion("harvest_grain <", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainLessThanOrEqualTo(Float value) {
            addCriterion("harvest_grain <=", value, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainIn(List<Float> values) {
            addCriterion("harvest_grain in", values, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainNotIn(List<Float> values) {
            addCriterion("harvest_grain not in", values, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainBetween(Float value1, Float value2) {
            addCriterion("harvest_grain between", value1, value2, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andHarvestGrainNotBetween(Float value1, Float value2) {
            addCriterion("harvest_grain not between", value1, value2, "harvestGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainIsNull() {
            addCriterion("surplus_grain is null");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainIsNotNull() {
            addCriterion("surplus_grain is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainEqualTo(Float value) {
            addCriterion("surplus_grain =", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainNotEqualTo(Float value) {
            addCriterion("surplus_grain <>", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainGreaterThan(Float value) {
            addCriterion("surplus_grain >", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainGreaterThanOrEqualTo(Float value) {
            addCriterion("surplus_grain >=", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainLessThan(Float value) {
            addCriterion("surplus_grain <", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainLessThanOrEqualTo(Float value) {
            addCriterion("surplus_grain <=", value, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainIn(List<Float> values) {
            addCriterion("surplus_grain in", values, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainNotIn(List<Float> values) {
            addCriterion("surplus_grain not in", values, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainBetween(Float value1, Float value2) {
            addCriterion("surplus_grain between", value1, value2, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andSurplusGrainNotBetween(Float value1, Float value2) {
            addCriterion("surplus_grain not between", value1, value2, "surplusGrain");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayIsNull() {
            addCriterion("average_grain_day is null");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayIsNotNull() {
            addCriterion("average_grain_day is not null");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayEqualTo(String value) {
            addCriterion("average_grain_day =", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayNotEqualTo(String value) {
            addCriterion("average_grain_day <>", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayGreaterThan(String value) {
            addCriterion("average_grain_day >", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayGreaterThanOrEqualTo(String value) {
            addCriterion("average_grain_day >=", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayLessThan(String value) {
            addCriterion("average_grain_day <", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayLessThanOrEqualTo(String value) {
            addCriterion("average_grain_day <=", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayLike(String value) {
            addCriterion("average_grain_day like", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayNotLike(String value) {
            addCriterion("average_grain_day not like", value, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayIn(List<String> values) {
            addCriterion("average_grain_day in", values, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayNotIn(List<String> values) {
            addCriterion("average_grain_day not in", values, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayBetween(String value1, String value2) {
            addCriterion("average_grain_day between", value1, value2, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andAverageGrainDayNotBetween(String value1, String value2) {
            addCriterion("average_grain_day not between", value1, value2, "averageGrainDay");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainIsNull() {
            addCriterion("purpose_grain is null");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainIsNotNull() {
            addCriterion("purpose_grain is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainEqualTo(String value) {
            addCriterion("purpose_grain =", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainNotEqualTo(String value) {
            addCriterion("purpose_grain <>", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainGreaterThan(String value) {
            addCriterion("purpose_grain >", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_grain >=", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainLessThan(String value) {
            addCriterion("purpose_grain <", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainLessThanOrEqualTo(String value) {
            addCriterion("purpose_grain <=", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainLike(String value) {
            addCriterion("purpose_grain like", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainNotLike(String value) {
            addCriterion("purpose_grain not like", value, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainIn(List<String> values) {
            addCriterion("purpose_grain in", values, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainNotIn(List<String> values) {
            addCriterion("purpose_grain not in", values, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainBetween(String value1, String value2) {
            addCriterion("purpose_grain between", value1, value2, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andPurposeGrainNotBetween(String value1, String value2) {
            addCriterion("purpose_grain not between", value1, value2, "purposeGrain");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andToolsIsNull() {
            addCriterion("tools is null");
            return (Criteria) this;
        }

        public Criteria andToolsIsNotNull() {
            addCriterion("tools is not null");
            return (Criteria) this;
        }

        public Criteria andToolsEqualTo(String value) {
            addCriterion("tools =", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsNotEqualTo(String value) {
            addCriterion("tools <>", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsGreaterThan(String value) {
            addCriterion("tools >", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsGreaterThanOrEqualTo(String value) {
            addCriterion("tools >=", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsLessThan(String value) {
            addCriterion("tools <", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsLessThanOrEqualTo(String value) {
            addCriterion("tools <=", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsLike(String value) {
            addCriterion("tools like", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsNotLike(String value) {
            addCriterion("tools not like", value, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsIn(List<String> values) {
            addCriterion("tools in", values, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsNotIn(List<String> values) {
            addCriterion("tools not in", values, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsBetween(String value1, String value2) {
            addCriterion("tools between", value1, value2, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsNotBetween(String value1, String value2) {
            addCriterion("tools not between", value1, value2, "tools");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateIsNull() {
            addCriterion("tools_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateIsNotNull() {
            addCriterion("tools_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateEqualTo(String value) {
            addCriterion("tools_evaluate =", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateNotEqualTo(String value) {
            addCriterion("tools_evaluate <>", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateGreaterThan(String value) {
            addCriterion("tools_evaluate >", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("tools_evaluate >=", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateLessThan(String value) {
            addCriterion("tools_evaluate <", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateLessThanOrEqualTo(String value) {
            addCriterion("tools_evaluate <=", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateLike(String value) {
            addCriterion("tools_evaluate like", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateNotLike(String value) {
            addCriterion("tools_evaluate not like", value, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateIn(List<String> values) {
            addCriterion("tools_evaluate in", values, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateNotIn(List<String> values) {
            addCriterion("tools_evaluate not in", values, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateBetween(String value1, String value2) {
            addCriterion("tools_evaluate between", value1, value2, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsEvaluateNotBetween(String value1, String value2) {
            addCriterion("tools_evaluate not between", value1, value2, "toolsEvaluate");
            return (Criteria) this;
        }

        public Criteria andToolsUseIsNull() {
            addCriterion("tools_use is null");
            return (Criteria) this;
        }

        public Criteria andToolsUseIsNotNull() {
            addCriterion("tools_use is not null");
            return (Criteria) this;
        }

        public Criteria andToolsUseEqualTo(String value) {
            addCriterion("tools_use =", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseNotEqualTo(String value) {
            addCriterion("tools_use <>", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseGreaterThan(String value) {
            addCriterion("tools_use >", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseGreaterThanOrEqualTo(String value) {
            addCriterion("tools_use >=", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseLessThan(String value) {
            addCriterion("tools_use <", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseLessThanOrEqualTo(String value) {
            addCriterion("tools_use <=", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseLike(String value) {
            addCriterion("tools_use like", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseNotLike(String value) {
            addCriterion("tools_use not like", value, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseIn(List<String> values) {
            addCriterion("tools_use in", values, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseNotIn(List<String> values) {
            addCriterion("tools_use not in", values, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseBetween(String value1, String value2) {
            addCriterion("tools_use between", value1, value2, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andToolsUseNotBetween(String value1, String value2) {
            addCriterion("tools_use not between", value1, value2, "toolsUse");
            return (Criteria) this;
        }

        public Criteria andSupportToolIsNull() {
            addCriterion("support_tool is null");
            return (Criteria) this;
        }

        public Criteria andSupportToolIsNotNull() {
            addCriterion("support_tool is not null");
            return (Criteria) this;
        }

        public Criteria andSupportToolEqualTo(String value) {
            addCriterion("support_tool =", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolNotEqualTo(String value) {
            addCriterion("support_tool <>", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolGreaterThan(String value) {
            addCriterion("support_tool >", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolGreaterThanOrEqualTo(String value) {
            addCriterion("support_tool >=", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolLessThan(String value) {
            addCriterion("support_tool <", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolLessThanOrEqualTo(String value) {
            addCriterion("support_tool <=", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolLike(String value) {
            addCriterion("support_tool like", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolNotLike(String value) {
            addCriterion("support_tool not like", value, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolIn(List<String> values) {
            addCriterion("support_tool in", values, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolNotIn(List<String> values) {
            addCriterion("support_tool not in", values, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolBetween(String value1, String value2) {
            addCriterion("support_tool between", value1, value2, "supportTool");
            return (Criteria) this;
        }

        public Criteria andSupportToolNotBetween(String value1, String value2) {
            addCriterion("support_tool not between", value1, value2, "supportTool");
            return (Criteria) this;
        }

        public Criteria andToolTypeIsNull() {
            addCriterion("tool_type is null");
            return (Criteria) this;
        }

        public Criteria andToolTypeIsNotNull() {
            addCriterion("tool_type is not null");
            return (Criteria) this;
        }

        public Criteria andToolTypeEqualTo(String value) {
            addCriterion("tool_type =", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotEqualTo(String value) {
            addCriterion("tool_type <>", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeGreaterThan(String value) {
            addCriterion("tool_type >", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tool_type >=", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeLessThan(String value) {
            addCriterion("tool_type <", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeLessThanOrEqualTo(String value) {
            addCriterion("tool_type <=", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeLike(String value) {
            addCriterion("tool_type like", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotLike(String value) {
            addCriterion("tool_type not like", value, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeIn(List<String> values) {
            addCriterion("tool_type in", values, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotIn(List<String> values) {
            addCriterion("tool_type not in", values, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeBetween(String value1, String value2) {
            addCriterion("tool_type between", value1, value2, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolTypeNotBetween(String value1, String value2) {
            addCriterion("tool_type not between", value1, value2, "toolType");
            return (Criteria) this;
        }

        public Criteria andToolNumIsNull() {
            addCriterion("tool_num is null");
            return (Criteria) this;
        }

        public Criteria andToolNumIsNotNull() {
            addCriterion("tool_num is not null");
            return (Criteria) this;
        }

        public Criteria andToolNumEqualTo(Integer value) {
            addCriterion("tool_num =", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumNotEqualTo(Integer value) {
            addCriterion("tool_num <>", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumGreaterThan(Integer value) {
            addCriterion("tool_num >", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tool_num >=", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumLessThan(Integer value) {
            addCriterion("tool_num <", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumLessThanOrEqualTo(Integer value) {
            addCriterion("tool_num <=", value, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumIn(List<Integer> values) {
            addCriterion("tool_num in", values, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumNotIn(List<Integer> values) {
            addCriterion("tool_num not in", values, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumBetween(Integer value1, Integer value2) {
            addCriterion("tool_num between", value1, value2, "toolNum");
            return (Criteria) this;
        }

        public Criteria andToolNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tool_num not between", value1, value2, "toolNum");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonIsNull() {
            addCriterion("not_buy_reason is null");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonIsNotNull() {
            addCriterion("not_buy_reason is not null");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonEqualTo(String value) {
            addCriterion("not_buy_reason =", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonNotEqualTo(String value) {
            addCriterion("not_buy_reason <>", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonGreaterThan(String value) {
            addCriterion("not_buy_reason >", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("not_buy_reason >=", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonLessThan(String value) {
            addCriterion("not_buy_reason <", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonLessThanOrEqualTo(String value) {
            addCriterion("not_buy_reason <=", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonLike(String value) {
            addCriterion("not_buy_reason like", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonNotLike(String value) {
            addCriterion("not_buy_reason not like", value, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonIn(List<String> values) {
            addCriterion("not_buy_reason in", values, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonNotIn(List<String> values) {
            addCriterion("not_buy_reason not in", values, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonBetween(String value1, String value2) {
            addCriterion("not_buy_reason between", value1, value2, "notBuyReason");
            return (Criteria) this;
        }

        public Criteria andNotBuyReasonNotBetween(String value1, String value2) {
            addCriterion("not_buy_reason not between", value1, value2, "notBuyReason");
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