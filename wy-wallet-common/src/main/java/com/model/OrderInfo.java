package com.model;

import java.util.Date;

public class OrderInfo {
    private Long id;

    private Long userId;

    private Long bankCardId;

    private Long productId;

    private Integer status;

    private Long checkId;

    private String assignId;

    private Double moneyAmount;

    private Integer days;

    private Double rate;

    private Date applyTime;

    private Date authPassTime;

    private Date authFailTime;

    private Date loanTime;

    private Date finishTime;

    private Integer repayType;

    private Double repayAmount;

    private Integer urged;

    private String purpose;

    private Integer valid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Long bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCheckId() {
        return checkId;
    }

    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    public String getAssignId() {
        return assignId;
    }

    public void setAssignId(String assignId) {
        this.assignId = assignId;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAuthPassTime() {
        return authPassTime;
    }

    public void setAuthPassTime(Date authPassTime) {
        this.authPassTime = authPassTime;
    }

    public Date getAuthFailTime() {
        return authFailTime;
    }

    public void setAuthFailTime(Date authFailTime) {
        this.authFailTime = authFailTime;
    }

    public Date getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getRepayType() {
        return repayType;
    }

    public void setRepayType(Integer repayType) {
        this.repayType = repayType;
    }

    public Double getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Double repayAmount) {
        this.repayAmount = repayAmount;
    }

    public Integer getUrged() {
        return urged;
    }

    public void setUrged(Integer urged) {
        this.urged = urged;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", productId=").append(productId);
        sb.append(", status=").append(status);
        sb.append(", checkId=").append(checkId);
        sb.append(", assignId=").append(assignId);
        sb.append(", moneyAmount=").append(moneyAmount);
        sb.append(", days=").append(days);
        sb.append(", rate=").append(rate);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", authPassTime=").append(authPassTime);
        sb.append(", authFailTime=").append(authFailTime);
        sb.append(", loanTime=").append(loanTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", repayType=").append(repayType);
        sb.append(", repayAmount=").append(repayAmount);
        sb.append(", urged=").append(urged);
        sb.append(", purpose=").append(purpose);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}