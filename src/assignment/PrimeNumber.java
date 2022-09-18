package assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeCheckNumber;
        int n = 1;
        int divisibleCount;

        System.out.println("Enter number: ");
        int number = input.nextInt();

        while (n <= number) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
            if (n % primeCheckNumber == 0) {
                divisibleCount++;
                break;
                }
            primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }
   }
}