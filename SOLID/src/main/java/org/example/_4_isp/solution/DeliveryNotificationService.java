package org.example._4_isp.solution;

public class DeliveryNotificationService implements Notifiable{
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification...");
    }
}
