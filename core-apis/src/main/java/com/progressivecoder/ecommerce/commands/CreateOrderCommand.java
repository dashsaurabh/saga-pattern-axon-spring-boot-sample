package com.progressivecoder.ecommerce.commands;

import java.math.BigDecimal;

public class CreateOrderCommand extends BaseCommand<String> {

    public final String itemType;

    public final BigDecimal price;

    public final String currency;

    public final String orderStatus;

    public CreateOrderCommand(String id, String itemType, BigDecimal price, String currency, String orderStatus) {
        super(id);
        this.itemType = itemType;
        this.price = price;
        this.currency = currency;
        this.orderStatus = orderStatus;
    }
}
