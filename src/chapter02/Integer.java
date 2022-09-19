package chapter02;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    /*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.*/

        //asks the user to enter one integer
        System.out.println("Enter the number");
        //obtains it from the user
        int number = input.nextInt();

        int square = number * number;
        if (number + square > 100){
            System.out.printf("%n%d and it's square %d > 100", number, square);
        } else
            if (number + square == 100) {
                System.out.printf("%n%d and it's square %d =  100", number, square);
            } else if (number + square < 100) {
                System.out.printf("%n%d and it's square %d <  100", number, square);
            }
    }
}
