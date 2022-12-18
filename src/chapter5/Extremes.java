package chapter5;

import java.util.Scanner;

public class Extremes {
    /*(Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many numbers?");
        int numberOfTime = input.nextInt();

        double sum = sumExtreme(numberOfTime);

        System.out.printf("their sum = %.2f", sum);
    }
    public static double sumExtreme(int numberOfTimes) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.printf("Enter number %d ", i+1);
            int number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max + min;
    }
}
