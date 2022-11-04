package Practice;

import java.util.Scanner;

public class NegativePositiveZero {
    //(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
    // and prints the number of negative numbers input, the number of positive numbers input and
    //the number of zeros input.

    public static void main(String[] args) {
        play();
    }
    public static void play() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int neg = 0;
        int pos = 0;
        int zero = 0;


        if (num1 < 0 ) {
            neg = neg + 1;
        } else if (num1 > 0 ) {
            pos = pos + 1;
        } else {
            zero = zero + 1;
        }


        if (num2 < 0) {
            neg++;
        } else if (num2 > 0) {
            pos++;
        } else {
            zero++;
        }

        if (num3 < 0) {
            neg++;
        } else if (num3 > 0) {
            pos++;
        } else {
            zero++;
        }

        if (num4 < 0) {
            neg++;
        } else if (num4 > 0) {
            pos++;
        } else {
            zero++;
        }

        if (num5 < 0) {
            neg++;
        } else if (num5 > 0) {
            pos++;
        } else {
            zero++;
        }

        System.out.printf("The number of positive is %d, the number of negative is %d and the number of zero is %d%n", pos, neg, zero );
    }
}
