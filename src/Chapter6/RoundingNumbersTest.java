package Chapter6;

import java.util.Scanner;

class RoundingNumbersTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        RoundingNumbers twoSum = new RoundingNumbers();

        System.out.println("Enter the two decimal numbers, separated by spacebar");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


        System.out.printf("The rounding number of %.1f and %.1f = %f%n",num1, num2, Math.floor(twoSum.roundTwoNumbers(num1,num2)));
        System.out.println("This program round values to the nearest integer, i.e, it gives it a round figure");
    }

}