package org.example.rental;

import org.example.vehicle.*;

public class CalculateInsuranceCost implements CalculationStrategy {
    @Override
    public double calculate(Vehicle vehicle, int rentalPeriod) {
        double insuranceCostPerDay = vehicle.getValue() * vehicle.getType().getInsuranceCostPercentage() / 100;
        if (vehicle instanceof Car && ((Car) vehicle).getSafetyRating() >= 4) {
            insuranceCostPerDay *= 0.9;
        } else if (vehicle instanceof Motorcycle && ((Motorcycle) vehicle).getRiderAge() < 25) {
            insuranceCostPerDay *= 1.2;
        } else if (vehicle instanceof CargoVan && ((CargoVan) vehicle).getDriverExperience() > 5) {
            insuranceCostPerDay *= 0.85;
        }
        return insuranceCostPerDay * rentalPeriod;
    }
}