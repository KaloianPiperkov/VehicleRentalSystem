package org.example.vehicle;

public enum VehicleType {
    CAR(20, 15, 0.01),
    MOTORCYCLE(15, 10, 0.02),
    CARGOVAN(50, 40, 0.03);

    private final double dailyRentalCostWeekOrLess;
    private final double dailyRentalCostMoreThanWeek;
    private final double insuranceCostPercentage;

    VehicleType(double dailyRentalCostWeekOrLess, double dailyRentalCostMoreThanWeek, double insuranceCostPercentage) {
        this.dailyRentalCostWeekOrLess = dailyRentalCostWeekOrLess;
        this.dailyRentalCostMoreThanWeek = dailyRentalCostMoreThanWeek;
        this.insuranceCostPercentage = insuranceCostPercentage;
    }

    public double getDailyRentalCostWeekOrLess() {
        return dailyRentalCostWeekOrLess;
    }

    public double getDailyRentalCostMoreThanWeek() {
        return dailyRentalCostMoreThanWeek;
    }

    public double getInsuranceCostPercentage() {
        return insuranceCostPercentage;
    }
}
