package com.yunjing.emer.entity;

import java.io.Serializable;

/**
 * questionnaire
 * @author 
 */
public class Questionnaire implements Serializable {
    /**
     * 问卷编号，表的主键
     */
    private Integer questionnaireid;

    private String province;

    private String citie;

    private String area;

    /**
     * 填写表用的户姓名
     */
    private String user;

    private String sex;

    private Integer age;

    /**
     * 农名类型
     */
    private String famerType;

    /**
     * 每年收获粮食
     */
    private Float harvestGrain;

    /**
     * 平均每年存粮
     */
    private Float surplusGrain;

    /**
     * 每年存粮多少天
     */
    private String averageGrainDay;

    /**
     * 存粮主要用途（口粮、种子、饲料用)
     */
    private String purposeGrain;

    /**
     * 基本上不存粮，主要原因
     */
    private String reason;

    /**
     * 询问农民是否了解近年来国家支持配置的农户科学储粮装具
     */
    private String tools;

    /**
     * 对之前的农户科学储粮装具评价
     */
    private String toolsEvaluate;

    /**
     * 购买的国家支持的农户科学储粮装具的使用
     */
    private String toolsUse;

    /**
     * 国家给予支持并需要自己出一部分钱鼓励购买储粮装备
     */
    private String supportTool;

    /**
     * 储粮工具的大小
     */
    private String toolType;

    /**
     * 购买装具的数量
     */
    private String toolNum;

    /**
     * 不打算购买使用国家支持的农户科学储粮装具，主要原因
     */
    private String notBuyReason;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionnaireid() {
        return questionnaireid;
    }

    public void setQuestionnaireid(Integer questionnaireid) {
        this.questionnaireid = questionnaireid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCitie() {
        return citie;
    }

    public void setCitie(String citie) {
        this.citie = citie;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFamerType() {
        return famerType;
    }

    public void setFamerType(String famerType) {
        this.famerType = famerType;
    }

    public Float getHarvestGrain() {
        return harvestGrain;
    }

    public void setHarvestGrain(Float harvestGrain) {
        this.harvestGrain = harvestGrain;
    }

    public Float getSurplusGrain() {
        return surplusGrain;
    }

    public void setSurplusGrain(Float surplusGrain) {
        this.surplusGrain = surplusGrain;
    }

    public String getAverageGrainDay() {
        return averageGrainDay;
    }

    public void setAverageGrainDay(String averageGrainDay) {
        this.averageGrainDay = averageGrainDay;
    }

    public String getPurposeGrain() {
        return purposeGrain;
    }

    public void setPurposeGrain(String purposeGrain) {
        this.purposeGrain = purposeGrain;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getToolsEvaluate() {
        return toolsEvaluate;
    }

    public void setToolsEvaluate(String toolsEvaluate) {
        this.toolsEvaluate = toolsEvaluate;
    }

    public String getToolsUse() {
        return toolsUse;
    }

    public void setToolsUse(String toolsUse) {
        this.toolsUse = toolsUse;
    }

    public String getSupportTool() {
        return supportTool;
    }

    public void setSupportTool(String supportTool) {
        this.supportTool = supportTool;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public String getToolNum() {
        return toolNum;
    }

    public void setToolNum(String toolNum) {
        this.toolNum = toolNum;
    }

    public String getNotBuyReason() {
        return notBuyReason;
    }

    public void setNotBuyReason(String notBuyReason) {
        this.notBuyReason = notBuyReason;
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
        Questionnaire other = (Questionnaire) that;
        return (this.getQuestionnaireid() == null ? other.getQuestionnaireid() == null : this.getQuestionnaireid().equals(other.getQuestionnaireid()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCitie() == null ? other.getCitie() == null : this.getCitie().equals(other.getCitie()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getFamerType() == null ? other.getFamerType() == null : this.getFamerType().equals(other.getFamerType()))
            && (this.getHarvestGrain() == null ? other.getHarvestGrain() == null : this.getHarvestGrain().equals(other.getHarvestGrain()))
            && (this.getSurplusGrain() == null ? other.getSurplusGrain() == null : this.getSurplusGrain().equals(other.getSurplusGrain()))
            && (this.getAverageGrainDay() == null ? other.getAverageGrainDay() == null : this.getAverageGrainDay().equals(other.getAverageGrainDay()))
            && (this.getPurposeGrain() == null ? other.getPurposeGrain() == null : this.getPurposeGrain().equals(other.getPurposeGrain()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getTools() == null ? other.getTools() == null : this.getTools().equals(other.getTools()))
            && (this.getToolsEvaluate() == null ? other.getToolsEvaluate() == null : this.getToolsEvaluate().equals(other.getToolsEvaluate()))
            && (this.getToolsUse() == null ? other.getToolsUse() == null : this.getToolsUse().equals(other.getToolsUse()))
            && (this.getSupportTool() == null ? other.getSupportTool() == null : this.getSupportTool().equals(other.getSupportTool()))
            && (this.getToolType() == null ? other.getToolType() == null : this.getToolType().equals(other.getToolType()))
            && (this.getToolNum() == null ? other.getToolNum() == null : this.getToolNum().equals(other.getToolNum()))
            && (this.getNotBuyReason() == null ? other.getNotBuyReason() == null : this.getNotBuyReason().equals(other.getNotBuyReason()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionnaireid() == null) ? 0 : getQuestionnaireid().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCitie() == null) ? 0 : getCitie().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getFamerType() == null) ? 0 : getFamerType().hashCode());
        result = prime * result + ((getHarvestGrain() == null) ? 0 : getHarvestGrain().hashCode());
        result = prime * result + ((getSurplusGrain() == null) ? 0 : getSurplusGrain().hashCode());
        result = prime * result + ((getAverageGrainDay() == null) ? 0 : getAverageGrainDay().hashCode());
        result = prime * result + ((getPurposeGrain() == null) ? 0 : getPurposeGrain().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getTools() == null) ? 0 : getTools().hashCode());
        result = prime * result + ((getToolsEvaluate() == null) ? 0 : getToolsEvaluate().hashCode());
        result = prime * result + ((getToolsUse() == null) ? 0 : getToolsUse().hashCode());
        result = prime * result + ((getSupportTool() == null) ? 0 : getSupportTool().hashCode());
        result = prime * result + ((getToolType() == null) ? 0 : getToolType().hashCode());
        result = prime * result + ((getToolNum() == null) ? 0 : getToolNum().hashCode());
        result = prime * result + ((getNotBuyReason() == null) ? 0 : getNotBuyReason().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", questionnaireid=").append(questionnaireid);
        sb.append(", province=").append(province);
        sb.append(", citie=").append(citie);
        sb.append(", area=").append(area);
        sb.append(", user=").append(user);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", famerType=").append(famerType);
        sb.append(", harvestGrain=").append(harvestGrain);
        sb.append(", surplusGrain=").append(surplusGrain);
        sb.append(", averageGrainDay=").append(averageGrainDay);
        sb.append(", purposeGrain=").append(purposeGrain);
        sb.append(", reason=").append(reason);
        sb.append(", tools=").append(tools);
        sb.append(", toolsEvaluate=").append(toolsEvaluate);
        sb.append(", toolsUse=").append(toolsUse);
        sb.append(", supportTool=").append(supportTool);
        sb.append(", toolType=").append(toolType);
        sb.append(", toolNum=").append(toolNum);
        sb.append(", notBuyReason=").append(notBuyReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}