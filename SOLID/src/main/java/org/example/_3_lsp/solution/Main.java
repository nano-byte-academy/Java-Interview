package org.example._3_lsp.solution;

public class Main {
    public static void main(String[] args) {
        HeavyDeliveryService deliveryService = new TruckDelivery();
        deliveryService.loadCargo("heavy goods");
        deliveryService.deliver();
    }
}
