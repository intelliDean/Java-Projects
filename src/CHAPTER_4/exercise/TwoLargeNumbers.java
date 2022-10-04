package CHAPTER_4.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class TwoLargeNumbers {
    private static final SecureRandom numbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);
    /*(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
    public static void twoLarge(){
    int large = 0;
    int secondLarge = 0;
    int i = 1;
    while (i <= 10) {
        int num = 1 + numbers.nextInt(100);
        if (num > large) {
            large = num;
        } else {
        if (num > secondLarge && num < large) {
            secondLarge = num;
        }
        }
        System.out.printf("Number %d: %d%n", i, num);
        i++;
    }
        System.out.printf("%n%d: %d%n",secondLarge, large);
    }

    public static void main(String[] args) {
        twoLarge();
    }

}
