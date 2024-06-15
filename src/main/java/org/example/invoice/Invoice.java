package org.example.invoice;

import org.example.rental.*;
import org.example.vehicle.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Invoice {
    private Rental rental;
    private double rentalCost;
    private double insuranceCost;

    public Invoice(Rental rental) {
        this.rental = rental;
    }

    public Rental getRental() {
        return rental;
    }
//
//    public void setRental(Rental rental) {
//        this.rental = rental;
//    }


    public double getRentalCost() {
        return rentalCost;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void calculateCost() {
        Vehicle vehicle = rental.getVehicle();
        int rentalPeriod = (int) ChronoUnit.DAYS.between(rental.getStartDate(), rental.getReturnDate());
        int reservedPeriod = rental.getRentalPeriod();

        CalculateRentalCost calculateRentalCost = new CalculateRentalCost();
        CalculateInsuranceCost calculateInsuranceCost = new CalculateInsuranceCost();

        rentalCost = calculateRentalCost.calculate(vehicle, rentalPeriod);
        insuranceCost = calculateInsuranceCost.calculate(vehicle, rentalPeriod);

        if (rentalPeriod < reservedPeriod) {
            int remainingDays = reservedPeriod - rentalPeriod;
            rentalCost += calculateRentalCost.calculate(vehicle, remainingDays) / 2;
            // insurance cost for remaining days is waived
        }
    }

}