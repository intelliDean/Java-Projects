package chapter5.exercise;

import static CHAPTER_4.exercise.LargestNumber.input;

public class ModifiedCompoundInterestRate {
    /*(Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.*/

    public static void interestRate(int rate) {
        double interest = rate / 100F; //The F -(float) behind 100 permits the division to go through without truncating it
        double principal = 1000;
        double a;
        System.out.printf("%n%s%11s%12s", "Year", "Interest", "Deposit");
        for (int year = 1; year <= 10; year++) {
            a = principal * Math.pow(1 + interest, year);
            System.out.printf("%n%2d%11.2f%,15.2f", year, interest, a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter interest rate");
        int rate = input.nextInt();
        interestRate(rate);
    }
}
