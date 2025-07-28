package org.example._4_isp.problem;

public class DeliveryNotificationService implements DeliveryService {
    @Override
    public void deliverOrder() {
        // not my job
    }
    @Override
    public void trackOrder() {
        // not my job
    }
    @Override
    public void scheduleOrder() {
        // not my job
    }
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS Notification...");
    }
}
