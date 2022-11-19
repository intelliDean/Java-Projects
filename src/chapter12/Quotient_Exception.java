package chapter12;

import java.util.Scanner;

public class Quotient_Exception {
    public static int quotient(int number1, int number2) {
        boolean invalidInput = number2 == 0;
        if (invalidInput) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter two integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.printf("%n%d / %d is %d%n", number1, number2, result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero ");
        }

        System.out.println("Execution continues ...");
    }
}