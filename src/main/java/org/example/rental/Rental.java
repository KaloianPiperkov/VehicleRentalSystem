package org.example.rental;

import org.example.vehicle.*;

import java.time.LocalDate;

public class Rental {
    private Vehicle vehicle;
    private int rentalPeriod;
    private String customerName;
    private CalculationStrategy calculationStrategy;
    private LocalDate startDate;
    private LocalDate returnDate;

    public Rental(Vehicle vehicle, int rentalPeriod, String customerName, LocalDate startDate) {
        this.vehicle = vehicle;
        this.rentalPeriod = rentalPeriod;
        this.customerName = customerName;
        this.startDate = startDate;
        this.returnDate = startDate.plusDays(rentalPeriod);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public String getCustomerName() {
        return customerName;
    }

   public LocalDate getStartDate(){
        return startDate;
   }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnVehicle(LocalDate returnDate){
        this.returnDate = returnDate;
    }
}