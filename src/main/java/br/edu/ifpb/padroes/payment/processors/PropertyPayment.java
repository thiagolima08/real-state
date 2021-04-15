package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;
import br.edu.ifpb.padroes.payment.PaymentProcessorHandler;

public class PropertyPayment extends PaymentProcessor {
    private PaymentProcessorHandler next;

    @Override
    public void process(Property property) {
        double propertyDeed = property.getPrice();
        System.out.println(String.format("Pay %f for the property", propertyDeed));
    }

    @Override
    public void setNext(PaymentProcessorHandler next) {
        // last level
    }
}

