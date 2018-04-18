package com.model;

import java.io.Serializable;

public class Bankcard implements Serializable {
    private Long id;

    private String bankCard;

    private Long userId;

    private String phone;

    private String bankName;

    private String bankCardFrontpicUrl;

    private String bankCardBackpicUrl;

    private String authTime;

    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardFrontpicUrl() {
        return bankCardFrontpicUrl;
    }

    public void setBankCardFrontpicUrl(String bankCardFrontpicUrl) {
        this.bankCardFrontpicUrl = bankCardFrontpicUrl;
    }

    public String getBankCardBackpicUrl() {
        return bankCardBackpicUrl;
    }

    public void setBankCardBackpicUrl(String bankCardBackpicUrl) {
        this.bankCardBackpicUrl = bankCardBackpicUrl;
    }

    public String getAuthTime() {
        return authTime;
    }

    public void setAuthTime(String authTime) {
        this.authTime = authTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankCardFrontpicUrl=").append(bankCardFrontpicUrl);
        sb.append(", bankCardBackpicUrl=").append(bankCardBackpicUrl);
        sb.append(", authTime=").append(authTime);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}