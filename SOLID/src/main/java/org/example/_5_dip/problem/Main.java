package org.example._5_dip.problem;

public class Main {
    public static void main(String[] args) {
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService();
        foodDeliveryService.deliver("order Id", "customer phone number");
    }
}
