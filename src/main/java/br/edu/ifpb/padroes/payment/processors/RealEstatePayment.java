package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;
import br.edu.ifpb.padroes.payment.PaymentProcessorHandler;

public class RealEstatePayment extends PaymentProcessor {
    private PaymentProcessorHandler next;

    @Override
    public void process(Property property) {
        double realStateComission = property.getPrice()*0.10;
        System.out.println(String.format("Pay %f for real state", realStateComission));
        next.process(property);
    }

    @Override
    public void setNext(PaymentProcessorHandler next) {
        this.next = next;
    }
}

