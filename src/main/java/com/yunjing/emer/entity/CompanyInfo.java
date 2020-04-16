package com.yunjing.emer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * company_info
 * @author 
 */
public class CompanyInfo implements Serializable {
    /**
     * 企业编号
     */
    private Integer companyId;

    /**
     * 所在县
     */
    private String county;

    /**
     * 所在市
     */
    private String city;

    /**
     * 所在省份
     */
    private String province;

    /**
     * 上传时间
     */
    private Date time;

    /**
     * 企业新增或停用
     */
    private Integer companyType;

    /**
     * 应急等级
     */
    private Integer level;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 统一社会信用代码
     */
    private String socialId;

    /**
     * 实际经营地址
     */
    private String location;

    /**
     * 企业性质
     */
    private String activationStatus;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 日入库量
     */
    private Double inDay;

    /**
     * 日销量
     */
    private Double outDay;

    /**
     * 日库存
     */
    private Double saveDay;

    private static final long serialVersionUID = 1L;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getInDay() {
        return inDay;
    }

    public void setInDay(Double inDay) {
        this.inDay = inDay;
    }

    public Double getOutDay() {
        return outDay;
    }

    public void setOutDay(Double outDay) {
        this.outDay = outDay;
    }

    public Double getSaveDay() {
        return saveDay;
    }

    public void setSaveDay(Double saveDay) {
        this.saveDay = saveDay;
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
        CompanyInfo other = (CompanyInfo) that;
        return (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getCompanyType() == null ? other.getCompanyType() == null : this.getCompanyType().equals(other.getCompanyType()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSocialId() == null ? other.getSocialId() == null : this.getSocialId().equals(other.getSocialId()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getActivationStatus() == null ? other.getActivationStatus() == null : this.getActivationStatus().equals(other.getActivationStatus()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getPrincipal() == null ? other.getPrincipal() == null : this.getPrincipal().equals(other.getPrincipal()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getInDay() == null ? other.getInDay() == null : this.getInDay().equals(other.getInDay()))
            && (this.getOutDay() == null ? other.getOutDay() == null : this.getOutDay().equals(other.getOutDay()))
            && (this.getSaveDay() == null ? other.getSaveDay() == null : this.getSaveDay().equals(other.getSaveDay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getCompanyType() == null) ? 0 : getCompanyType().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSocialId() == null) ? 0 : getSocialId().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getActivationStatus() == null) ? 0 : getActivationStatus().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getInDay() == null) ? 0 : getInDay().hashCode());
        result = prime * result + ((getOutDay() == null) ? 0 : getOutDay().hashCode());
        result = prime * result + ((getSaveDay() == null) ? 0 : getSaveDay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyId=").append(companyId);
        sb.append(", county=").append(county);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", time=").append(time);
        sb.append(", companyType=").append(companyType);
        sb.append(", level=").append(level);
        sb.append(", name=").append(name);
        sb.append(", socialId=").append(socialId);
        sb.append(", location=").append(location);
        sb.append(", activationStatus=").append(activationStatus);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", principal=").append(principal);
        sb.append(", phone=").append(phone);
        sb.append(", inDay=").append(inDay);
        sb.append(", outDay=").append(outDay);
        sb.append(", saveDay=").append(saveDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}