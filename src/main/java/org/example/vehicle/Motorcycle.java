package org.example.vehicle;

public class Motorcycle extends Vehicle {
    private int riderAge;
    private VehicleType type;

    public Motorcycle(String brand, String model, double value, int riderAge, VehicleType type) {
        super(brand, model, value,type);
        this.riderAge = riderAge;
        this.type = type;
    }

    public int getRiderAge() {
        return riderAge;
    }

    public VehicleType getType() {
        return type;
    }
}
