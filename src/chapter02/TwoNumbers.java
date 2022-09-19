package chapter02;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
    /* (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
     the user and prints the square of each, the sum of their squares, and the difference of the squares (first
     number squared minus the second number squared). Use the techniques shown in Fig. 2.7.*/
    Scanner input = new Scanner(System.in);

    //asks the user to enter two integers
    System.out.println("Enter the first number");
        //asks the user to enter two integers
    int num1 = input.nextInt();
        //asks the user to enter two integers
    System.out.println("Enter the second number");
        //asks the user to enter two integers
        int num2 = input.nextInt();
        //calculate the square of each
        int total1 = num1 * num1;
        int total2 = num2 * num2;

        //the sum of their squares
        int sum = total1 + total2;
        //the difference of the squares
        int diff = (total1 - total2);

        //prints the square of each
        System.out.println("The square of the first number is "+ total1);
        System.out.println("The square of the second number is "+ total2);
        //prints the sum of each
        System.out.println("The sum of the numbers is "+ sum);
        //prints the difference of each
        System.out.println("The difference of the numbers is "+ diff);






    }

}
