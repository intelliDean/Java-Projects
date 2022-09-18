package assignment;

import java.util.Scanner;

public class FindSquareRoot {
        public static void main(String[] args) {
                        //creating object of the Scanner class
            Scanner input = new Scanner(System.in);
                         //reading a number form the user
            System.out.println("Enter a number");
            int number = input.nextInt();
                        //calling the method and prints the result
            System.out.println("The square root of "+ number+ " is "+squareRoot(number));
           // System.out.printf("The square root of %d is: %.02f%n", number, squareRoot(number));
        }
                        //user-defined method that contains the logic to find the square root
        public static double squareRoot(int num) {
                         //temporary variable
            double t;
            double sqrtroot = num / 2;
            do {t = sqrtroot;
                sqrtroot = (t + (num / t)) /2;
            }
            while ((t - sqrtroot) != 0);
            return sqrtroot;
        }
}
