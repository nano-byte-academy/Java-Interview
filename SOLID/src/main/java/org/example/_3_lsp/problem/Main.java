package org.example._3_lsp.problem;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new TruckDelivery();
        deliveryService.loadCargo("heavy goods");
        deliveryService.deliver();
    }
}
