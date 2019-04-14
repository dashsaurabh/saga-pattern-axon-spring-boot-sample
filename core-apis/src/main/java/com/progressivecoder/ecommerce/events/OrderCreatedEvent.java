package com.progressivecoder.ecommerce.events;

import com.progressivecoder.ecommerce.events.BaseEvent;

import java.math.BigDecimal;

public class OrderCreatedEvent extends BaseEvent<String> {

    public final String itemType;

    public final BigDecimal price;

    public final String currency;

    public final String orderStatus;

    public OrderCreatedEvent(String id, String itemType, BigDecimal price, String currency, String orderStatus) {
        super(id);
        this.itemType = itemType;
        this.price = price;
        this.currency = currency;
        this.orderStatus = orderStatus;
    }
}
