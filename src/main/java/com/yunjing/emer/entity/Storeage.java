package com.yunjing.emer.entity;

import java.io.Serializable;

/**
 * storeage
 * @author 
 */
public class Storeage implements Serializable {
    /**
     * 储运企业编号
     */
    private Integer storeageId;

    /**
     * 企业编号
     */
    private Integer companyId;

    /**
     * 日运输能力
     */
    private Double transportDay;

    /**
     * 运输车辆数量
     */
    private Integer carNum;

    /**
     * 实际日运输能力
     */
    private Double transportDayReal;

    /**
     * 生产状态
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getStoreageId() {
        return storeageId;
    }

    public void setStoreageId(Integer storeageId) {
        this.storeageId = storeageId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getTransportDay() {
        return transportDay;
    }

    public void setTransportDay(Double transportDay) {
        this.transportDay = transportDay;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public Double getTransportDayReal() {
        return transportDayReal;
    }

    public void setTransportDayReal(Double transportDayReal) {
        this.transportDayReal = transportDayReal;
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
        Storeage other = (Storeage) that;
        return (this.getStoreageId() == null ? other.getStoreageId() == null : this.getStoreageId().equals(other.getStoreageId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getTransportDay() == null ? other.getTransportDay() == null : this.getTransportDay().equals(other.getTransportDay()))
            && (this.getCarNum() == null ? other.getCarNum() == null : this.getCarNum().equals(other.getCarNum()))
            && (this.getTransportDayReal() == null ? other.getTransportDayReal() == null : this.getTransportDayReal().equals(other.getTransportDayReal()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStoreageId() == null) ? 0 : getStoreageId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getTransportDay() == null) ? 0 : getTransportDay().hashCode());
        result = prime * result + ((getCarNum() == null) ? 0 : getCarNum().hashCode());
        result = prime * result + ((getTransportDayReal() == null) ? 0 : getTransportDayReal().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeageId=").append(storeageId);
        sb.append(", companyId=").append(companyId);
        sb.append(", transportDay=").append(transportDay);
        sb.append(", carNum=").append(carNum);
        sb.append(", transportDayReal=").append(transportDayReal);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}