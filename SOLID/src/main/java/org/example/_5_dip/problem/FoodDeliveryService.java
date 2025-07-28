package org.example._5_dip.problem;

// High‑level module: uses SmsNotifier directly
public class FoodDeliveryService {
    private final EmailNotifier notifier;

    public FoodDeliveryService() {
        notifier = new EmailNotifier();
    }

    public void deliver(String orderId, String customerPhone) {
        // ... delivery logic ...
        notifier.sendNotification();
    }
}
