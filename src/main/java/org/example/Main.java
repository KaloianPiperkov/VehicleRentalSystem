package org.example;

import org.example.invoice.Invoice;
import org.example.invoice.InvoicePrinter;
import org.example.vehicle.*;
import org.example.rental.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create instances of Vehicle subclasses
        Car car = new Car("Porsche", "992", 300000, 7, VehicleType.CAR);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 12000, 24, VehicleType.MOTORCYCLE);
        CargoVan cargoVan = new CargoVan("Ford", "Transit", 30000, 6, VehicleType.CARGOVAN);

        // Create instances of Rental
        Rental carRental = new Rental(car, 7, "John Doe", LocalDate.now());
        carRental.returnVehicle(LocalDate.now().plusDays(5));  // returned early

        Rental motorcycleRental = new Rental(motorcycle, 10, "Jane Doe",LocalDate.now());
        Rental cargoVanRental = new Rental(cargoVan, 5, "Bob Smith", LocalDate.now());

        Invoice carInvoice = new Invoice(carRental);
        InvoicePrinter.printInvoice(carInvoice);
        System.out.println();

        Invoice motorcycleInvoice = new Invoice(motorcycleRental);
        InvoicePrinter.printInvoice(motorcycleInvoice);
        System.out.println();

        Invoice cargoVanInvoice = new Invoice(cargoVanRental);
        InvoicePrinter.printInvoice(cargoVanInvoice);
    }
}