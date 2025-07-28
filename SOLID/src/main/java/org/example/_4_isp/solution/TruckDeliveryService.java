package org.example._4_isp.solution;

public class TruckDeliveryService implements Schedulable, Deliverable{
    @Override
    public void deliverOrder() {
        System.out.println("Delivering Order...");
    }
    @Override
    public void scheduleOrder() {
        System.out.println("Scheduling Order Delivery...");
    }
}
