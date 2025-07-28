package org.example._5_dip.solution;

public class Main {
    public static void main(String[] args) {
        SmsNotifier smsNotifier = new SmsNotifier();
        EmailNotifier emailNotifier = new EmailNotifier();

        FoodDeliveryService foodDeliveryService = new FoodDeliveryService(smsNotifier);
        foodDeliveryService.deliver("order Id", "customer phone number");
    }
}
