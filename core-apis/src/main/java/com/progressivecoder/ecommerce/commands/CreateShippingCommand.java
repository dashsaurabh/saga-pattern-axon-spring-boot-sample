package com.progressivecoder.ecommerce.commands;

public class CreateShippingCommand extends BaseCommand<String> {

    public final String invoiceId;

    public CreateShippingCommand(String id, String invoiceId) {
        super(id);
        this.invoiceId = invoiceId;
    }
}
