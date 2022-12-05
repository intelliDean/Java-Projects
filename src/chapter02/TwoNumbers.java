package chapter02;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
    /* (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
     the user and prints the square of each, the sum of their squares, and the difference of the squares (first
     number squared minus the second number squared). Use the techniques shown in Fig. 2.7.*/
    Scanner input = new Scanner(System.in);

    //asks the user to enter two integers
    System.out.println("Enter the first number");
    int num1 = input.nextInt();

    System.out.println("Enter the second number");
        int num2 = input.nextInt();

        int square1 = square(num1);
        int square2 = square(num2);
        //the sum of their squares
        int sum = sumOfSquare(num1, num2);
        //the difference of the squares
        int diff = diffOfTwoSquare(num1, num2);

        //prints the sum of each
        System.out.printf("%-10s%-10s%n%,-10d%,-10d%n%,-10d%,-10d%n%-10s%,-10d%n%-10s%,-10d%n",
                "Numbers", "Squares", num1, square1, num2, square2,"Sum: ", sum, "Diff: ", diff);
    }
    public static int diffOfTwoSquare(int number1, int number2) {
        int square1 = square(number1);
        int square2 = square(number2);

        if (square1 > square2) {
            return square1 - square2;
        } else if (square2 > square1) {
            return square2 - square1;
        } else {
            return 0;
        }
    }
    public static int sumOfSquare(int number1, int number2) {
        return square(number1) + square(number2);
    }
    public static int square(int number) {
        return number * number;
    }
}
