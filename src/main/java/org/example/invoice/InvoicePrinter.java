// InvoicePrinter.java
package org.example.invoice;

import org.example.rental.*;
import org.example.vehicle.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InvoicePrinter {
    public static void printInvoice(Invoice invoice) {
        Rental rental = invoice.getRental();
        Vehicle vehicle = rental.getVehicle();
        int rentalPeriod = (int) ChronoUnit.DAYS.between(rental.getStartDate(), rental.getReturnDate());
        int reservedPeriod = rental.getRentalPeriod();
        String customerName = rental.getCustomerName();



        CalculateRentalCost calculateRentalCost = new CalculateRentalCost();
        CalculateInsuranceCost calculateInsuranceCost = new CalculateInsuranceCost();

        double rentalCost = calculateRentalCost.calculate(vehicle, rentalPeriod);
        double insuranceCost = calculateInsuranceCost.calculate(vehicle, rentalPeriod);

        if (rentalPeriod < reservedPeriod) {
            int remainingDays = reservedPeriod - rentalPeriod;
            rentalCost += calculateRentalCost.calculate(vehicle, remainingDays) / 2;
            // insurance cost for remaining days is waived
        }

        // Print detailed invoice
        System.out.println("XXXXXXXXXXX");
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Customer Name: " + customerName);
        System.out.println("Rented Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        System.out.println();
        System.out.println("Reservation start date: " + rental.getStartDate());
        System.out.println("Reservation end date: " + rental.getStartDate().plusDays(reservedPeriod));
        System.out.println("Reserved rental days: " + reservedPeriod + " days");
        System.out.println();
        System.out.println("Actual return date: " + rental.getReturnDate());
        System.out.println("Actual rental days: " + rentalPeriod + " days");
        System.out.println();
        System.out.println("Rental cost per day: " + BigDecimal.valueOf(calculateRentalCost.calculate(vehicle, 1)).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Insurance cost per day: " + BigDecimal.valueOf(calculateInsuranceCost.calculate(vehicle, 1)).setScale(2, RoundingMode.HALF_UP));
        System.out.println();
        System.out.println("Total rent: " + BigDecimal.valueOf(rentalCost).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total Insurance: " + BigDecimal.valueOf(insuranceCost).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Total: " + BigDecimal.valueOf(rentalCost + insuranceCost).setScale(2, RoundingMode.HALF_UP));
        System.out.println("XXXXXXXXXXX");

    }
}