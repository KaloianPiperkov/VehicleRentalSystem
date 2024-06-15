package org.example.vehicle;

public class CargoVan extends Vehicle {
    private int driverExperience;
    private VehicleType type;

    public CargoVan(String brand, String model, double value, int driverExperience,VehicleType type) {
        super(brand, model, value, type);
        this.driverExperience = driverExperience;
        this.type = VehicleType.CARGOVAN;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public VehicleType getType() {
        return type;
    }
}