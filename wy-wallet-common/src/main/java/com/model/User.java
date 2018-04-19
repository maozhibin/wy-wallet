package com.model;

import java.util.Date;

public class User {
    private Long id;

    private String name;

    private String phone;

    private String password;

    private Integer sesameScore;

    private Integer riskScore;

    private Double creditLimit;

    private Integer age;

    private Integer sex;

    private String idCardNo;

    private String idCardFrontpicUrl;

    private String idCardBackpicUrl;

    private String selfPicUrl;

    private String companyName;

    private String companyTel;

    private String companyAddress;

    private String qq;

    private String educationDegree;

    private String marriage;

    private Date registerTime;

    private String lastLoginTime;

    private Date updateTime;

    private String blackList;

    private Date blacklistTime;

    private Double oweMoney;

    private Integer valid;

    private Integer taoBaoAttestation;

    private String blacklistNotes;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSesameScore() {
        return sesameScore;
    }

    public void setSesameScore(Integer sesameScore) {
        this.sesameScore = sesameScore;
    }

    public Integer getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardFrontpicUrl() {
        return idCardFrontpicUrl;
    }

    public void setIdCardFrontpicUrl(String idCardFrontpicUrl) {
        this.idCardFrontpicUrl = idCardFrontpicUrl;
    }

    public String getIdCardBackpicUrl() {
        return idCardBackpicUrl;
    }

    public void setIdCardBackpicUrl(String idCardBackpicUrl) {
        this.idCardBackpicUrl = idCardBackpicUrl;
    }

    public String getSelfPicUrl() {
        return selfPicUrl;
    }

    public void setSelfPicUrl(String selfPicUrl) {
        this.selfPicUrl = selfPicUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBlackList() {
        return blackList;
    }

    public void setBlackList(String blackList) {
        this.blackList = blackList;
    }

    public Date getBlacklistTime() {
        return blacklistTime;
    }

    public void setBlacklistTime(Date blacklistTime) {
        this.blacklistTime = blacklistTime;
    }

    public Double getOweMoney() {
        return oweMoney;
    }

    public void setOweMoney(Double oweMoney) {
        this.oweMoney = oweMoney;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getTaoBaoAttestation() {
        return taoBaoAttestation;
    }

    public void setTaoBaoAttestation(Integer taoBaoAttestation) {
        this.taoBaoAttestation = taoBaoAttestation;
    }

    public String getBlacklistNotes() {
        return blacklistNotes;
    }

    public void setBlacklistNotes(String blacklistNotes) {
        this.blacklistNotes = blacklistNotes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", password=").append(password);
        sb.append(", sesameScore=").append(sesameScore);
        sb.append(", riskScore=").append(riskScore);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", idCardNo=").append(idCardNo);
        sb.append(", idCardFrontpicUrl=").append(idCardFrontpicUrl);
        sb.append(", idCardBackpicUrl=").append(idCardBackpicUrl);
        sb.append(", selfPicUrl=").append(selfPicUrl);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyTel=").append(companyTel);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", qq=").append(qq);
        sb.append(", educationDegree=").append(educationDegree);
        sb.append(", marriage=").append(marriage);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", blackList=").append(blackList);
        sb.append(", blacklistTime=").append(blacklistTime);
        sb.append(", oweMoney=").append(oweMoney);
        sb.append(", valid=").append(valid);
        sb.append(", taoBaoAttestation=").append(taoBaoAttestation);
        sb.append(", blacklistNotes=").append(blacklistNotes);
        sb.append("]");
        return sb.toString();
    }
}