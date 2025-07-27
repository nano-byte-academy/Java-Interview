package org.example._1_srp.problem;

public class FoodDeliveryService {

    public double calculateFee(double distanceKm) {
        return distanceKm * 5.0;  // simple per‑km fee
    }

    public void dispatchOrder(String orderId, String riderId) {
        // … code to notify rider’s app …
    }

    public void sendSms(String phone, String message) {
        // … code to call SMS provider …
    }

}
