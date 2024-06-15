package org.example.vehicle;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected double value;
    protected VehicleType type;

    public Vehicle(String brand, String model, double value, VehicleType type) {
        this.brand = brand;
        this.model = model;
        this.value = value;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public VehicleType getType() {
        return type;
    }
}

