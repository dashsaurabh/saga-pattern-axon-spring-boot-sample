package com.progressivecoder.ecommerce.events;

public class InvoiceCreatedEvent extends BaseEvent<String> {

    public final String orderId;

    public InvoiceCreatedEvent(String id, String orderId) {
        super(id);
        this.orderId = orderId;
    }
}
