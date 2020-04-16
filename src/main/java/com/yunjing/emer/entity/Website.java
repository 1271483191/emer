package com.yunjing.emer.entity;

import java.io.Serializable;

/**
 * website
 * @author 
 */
public class Website implements Serializable {
    /**
     * 网点编号
     */
    private Integer websiteId;

    /**
     * 企业编号
     */
    private Integer companyId;

    /**
     * 应急级别
     */
    private Integer level;

    /**
     * 面粉设计日供应能力
     */
    private Double flourExp;

    /**
     * 大米设计日供应能力
     */
    private Double riceExp;

    /**
     * 食用油设计日供应能力
     */
    private Double oilExp;

    /**
     * 其它设计日供应能力
     */
    private Double elseExp;

    /**
     * 面粉实际日供应能力
     */
    private Double flourReal;

    /**
     * 大米实际日供应能力
     */
    private Double riceReal;

    /**
     * 食用油实际日供应能力
     */
    private Double oilReal;

    /**
     * 其它实际日供应能力
     */
    private Double elseReal;

    /**
     * 生产状态（0：未生产，1：正常）
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getFlourExp() {
        return flourExp;
    }

    public void setFlourExp(Double flourExp) {
        this.flourExp = flourExp;
    }

    public Double getRiceExp() {
        return riceExp;
    }

    public void setRiceExp(Double riceExp) {
        this.riceExp = riceExp;
    }

    public Double getOilExp() {
        return oilExp;
    }

    public void setOilExp(Double oilExp) {
        this.oilExp = oilExp;
    }

    public Double getElseExp() {
        return elseExp;
    }

    public void setElseExp(Double elseExp) {
        this.elseExp = elseExp;
    }

    public Double getFlourReal() {
        return flourReal;
    }

    public void setFlourReal(Double flourReal) {
        this.flourReal = flourReal;
    }

    public Double getRiceReal() {
        return riceReal;
    }

    public void setRiceReal(Double riceReal) {
        this.riceReal = riceReal;
    }

    public Double getOilReal() {
        return oilReal;
    }

    public void setOilReal(Double oilReal) {
        this.oilReal = oilReal;
    }

    public Double getElseReal() {
        return elseReal;
    }

    public void setElseReal(Double elseReal) {
        this.elseReal = elseReal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Website other = (Website) that;
        return (this.getWebsiteId() == null ? other.getWebsiteId() == null : this.getWebsiteId().equals(other.getWebsiteId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getFlourExp() == null ? other.getFlourExp() == null : this.getFlourExp().equals(other.getFlourExp()))
            && (this.getRiceExp() == null ? other.getRiceExp() == null : this.getRiceExp().equals(other.getRiceExp()))
            && (this.getOilExp() == null ? other.getOilExp() == null : this.getOilExp().equals(other.getOilExp()))
            && (this.getElseExp() == null ? other.getElseExp() == null : this.getElseExp().equals(other.getElseExp()))
            && (this.getFlourReal() == null ? other.getFlourReal() == null : this.getFlourReal().equals(other.getFlourReal()))
            && (this.getRiceReal() == null ? other.getRiceReal() == null : this.getRiceReal().equals(other.getRiceReal()))
            && (this.getOilReal() == null ? other.getOilReal() == null : this.getOilReal().equals(other.getOilReal()))
            && (this.getElseReal() == null ? other.getElseReal() == null : this.getElseReal().equals(other.getElseReal()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebsiteId() == null) ? 0 : getWebsiteId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getFlourExp() == null) ? 0 : getFlourExp().hashCode());
        result = prime * result + ((getRiceExp() == null) ? 0 : getRiceExp().hashCode());
        result = prime * result + ((getOilExp() == null) ? 0 : getOilExp().hashCode());
        result = prime * result + ((getElseExp() == null) ? 0 : getElseExp().hashCode());
        result = prime * result + ((getFlourReal() == null) ? 0 : getFlourReal().hashCode());
        result = prime * result + ((getRiceReal() == null) ? 0 : getRiceReal().hashCode());
        result = prime * result + ((getOilReal() == null) ? 0 : getOilReal().hashCode());
        result = prime * result + ((getElseReal() == null) ? 0 : getElseReal().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", websiteId=").append(websiteId);
        sb.append(", companyId=").append(companyId);
        sb.append(", level=").append(level);
        sb.append(", flourExp=").append(flourExp);
        sb.append(", riceExp=").append(riceExp);
        sb.append(", oilExp=").append(oilExp);
        sb.append(", elseExp=").append(elseExp);
        sb.append(", flourReal=").append(flourReal);
        sb.append(", riceReal=").append(riceReal);
        sb.append(", oilReal=").append(oilReal);
        sb.append(", elseReal=").append(elseReal);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}