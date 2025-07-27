package org.example._3_lsp.problem;

// Subclass
class TruckDelivery extends DeliveryService {
    @Override
    public void loadCargo(String cargo) {
        System.out.println("Truck loading: " + cargo);
    }
}
