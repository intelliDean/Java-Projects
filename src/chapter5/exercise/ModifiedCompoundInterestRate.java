package chapter5.exercise;

import static CHAPTER_4.exercise.LargestNumber.input;

public class ModifiedCompoundInterestRate {
    public static void main(String[] args) {
        System.out.println("Enter interest rate");
        int rate = input.nextInt();
        interestRate(rate);
    }

    public static void interestRate(int rate) {
        double interest = rate / 100F; //The F -(float) behind 100 permits the division to go through without truncating it
        double principal = 1000;
        double deposit;
        System.out.printf("%n%-13s%-13s%-13s", "Year", "Interest", "Deposit");
        for (int year = 1; year <= 10; year++) {
            deposit = principal * Math.pow(1 + interest, year);
            System.out.printf("%n%-13d%-13.2f%,-13.2f", year, interest, deposit);
        }
    }


}
