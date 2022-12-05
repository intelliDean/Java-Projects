package CHAPTER_4.TaxCalculator;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String lastName;
    private BigDecimal earnings;

    public Citizen() {

    }
    public Citizen(String firstName, String surname) {
        this.firstName = firstName;
        lastName = surname;
    }
    public Citizen(String firstName, String surname, BigDecimal earnings) {
        this(firstName, surname);
        validateEarnings(earnings);
        this.earnings = earnings;
    }
    public static void validateEarnings(BigDecimal earnings) {
        boolean isInvalid = earnings.compareTo(BigDecimal.ZERO) < 0;
        if (isInvalid) throw new IllegalArgumentException("Earnings cannot be negative");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getEarnings() {
        return earnings;
    }

    public void setEarnings(BigDecimal earnings) {
        validateEarnings(earnings);
        this.earnings = earnings;
    }
}
