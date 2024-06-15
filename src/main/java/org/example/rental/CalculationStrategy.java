package org.example.rental;

import org.example.vehicle.Vehicle;

public interface CalculationStrategy {
    double calculate(Vehicle vehicle, int rentalPeriod);
}