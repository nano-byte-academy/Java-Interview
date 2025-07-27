package org.example._2_ocp.solution;

public class PaymentProcessor {
    private final PaymentMethod method;

    public PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    public void process(double amount) {
        method.pay(amount);
    }
}
