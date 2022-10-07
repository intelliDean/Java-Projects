package Practice;

import java.util.Scanner;

public class NumberCheck {
    /*Check how many specific number are in a set of numbers*/
    public static void toCheckHowManyNumbers(long numbers, int ch) {
        int i = 0;
        int rem;
        while (numbers > 0) {
            rem = (int) (numbers % 10);
            if (rem == ch) {
                i++;
            }
            numbers /= 10;
        }
        System.out.printf("How many %d are in %d ? --> %d%n", ch, numbers, i);
    }

    public static void reverseNumber(int numbers) {
        /*Print the reverse of an inputted numbers*/
        int rem;
        int total = 0;
        while (numbers > 0) {
            rem = numbers % 10;
            total = total * 10 + rem;
            numbers /= 10;
        }
        System.out.printf("%nThe reverse of %d is %d", numbers, total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.println("Input numbers");
//        long numbers = input.nextLong();
//
//        System.out.println("\nNumber to check");
//        int ch = input.nextInt();
//
//        toCheckHowManyNumbers(numbers, ch);

        System.out.println("input numbers to reverse");
        int number = input.nextInt();

        reverseNumber(number);

    }
}
