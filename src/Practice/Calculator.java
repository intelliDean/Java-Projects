package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int count = 0;
        int ans = 0;
        while (true) {
            System.out.println("""
                                    
                    1: Addition
                    2: Subtraction
                    3: Multiplication
                    4: Division
                    5: Modulo
                                    
                    Select option""");
            int op = input.nextInt();
            if (op == 1 || op == 2 || op == 3 || op == 4 || op == 5){
                System.out.println("\nInput two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            if (op == 1) {
                ans = a + b;
                System.out.printf("%d + %d = %d%n ", a, b, ans);
            }
            if (op == 2) {
                ans = a - b;
                System.out.printf("%d - %d = %d%n ", a, b, ans);
            }
            if (op == 3) {
                ans = a * b;
                System.out.printf("%d * %d = %d%n ", a, b, ans);
            }
            if (op == 4) {
                if (a != 0 || b != 0) {
                    ans = a / b;
                    System.out.printf("%d ÷ %d%n = %d ", a, b, ans);
                }
            }
            if (op == 5) {
                ans = a % b;
                System.out.println(a + " % " + b + " = " + ans);
            }
        } else break;
        }
    }
}
