package org.example._3_lsp.problem;

// Subclass that breaks LSP
class DroneDelivery extends DeliveryService {
    @Override
    public void loadCargo(String cargo) {
        // Drones can't load large cargo - this is not expected!
        throw new UnsupportedOperationException("Drones can't load cargo this way!");
    }
}
