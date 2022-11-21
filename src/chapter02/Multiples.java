package chapter02;

import java.util.Scanner;

public class Multiples {
    /*V(Multiples) Write an application that reads two integers, determines whether the first
    number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
    remainder operator.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = input.nextInt();
        System.out.println("Enter second number");
        int number2 = input.nextInt();

        int trip1 = number1 * 3;
        System.out.printf("%nThe triple of %d is %d", number1, trip1);
        int doub2 = number2 * 2;
        System.out.printf("%nThe double of %d is %d", number2, doub2);

        if (trip1 % doub2 == 0) {
            System.out.printf("%n%d tripled is a multiple of %d doubled", number1, number2);
        }
        else {
            System.out.printf("%n%d tripled is not a multiple of %d doubled", number1, number2);
        }
    }
}
