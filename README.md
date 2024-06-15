# Vehicle Rental System

## Approach

The solution is implemented as a command-line interface (CLI) application in Java, with the following main components:

- `Vehicle` classes: These represent the different types of vehicles that can be rented (Car, Motorcycle, CargoVan). Each vehicle type has specific properties and behaviors.

- `Rental` class: This represents a rental transaction, including the vehicle, rental period, customer name, and start and return dates.

- `Invoice` class: This generates a rental invoice for the user when the rented vehicle is returned. It calculates the rental and insurance costs based on the selected parameters and business rules.

- `InvoicePrinter` class: This is responsible for printing the invoice, including detailed information about the rental.

- `CalculateRentalCost` and `CalculateInsuranceCost` classes: These implement the business rules for calculating the rental and insurance costs.

- `Main` class: This is the entry point of the application. It creates instances of the Vehicle and Rental classes, and uses the Invoice and InvoicePrinter classes to calculate and print the invoice.

## Usage

To run the application, execute the `Main` class. The application will calculate the rental and insurance costs for the specified rentals and print the invoices.

## Example Output

The output of the application is a detailed invoice for each rental, including the customer name, rented vehicle, reservation start and end dates, actual return date, rental and insurance costs per day, and total costs.

XXXXXXXXXXX
Date: 2024-06-15
Customer Name: John Doe
Rented Vehicle: Porsche 992

Reservation start date: 2024-06-15
Reservation end date: 2024-06-22
Reserved rental days: 7 days

Actual return date: 2024-06-20
Actual rental days: 5 days

Rental cost per day: 20.00
Insurance cost per day: 27.00

Total rent: 120.00
Total Insurance: 135.00
Total: 255.00
XXXXXXXXXXX
