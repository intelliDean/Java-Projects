package chapter02;

import java.util.Scanner;

public class NumberWithSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        withSpace(number);
    }
    public static void withSpace(int number) {
        String num = String.valueOf(number);

        char[] ch = num.toCharArray();
        for(char i : ch) {
            System.out.print(i+ " ");
        }
    }
}