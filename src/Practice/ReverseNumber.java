package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input number");
        long num = input.nextLong();
        long temp = num;
        int count = 1;
        long a = 0;
        while (num > 0) {
            long rem = num % 10;
            a = a * 10 + rem;
            count++;

            num /= 10;
        }
        System.out.printf("The reverse of %d is % d%n", temp, a);
    }

}
