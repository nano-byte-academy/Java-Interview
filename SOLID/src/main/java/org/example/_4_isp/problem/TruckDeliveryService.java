package org.example._4_isp.problem;

public class TruckDeliveryService implements DeliveryService {
    @Override
    public void deliverOrder() {
        System.out.println("Delivering Order...");
    }
    @Override
    public void trackOrder() {
        // not my job
    }
    @Override
    public void scheduleOrder() {
        System.out.println("Scheduling Order Delivery...");
    }
    @Override
    public void sendNotification() {
        // not my job
    }
}
