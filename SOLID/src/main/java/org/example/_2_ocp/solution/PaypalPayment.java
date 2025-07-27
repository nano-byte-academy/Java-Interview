package org.example._2_ocp.solution;

public class PaypalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }
}
