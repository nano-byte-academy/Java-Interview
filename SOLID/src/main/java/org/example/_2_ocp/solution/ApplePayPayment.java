package org.example._2_ocp.solution;

public class ApplePayPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Processing Apple Pay payment: " + amount);
    }
}
