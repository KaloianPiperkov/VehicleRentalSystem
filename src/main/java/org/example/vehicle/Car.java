package org.example.vehicle;

public class Car extends Vehicle{
    private int safetyRating;
    private VehicleType type;

    public Car(String brand, String model, double value, int safetyRating, VehicleType type) {
        super(brand, model, value, type);
        this.safetyRating = safetyRating;
        this.type = type;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
    }

    public VehicleType getType() {
        return type;
    }
}
