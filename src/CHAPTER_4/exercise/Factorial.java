package CHAPTER_4.exercise;

import java.math.BigDecimal;

import static CHAPTER_4.exercise.TwoLargeNumbers.input;

public class Factorial {
    /*Write an application that reads a non-negative integer and computes and prints its factorial.*/
    public static BigDecimal fact(int number) {
        BigDecimal fact = BigDecimal.ONE;
        if (number >= 0) {
            int i = 1;
            while (i <= number) {
                fact = (fact.multiply(BigDecimal.valueOf(i)));
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
