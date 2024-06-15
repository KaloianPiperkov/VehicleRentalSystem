package org.example.rental;

import org.example.vehicle.*;

public class CalculateRentalCost implements CalculationStrategy {
    @Override
    public double calculate(Vehicle vehicle, int rentalPeriod) {
        double dailyRentalCost = rentalPeriod <= 7 ? vehicle.getType().getDailyRentalCostWeekOrLess() : vehicle.getType().getDailyRentalCostMoreThanWeek();
        return dailyRentalCost * rentalPeriod;
    }
}