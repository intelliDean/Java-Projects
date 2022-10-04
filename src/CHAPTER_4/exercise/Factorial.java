package CHAPTER_4.exercise;

import static CHAPTER_4.exercise.TwoLargeNumbers.input;

public class Factorial {
    /*Write an application that reads a non-negative integer and computes and prints its factorial.*/
    public static int fact(int number) {
        int fact = 1;
        if (number >= 0) {
            int i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the factorial number");
        int fact = input.nextInt();
        System.out.println(fact(fact));

    }
}
