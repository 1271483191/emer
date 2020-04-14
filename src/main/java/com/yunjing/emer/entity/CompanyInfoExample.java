package com.yunjing.emer.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CompanyInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNull() {
            addCriterion("social_id is null");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNotNull() {
            addCriterion("social_id is not null");
            return (Criteria) this;
        }

        public Criteria andSocialIdEqualTo(String value) {
            addCriterion("social_id =", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotEqualTo(String value) {
            addCriterion("social_id <>", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThan(String value) {
            addCriterion("social_id >", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThanOrEqualTo(String value) {
            addCriterion("social_id >=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThan(String value) {
            addCriterion("social_id <", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThanOrEqualTo(String value) {
            addCriterion("social_id <=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLike(String value) {
            addCriterion("social_id like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotLike(String value) {
            addCriterion("social_id not like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdIn(List<String> values) {
            addCriterion("social_id in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotIn(List<String> values) {
            addCriterion("social_id not in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdBetween(String value1, String value2) {
            addCriterion("social_id between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotBetween(String value1, String value2) {
            addCriterion("social_id not between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("`position` is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("`position` is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("`position` =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("`position` <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("`position` >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("`position` >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("`position` <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("`position` <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("`position` like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("`position` not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("`position` in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("`position` not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("`position` between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("`position` not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("`location` is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("`location` is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("`location` =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("`location` <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("`location` >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("`location` >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("`location` <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("`location` <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("`location` like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("`location` not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("`location` in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("`location` not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("`location` between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("`location` not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andActivationStatusIsNull() {
            addCriterion("activation_status is null");
            return (Criteria) this;
        }

        public Criteria andActivationStatusIsNotNull() {
            addCriterion("activation_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivationStatusEqualTo(String value) {
            addCriterion("activation_status =", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusNotEqualTo(String value) {
            addCriterion("activation_status <>", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusGreaterThan(String value) {
            addCriterion("activation_status >", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("activation_status >=", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusLessThan(String value) {
            addCriterion("activation_status <", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusLessThanOrEqualTo(String value) {
            addCriterion("activation_status <=", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusLike(String value) {
            addCriterion("activation_status like", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusNotLike(String value) {
            addCriterion("activation_status not like", value, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusIn(List<String> values) {
            addCriterion("activation_status in", values, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusNotIn(List<String> values) {
            addCriterion("activation_status not in", values, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusBetween(String value1, String value2) {
            addCriterion("activation_status between", value1, value2, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andActivationStatusNotBetween(String value1, String value2) {
            addCriterion("activation_status not between", value1, value2, "activationStatus");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andInDayIsNull() {
            addCriterion("in_day is null");
            return (Criteria) this;
        }

        public Criteria andInDayIsNotNull() {
            addCriterion("in_day is not null");
            return (Criteria) this;
        }

        public Criteria andInDayEqualTo(Double value) {
            addCriterion("in_day =", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayNotEqualTo(Double value) {
            addCriterion("in_day <>", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayGreaterThan(Double value) {
            addCriterion("in_day >", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayGreaterThanOrEqualTo(Double value) {
            addCriterion("in_day >=", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayLessThan(Double value) {
            addCriterion("in_day <", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayLessThanOrEqualTo(Double value) {
            addCriterion("in_day <=", value, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayIn(List<Double> values) {
            addCriterion("in_day in", values, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayNotIn(List<Double> values) {
            addCriterion("in_day not in", values, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayBetween(Double value1, Double value2) {
            addCriterion("in_day between", value1, value2, "inDay");
            return (Criteria) this;
        }

        public Criteria andInDayNotBetween(Double value1, Double value2) {
            addCriterion("in_day not between", value1, value2, "inDay");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNull() {
            addCriterion("out_day is null");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNotNull() {
            addCriterion("out_day is not null");
            return (Criteria) this;
        }

        public Criteria andOutDayEqualTo(Double value) {
            addCriterion("out_day =", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotEqualTo(Double value) {
            addCriterion("out_day <>", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThan(Double value) {
            addCriterion("out_day >", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThanOrEqualTo(Double value) {
            addCriterion("out_day >=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThan(Double value) {
            addCriterion("out_day <", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThanOrEqualTo(Double value) {
            addCriterion("out_day <=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayIn(List<Double> values) {
            addCriterion("out_day in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotIn(List<Double> values) {
            addCriterion("out_day not in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayBetween(Double value1, Double value2) {
            addCriterion("out_day between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotBetween(Double value1, Double value2) {
            addCriterion("out_day not between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayIsNull() {
            addCriterion("save_day is null");
            return (Criteria) this;
        }

        public Criteria andSaveDayIsNotNull() {
            addCriterion("save_day is not null");
            return (Criteria) this;
        }

        public Criteria andSaveDayEqualTo(Double value) {
            addCriterion("save_day =", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayNotEqualTo(Double value) {
            addCriterion("save_day <>", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayGreaterThan(Double value) {
            addCriterion("save_day >", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayGreaterThanOrEqualTo(Double value) {
            addCriterion("save_day >=", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayLessThan(Double value) {
            addCriterion("save_day <", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayLessThanOrEqualTo(Double value) {
            addCriterion("save_day <=", value, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayIn(List<Double> values) {
            addCriterion("save_day in", values, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayNotIn(List<Double> values) {
            addCriterion("save_day not in", values, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayBetween(Double value1, Double value2) {
            addCriterion("save_day between", value1, value2, "saveDay");
            return (Criteria) this;
        }

        public Criteria andSaveDayNotBetween(Double value1, Double value2) {
            addCriterion("save_day not between", value1, value2, "saveDay");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("`level` not between", value1, value2, "level");
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