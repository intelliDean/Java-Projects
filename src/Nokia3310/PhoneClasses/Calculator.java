package Nokia3310.PhoneClasses;

import java.util.Scanner;

import static Nokia3310.PhoneClasses.Menu.menu;
import static Nokia3310.PhoneDriver.enter;

public class Calculator {
    public static void calculator() {
        System.out.println("""
                                
                1: 🧮 Calculate
                2: 🔙 Back""");
        switch (enter()) {
            case 1 -> calc();
            case 2 -> menu();
            default -> calculator();
        }
    }

    public static void calc() {
        Scanner input = new Scanner(System.in);
        System.out.println("""             
                                    
                1: ➕ Addition
                2: ➖ Subtraction
                3: ✖️Multiplication
                4: ➗ Division
                5: ®️Mod
                
                99: Back
                                
                Press 1 - 5 for calculation
                or any other numbers to exit""");
        int op = input.nextInt();
        if (op == 1 || op == 2 || op == 3 || op == 4 || op == 5) {
            System.out.println("\nInput two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            double ans;
            switch (op) {
                case 1 -> {
                    ans = a + b;
                    System.out.printf("%d + %d = %.1f%n ", a, b, ans);
                    calc();
                }
                case 2 -> {
                    ans = a - b;
                    System.out.printf("%d - %d = %.1f%n ", a, b, ans);
                    calc();
                }
                case 3 -> {
                    ans = a * b;
                    System.out.printf("%d * %d = %.1f%n ", a, b, ans);
                    calc();
                }
                case 4 -> {
                    if (b != 0) {
                        ans = a / b;
                        System.out.printf("%d ÷ %d = %.1f%n ", a, b, ans);
                        calc();
                    } else {
                        System.out.println("Invalid denominator");
                    }
                }
                case 5 -> {
                    ans = a % b;
                    System.out.println(a + " % " + b + " = " + ans);
                    calc();
                }
            }
        } else calculator();
    }
}
