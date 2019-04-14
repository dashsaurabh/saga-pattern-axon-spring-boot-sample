package com.progressivecoder.ecommerce.commands;

public class CreateInvoiceCommand extends BaseCommand<String> {

    public final String orderId;

    public CreateInvoiceCommand(String id, String orderId) {
        super(id);
        this.orderId = orderId;
    }
}
