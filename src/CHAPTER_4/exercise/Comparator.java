package CHAPTER_4.exercise;

import static CHAPTER_4.exercise.GasUsage.input; // this is an import of a scanner object from one of my projects

public class Comparator {
    /*(Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.*/
    public static void compare(int a, int b) {
        if (a == b) {
            System.out.println("0");
        } else if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        System.out.println("enter numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        compare(number1, number2);
    }
}
