package Practice;

import java.util.Scanner;

public class FibonacciNumber { // fibonacci number takes the sum of two previous numbers to the third space e.g, 0,1,1,2,3,5,8,13,21,etc
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Fib number");
        int num = input.nextInt();
        int a = 0; // a is initialized to 0
        int b = 1; // b is initialized to 1
        for (int i = 2; i <= num; i++) {
            int c = b; // c is brought in to temporarily take the value of b
            b = a + b; // b is given value of a + b
            a = c; // a takes the former value of b stored in c
        }
        System.out.printf("%nThe %d fibonacci number = %,d%n", num, b);
    }
}
