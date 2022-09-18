package assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //To get the factorial of a number, we need the products of all numbers behind it
        long fact = 1;
        int count = 1;

        System.out.println("Enter number to be factorial: ");
        int number = input.nextInt();
        while (count <= number) {
            fact *= count;
            count++;
        }
        System.out.printf("%nThe Factorial of %d = %d", number, fact);
        System.out.println();
    }
}
