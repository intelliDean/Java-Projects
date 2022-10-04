package CHAPTER_4.exercise;

import java.util.Scanner;

public class PerfectNumber {
    private static boolean isPerfect(int num){
        int fact = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                fact += i;
                System.out.printf("% d", i);
            }
        }
        System.out.println(" are the factors of "+ num);
        return num == fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number");
        int num = input.nextInt();

        if (isPerfect(num)) {
            System.out.printf("%n%d is a perfect number%n", num);
        } else {
            System.out.printf("%n%d is not a perfect number%n", num);
        }
    }


}
