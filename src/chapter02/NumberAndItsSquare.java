package chapter02;

import java.util.Scanner;

public class NumberAndItsSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    /*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.*/

        //asks the user to enter one integer
        System.out.println("Enter the number");
        //obtains it from the user
        int number = input.nextInt();

        /*Two different methods doing the same thing differently*/
        System.out.println(numberAndItsSquare(number));

        System.out.println(numberAndSquare(number));


    }
    public static int numberAndItsSquare(int number) {
        int square = number * number;
        final int NUMBER = 100;
        return Integer.compare(number + square, NUMBER);
    }
    public static String numberAndSquare(int number) {
        int square = number * number;
        final int NUMBER = 100;
        int numAndSqr = number + square;
        if (numAndSqr > NUMBER){
            return String.format("%d and its square (%d) > 100", number, square);
        } else if (numAndSqr == 100) {
            return String.format("%d and its square (%d) = 100", number, square);
        } else  {
            return String.format("%d and its square (%d) < 100", number, square);
        }
    }
}
