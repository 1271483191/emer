package com.yunjing.emer.entity;

import java.io.Serializable;

/**
 * machine
 * @author 
 */
public class Machine implements Serializable {
    /**
     * 加工企业编号
     */
    private Integer machineId;

    /**
     * 企业编号
     */
    private Integer companyId;

    /**
     * 小麦日加工能力
     */
    private Double wheatDay;

    /**
     * 稻谷日加工能力
     */
    private Double paddyDay;

    /**
     * 油料处理日加工能力
     */
    private Double oilDay;

    /**
     * 油脂精炼日加工能力
     */
    private Double oilConciseDay;

    /**
     * 油脂分装日加工能力
     */
    private Double oilSubpDay;

    /**
     * 其它日加工能力
     */
    private Double elseDay;

    /**
     * 小麦日产量
     */
    private Double wheatDayReal;

    /**
     * 稻谷日产量
     */
    private Double paddyDayReal;

    /**
     * 油料处理日产量
     */
    private Double oilDayReal;

    /**
     * 油料精炼日产量
     */
    private Double oilConciseDayReal;

    /**
     * 油脂分装日产量
     */
    private Double oilSubpDayReal;

    /**
     * 其它日产量
     */
    private Double elseDayReal;

    /**
     * 生产状态
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getWheatDay() {
        return wheatDay;
    }

    public void setWheatDay(Double wheatDay) {
        this.wheatDay = wheatDay;
    }

    public Double getPaddyDay() {
        return paddyDay;
    }

    public void setPaddyDay(Double paddyDay) {
        this.paddyDay = paddyDay;
    }

    public Double getOilDay() {
        return oilDay;
    }

    public void setOilDay(Double oilDay) {
        this.oilDay = oilDay;
    }

    public Double getOilConciseDay() {
        return oilConciseDay;
    }

    public void setOilConciseDay(Double oilConciseDay) {
        this.oilConciseDay = oilConciseDay;
    }

    public Double getOilSubpDay() {
        return oilSubpDay;
    }

    public void setOilSubpDay(Double oilSubpDay) {
        this.oilSubpDay = oilSubpDay;
    }

    public Double getElseDay() {
        return elseDay;
    }

    public void setElseDay(Double elseDay) {
        this.elseDay = elseDay;
    }

    public Double getWheatDayReal() {
        return wheatDayReal;
    }

    public void setWheatDayReal(Double wheatDayReal) {
        this.wheatDayReal = wheatDayReal;
    }

    public Double getPaddyDayReal() {
        return paddyDayReal;
    }

    public void setPaddyDayReal(Double paddyDayReal) {
        this.paddyDayReal = paddyDayReal;
    }

    public Double getOilDayReal() {
        return oilDayReal;
    }

    public void setOilDayReal(Double oilDayReal) {
        this.oilDayReal = oilDayReal;
    }

    public Double getOilConciseDayReal() {
        return oilConciseDayReal;
    }

    public void setOilConciseDayReal(Double oilConciseDayReal) {
        this.oilConciseDayReal = oilConciseDayReal;
    }

    public Double getOilSubpDayReal() {
        return oilSubpDayReal;
    }

    public void setOilSubpDayReal(Double oilSubpDayReal) {
        this.oilSubpDayReal = oilSubpDayReal;
    }

    public Double getElseDayReal() {
        return elseDayReal;
    }

    public void setElseDayReal(Double elseDayReal) {
        this.elseDayReal = elseDayReal;
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
        Machine other = (Machine) that;
        return (this.getMachineId() == null ? other.getMachineId() == null : this.getMachineId().equals(other.getMachineId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getWheatDay() == null ? other.getWheatDay() == null : this.getWheatDay().equals(other.getWheatDay()))
            && (this.getPaddyDay() == null ? other.getPaddyDay() == null : this.getPaddyDay().equals(other.getPaddyDay()))
            && (this.getOilDay() == null ? other.getOilDay() == null : this.getOilDay().equals(other.getOilDay()))
            && (this.getOilConciseDay() == null ? other.getOilConciseDay() == null : this.getOilConciseDay().equals(other.getOilConciseDay()))
            && (this.getOilSubpDay() == null ? other.getOilSubpDay() == null : this.getOilSubpDay().equals(other.getOilSubpDay()))
            && (this.getElseDay() == null ? other.getElseDay() == null : this.getElseDay().equals(other.getElseDay()))
            && (this.getWheatDayReal() == null ? other.getWheatDayReal() == null : this.getWheatDayReal().equals(other.getWheatDayReal()))
            && (this.getPaddyDayReal() == null ? other.getPaddyDayReal() == null : this.getPaddyDayReal().equals(other.getPaddyDayReal()))
            && (this.getOilDayReal() == null ? other.getOilDayReal() == null : this.getOilDayReal().equals(other.getOilDayReal()))
            && (this.getOilConciseDayReal() == null ? other.getOilConciseDayReal() == null : this.getOilConciseDayReal().equals(other.getOilConciseDayReal()))
            && (this.getOilSubpDayReal() == null ? other.getOilSubpDayReal() == null : this.getOilSubpDayReal().equals(other.getOilSubpDayReal()))
            && (this.getElseDayReal() == null ? other.getElseDayReal() == null : this.getElseDayReal().equals(other.getElseDayReal()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMachineId() == null) ? 0 : getMachineId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getWheatDay() == null) ? 0 : getWheatDay().hashCode());
        result = prime * result + ((getPaddyDay() == null) ? 0 : getPaddyDay().hashCode());
        result = prime * result + ((getOilDay() == null) ? 0 : getOilDay().hashCode());
        result = prime * result + ((getOilConciseDay() == null) ? 0 : getOilConciseDay().hashCode());
        result = prime * result + ((getOilSubpDay() == null) ? 0 : getOilSubpDay().hashCode());
        result = prime * result + ((getElseDay() == null) ? 0 : getElseDay().hashCode());
        result = prime * result + ((getWheatDayReal() == null) ? 0 : getWheatDayReal().hashCode());
        result = prime * result + ((getPaddyDayReal() == null) ? 0 : getPaddyDayReal().hashCode());
        result = prime * result + ((getOilDayReal() == null) ? 0 : getOilDayReal().hashCode());
        result = prime * result + ((getOilConciseDayReal() == null) ? 0 : getOilConciseDayReal().hashCode());
        result = prime * result + ((getOilSubpDayReal() == null) ? 0 : getOilSubpDayReal().hashCode());
        result = prime * result + ((getElseDayReal() == null) ? 0 : getElseDayReal().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", machineId=").append(machineId);
        sb.append(", companyId=").append(companyId);
        sb.append(", wheatDay=").append(wheatDay);
        sb.append(", paddyDay=").append(paddyDay);
        sb.append(", oilDay=").append(oilDay);
        sb.append(", oilConciseDay=").append(oilConciseDay);
        sb.append(", oilSubpDay=").append(oilSubpDay);
        sb.append(", elseDay=").append(elseDay);
        sb.append(", wheatDayReal=").append(wheatDayReal);
        sb.append(", paddyDayReal=").append(paddyDayReal);
        sb.append(", oilDayReal=").append(oilDayReal);
        sb.append(", oilConciseDayReal=").append(oilConciseDayReal);
        sb.append(", oilSubpDayReal=").append(oilSubpDayReal);
        sb.append(", elseDayReal=").append(elseDayReal);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}