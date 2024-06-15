package org.example.invoice;

import org.example.rental.*;


public class Invoice {
    private Rental rental;


    public Invoice(Rental rental) {
        this.rental = rental;
    }

    public Rental getRental() {
        return rental;
    }


}