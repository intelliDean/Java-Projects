package chapter02;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    /*7 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]*/

        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Enter number 3");
        int num3 = input.nextInt();

        int sum = addingNumbers(num1, num2, num3);
        System.out.printf("%nThe sum of %d,%d,%d is %d%n ", num1, num2, num3, sum);

        double avg = average(num1, num2, num3);
        System.out.printf("%nThe average is %.2f%n", avg);

        int product = multiply(num1, num2, num3);
        System.out.printf("%nThe product of %d, %d, %d is %d%n", num1, num2, num3, product);

            int largest = max(num1, num2, num3); //Math.max(num1, Math.max(num2,num3));

        System.out.printf("%nThe largest of %d, %d, %d is %d%n",num1, num2, num3,largest);

        int lowest = min(num1, num2, num3);
        System.out.printf("%nThe lowest of %d, %d, %d is %d%n",num1, num2, num3,lowest);
    }
    public static int addingNumbers(int... numbers) {
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        return total;
    }
    public static double average(int... numbers) {
        int total = addingNumbers(numbers);
        return (double) total / numbers.length;
    }
    public static int multiply(int... numbers) {
        int total = 1;
        for(int number : numbers) {
            total *= number;
        }
        return total;
    }
    public static int max(int... numbers) {
        int max = numbers[0];
        for(int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int min(int... numbers) {
        int min = numbers[0];
        for(int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
