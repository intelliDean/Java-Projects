package chapter8;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class BigDecimalAndNumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //BigDecimal principal = BigDecimal.valueOf(1000.0);
        //BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

        System.out.println("Enter deposit(above 100), interest and year respectively");
        BigDecimal deposit = input.nextBigDecimal();

        BigDecimal interest = input.nextBigDecimal();
        int year = input.nextInt();

       calculateInterest(deposit, interest, year);
    }
    public static void calculateInterest(BigDecimal principal, @NotNull BigDecimal rate, int year) {
        BigDecimal interest = rate.divide(BigDecimal.valueOf(100));
            // display headers
        System.out.printf("%5s%23s%n", "Year", "Amount on deposit");
        for (year = 1; year <= 10; year++) {
            // calculate new amount for specified year
            BigDecimal amount = principal.multiply(interest.add(BigDecimal.ONE).pow(year));

            // display the year and the amount
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }

    }
}
