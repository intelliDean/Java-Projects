package chapter12.Polymophism.Employee;

import chapter12.Polymophism.Interfaces.Payable.Payable;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private final int quantity;
    private final double pricePerItem;


    // constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        validateQuantity(quantity);
        validatePricePerItem(pricePerItem);

        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    }
    private static void validateQuantity(int quantity) {
        boolean isInvalid = quantity < 0;
        if (isInvalid) throw new IllegalArgumentException("Quantity must be >= 0");
    }
    private static void validatePricePerItem(double pricePerItem) {
        boolean isInvalid = pricePerItem < 0.0;
        if (isInvalid) { // validate pricePerItem
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
    }
    // get part number
    public String getPartNumber() {
        return partNumber;
    }

    // get description
    public String getPartDescription() {
        return partDescription;
    }

    // get quantity
    public int getQuantity() {
        return quantity;
    }

    // get price per item
    public double getPricePerItem() {
        return pricePerItem;
    }

    // return String representation of Invoice object
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    // method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost
    }
}
