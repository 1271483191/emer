package com.yunjing.emer.entity;

import java.io.Serializable;

/**
 * delivery
 * @author 
 */
public class Delivery implements Serializable {
    private Integer deliveryId;

    private Integer companyId;

    /**
     * 仓储能力
     */
    private Double wareAbility;

    /**
     * 日配送能力
     */
    private Double deliveryDay;

    /**
     * 辐射范围
     */
    private String range;

    /**
     * 辐射半径
     */
    private Double radius;

    /**
     * 辐射供应网点数量
     */
    private Integer deliveryNum;

    /**
     * 运输车辆数量
     */
    private Integer carNum;

    /**
     * 实例日配送能力
     */
    private Double deliveryDayReal;

    /**
     * 生产状态
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getWareAbility() {
        return wareAbility;
    }

    public void setWareAbility(Double wareAbility) {
        this.wareAbility = wareAbility;
    }

    public Double getDeliveryDay() {
        return deliveryDay;
    }

    public void setDeliveryDay(Double deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Integer getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Integer deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public Integer getCarNum() {
        return carNum;
    }

    public void setCarNum(Integer carNum) {
        this.carNum = carNum;
    }

    public Double getDeliveryDayReal() {
        return deliveryDayReal;
    }

    public void setDeliveryDayReal(Double deliveryDayReal) {
        this.deliveryDayReal = deliveryDayReal;
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
        Delivery other = (Delivery) that;
        return (this.getDeliveryId() == null ? other.getDeliveryId() == null : this.getDeliveryId().equals(other.getDeliveryId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getWareAbility() == null ? other.getWareAbility() == null : this.getWareAbility().equals(other.getWareAbility()))
            && (this.getDeliveryDay() == null ? other.getDeliveryDay() == null : this.getDeliveryDay().equals(other.getDeliveryDay()))
            && (this.getRange() == null ? other.getRange() == null : this.getRange().equals(other.getRange()))
            && (this.getRadius() == null ? other.getRadius() == null : this.getRadius().equals(other.getRadius()))
            && (this.getDeliveryNum() == null ? other.getDeliveryNum() == null : this.getDeliveryNum().equals(other.getDeliveryNum()))
            && (this.getCarNum() == null ? other.getCarNum() == null : this.getCarNum().equals(other.getCarNum()))
            && (this.getDeliveryDayReal() == null ? other.getDeliveryDayReal() == null : this.getDeliveryDayReal().equals(other.getDeliveryDayReal()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeliveryId() == null) ? 0 : getDeliveryId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getWareAbility() == null) ? 0 : getWareAbility().hashCode());
        result = prime * result + ((getDeliveryDay() == null) ? 0 : getDeliveryDay().hashCode());
        result = prime * result + ((getRange() == null) ? 0 : getRange().hashCode());
        result = prime * result + ((getRadius() == null) ? 0 : getRadius().hashCode());
        result = prime * result + ((getDeliveryNum() == null) ? 0 : getDeliveryNum().hashCode());
        result = prime * result + ((getCarNum() == null) ? 0 : getCarNum().hashCode());
        result = prime * result + ((getDeliveryDayReal() == null) ? 0 : getDeliveryDayReal().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliveryId=").append(deliveryId);
        sb.append(", companyId=").append(companyId);
        sb.append(", wareAbility=").append(wareAbility);
        sb.append(", deliveryDay=").append(deliveryDay);
        sb.append(", range=").append(range);
        sb.append(", radius=").append(radius);
        sb.append(", deliveryNum=").append(deliveryNum);
        sb.append(", carNum=").append(carNum);
        sb.append(", deliveryDayReal=").append(deliveryDayReal);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}