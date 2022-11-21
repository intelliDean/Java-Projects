package chapter10.loan;

import java.util.Scanner;

public class LoanClass {
    public static void main(String[] args) {
        // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Enter annual interest rate
         System.out.print(
                 "Enter annual interest rate, for example, 8.25\n");
         double annualInterestRate = input.nextDouble();

         // Enter number of years
         System.out.print("Enter number of years as an integer\n");
         int numberOfYears = input.nextInt();

         // Enter loan amount
         System.out.print("Enter loan amount, for example, 120000.95\n");
         double loanAmount = input.nextDouble();

         // Create a Loan object
         Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

         // Display loan date, monthly payment, and total payment
         displayLoanDetails(loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

    }
    public static void displayLoanDetails(String loanDate, double monthlyPayment, double totalPayment) {
         System.out.printf("The loan was created on %s%nThe monthly payment is %,.2f%nThe total payment is %,.2f%n",
                 loanDate, monthlyPayment,
                 totalPayment);
    }
}
