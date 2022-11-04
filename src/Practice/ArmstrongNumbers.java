package Practice;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for 3 digits armstrong number");
        int number = input.nextInt();
        String num = Integer.toString(number);

        if (num.length() == 3) {
        boolean result = isThreeArmstrong(number);
        System.out.println(result);
        } else {
            System.out.println("Invalid armstrong number");
        }

        System.out.println("Enter number for 4 digits armstrong number");
        int in = input.nextInt();
        boolean result = isFourArmstrong(in);
        System.out.println(result);

        result = isNthArmstrong(in, 5);
        System.out.println(result);

    }
    public static boolean isThreeArmstrong(int number) {
        int original = number;
        int sum = 0;
        for (int i = 0; number > 0; i++) {
            int rem = number % 10;
            number /= 10;
            sum += rem * rem * rem;
        }
       return original == sum;
    }
    public static boolean isFourArmstrong(int number) {
        int original = number;
        int sum = 0;
        for (int i = 0; number > 0; i++) {
            int rem = number % 10;
            number /= 10;
            sum += rem * rem * rem * rem;
        }
        return original == sum;
    }
    public static boolean isNthArmstrong(int n, int number) {
        int original = number;
        int sum = 0;
        for (int i = 0; number > 0; i++) {
            int rem = number % 10;
            number /= 10;
            sum += Math.pow(rem, n);
        }
        return original == sum;
    }
}
