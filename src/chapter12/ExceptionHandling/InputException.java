package chapter12.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        boolean doAgain = true;

        do {
            try {

                System.out.println("input number 1");
                int num1 = input.nextInt();
                System.out.println("input number 2");
                int num2 = input.nextInt();
                int result = addSum(num1, num2);
                System.out.println("The result is "+result);
                doAgain = false;
            } catch (InputMismatchException exception) {
                System.out.println("invalid input");
                input.nextLine();
            }
        } while (doAgain);
    }
    public static int addSum(int number1, int number2) throws InputMismatchException {
        return number1 + number2;
    }
}
