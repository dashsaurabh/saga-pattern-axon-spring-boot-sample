package com.progressivecoder.ordermanagement.orderservice.dto.commands;

import java.math.BigDecimal;

public class OrderCreateDTO {

    private String itemType;

    private BigDecimal price;

    private String currency;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
