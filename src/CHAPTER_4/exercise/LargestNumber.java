package CHAPTER_4.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class LargestNumber {
    private static final SecureRandom numbers = new SecureRandom();
    public static final Scanner input = new Scanner(System.in);
    /*(Find the Largest Number) The process of finding the largest value is used frequently in
    computer applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines
and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.*/
    public static void largeNumber() {
        int i = 1;
        int large = 0;

        while (i <= 10) {
            int num = 1 + numbers.nextInt(100);
            if (num > large) {
                large = num;
            }
            System.out.printf("Unit %d: %d%n", i, num);
            i++;
        }
        System.out.printf("%nThe largest unit: %d%n", large);
    }

    public static void main(String[] args) {
        largeNumber();
    }

}
