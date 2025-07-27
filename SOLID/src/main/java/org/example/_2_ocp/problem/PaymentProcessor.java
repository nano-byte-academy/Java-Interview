package org.example._2_ocp.problem;

public class PaymentProcessor {
    public void process(String type, double amount) {
        switch (type) {
            case "CREDIT_CARD":
                // process credit card
                System.out.println("Charging credit card: " + amount);
                break;
            case "PAYPAL":
                // process PayPal
                System.out.println("Processing PayPal payment: " + amount);
                break;
            // ... more methods added over time
        }
    }
}
