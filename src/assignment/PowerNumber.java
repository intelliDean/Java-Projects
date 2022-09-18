package assignment;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        int count = 1;

        System.out.println("Enter Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number: ");
        int num2 = input.nextInt();

        for (count = 1; count <= num2; count++){
            total *= num1;
        }
        System.out.printf("%d raised to power %d = %d%n", num1, num2, total);
    }
}
