package org.example._3_lsp.solution;

// Subclass
class TruckDelivery extends HeavyDeliveryService {
    @Override
    public void loadCargo(String cargo) {
        System.out.println("Truck loading: " + cargo);
    }
}
