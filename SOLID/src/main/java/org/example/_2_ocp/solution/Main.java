package org.example._2_ocp.solution;

public class Main {
    public static void main(String[] args) {
        // 1. Credit‑card payment
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor creditProcessor = new PaymentProcessor(creditCard);
        creditProcessor.process(120.00);

        // 2. PayPal payment
        PaymentMethod paypal = new PaypalPayment();
        PaymentProcessor paypalProcessor = new PaymentProcessor(paypal);
        paypalProcessor.process(45.50);

        // 3. (Optional) Apple Pay payment
//        PaymentMethod applePay = new ApplePayPayment();
//        PaymentProcessor applePayProcessor = new PaymentProcessor(applePay);
//        applePayProcessor.process(75.25);
    }
}

