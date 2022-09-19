package chapter02;

import java.util.Scanner;

public class NPZValues {
    public static void main(String[] args) {


    /*(Negative, Positive and Zero Values) Write a program that inputs five numbers and
    determines and prints the number of negative numbers input, the number of positive
    numbers input and the number of zeros input.*/

    Scanner input = new Scanner(System.in);

        int total = 0;
        double number;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number");
            number = input.nextDouble();
            if (number > 0) {
                System.out.printf("%.2f is a positive number%n%n", number);
            } else
            if (number < 0) {
                System.out.printf("%.2f is a negative number%n%n", number);
            } else {
                System.out.printf("%.2f is = 0%n%n", number);
            }
        }
    }
}
