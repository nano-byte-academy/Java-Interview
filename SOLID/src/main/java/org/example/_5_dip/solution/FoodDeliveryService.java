package org.example._5_dip.solution;

// 3. High‑level module depends on the Notifiable interface
public class FoodDeliveryService {
    private final Notifiable notifier;

    public FoodDeliveryService(Notifiable notifier) {
        this.notifier = notifier;
    }

    public void deliver(String orderId, String customerPhone) {
        // ... delivery logic ...
        notifier.sendNotification();
    }
}
