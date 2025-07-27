package org.example._2_ocp.solution;

public class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Charging credit card: " + amount);
    }
}
