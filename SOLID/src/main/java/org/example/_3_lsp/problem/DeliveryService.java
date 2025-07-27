package org.example._3_lsp.problem;

// Base class
public class DeliveryService {
    public void loadCargo(String cargo) {
        System.out.println("Loading: " + cargo);
    }

    public void deliver() {
        System.out.println("Delivering goods...");
    }
}
