package CHAPTER_4.exercise;

import java.util.Scanner;

public class ReadingNumber {
    static Scanner input = new Scanner(System.in);
    /*(Reading numbers until a specified sum) Write an application that asks for a number from
the user and then keeps reading integer values from the user until the sum of those integers equals
or becomes greater than the value that was input in the beginning.*/
    public static void read(int num) {
        int number = 0;
        int i = 0;
        while (i <= num) {
            System.out.println("\nEnter number again");
            number = input.nextInt();
            i += number;
        }
        System.out.printf("%nNumbers inputted is now equal or greater%nthan the first number inputted %d : %d%n", i, num);
    }

    public static void main(String[] args) {
        System.out.println("Enter first number");
        int num = input.nextInt();
        read(num);

    }
}
