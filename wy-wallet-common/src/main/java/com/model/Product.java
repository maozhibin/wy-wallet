package com.model;

import java.util.Date;

public class Product {
    private Long id;

    private String name;

    private Double moneyMin;

    private Double moneyMax;

    private Integer timeMin;

    private Integer timeMax;

    private Integer timeDeltaType;

    private Double rate;

    private Double bankCardAttestationCost;

    private Double overdueservicerate;

    private Double infoAttestationCost;

    private Double defaultedInterest;

    private Integer status;

    private Integer appshow;

    private Integer valid;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoneyMin() {
        return moneyMin;
    }

    public void setMoneyMin(Double moneyMin) {
        this.moneyMin = moneyMin;
    }

    public Double getMoneyMax() {
        return moneyMax;
    }

    public void setMoneyMax(Double moneyMax) {
        this.moneyMax = moneyMax;
    }

    public Integer getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(Integer timeMin) {
        this.timeMin = timeMin;
    }

    public Integer getTimeMax() {
        return timeMax;
    }

    public void setTimeMax(Integer timeMax) {
        this.timeMax = timeMax;
    }

    public Integer getTimeDeltaType() {
        return timeDeltaType;
    }

    public void setTimeDeltaType(Integer timeDeltaType) {
        this.timeDeltaType = timeDeltaType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getBankCardAttestationCost() {
        return bankCardAttestationCost;
    }

    public void setBankCardAttestationCost(Double bankCardAttestationCost) {
        this.bankCardAttestationCost = bankCardAttestationCost;
    }

    public Double getOverdueservicerate() {
        return overdueservicerate;
    }

    public void setOverdueservicerate(Double overdueservicerate) {
        this.overdueservicerate = overdueservicerate;
    }

    public Double getInfoAttestationCost() {
        return infoAttestationCost;
    }

    public void setInfoAttestationCost(Double infoAttestationCost) {
        this.infoAttestationCost = infoAttestationCost;
    }

    public Double getDefaultedInterest() {
        return defaultedInterest;
    }

    public void setDefaultedInterest(Double defaultedInterest) {
        this.defaultedInterest = defaultedInterest;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAppshow() {
        return appshow;
    }

    public void setAppshow(Integer appshow) {
        this.appshow = appshow;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", moneyMin=").append(moneyMin);
        sb.append(", moneyMax=").append(moneyMax);
        sb.append(", timeMin=").append(timeMin);
        sb.append(", timeMax=").append(timeMax);
        sb.append(", timeDeltaType=").append(timeDeltaType);
        sb.append(", rate=").append(rate);
        sb.append(", bankCardAttestationCost=").append(bankCardAttestationCost);
        sb.append(", overdueservicerate=").append(overdueservicerate);
        sb.append(", infoAttestationCost=").append(infoAttestationCost);
        sb.append(", defaultedInterest=").append(defaultedInterest);
        sb.append(", status=").append(status);
        sb.append(", appshow=").append(appshow);
        sb.append(", valid=").append(valid);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}