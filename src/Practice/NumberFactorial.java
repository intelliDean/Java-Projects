package Practice;

import java.util.Scanner;

public class NumberFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int a = 1; a > 0; a++) {
        System.out.println("Input number or 0 to quit");
            int reply = input.nextInt();
            if (reply != 0) {
                long fact = 1;
                for (int i = 1; i <= reply; i++) {
                    fact = fact * i;
                }
                System.out.printf("The factorial of %d = %d%n%n", reply, fact);
            } else break;
        }
    }
}
