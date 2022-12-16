package chapter14;

import java.util.Scanner;

public class StaticCharMethods {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String... args) {
        // get radix
        System.out.println("Please enter a radix:");
        int radix = scanner.nextInt();

        // get user choice
        System.out.println("""
        Please choose one:
        1 -- Convert digit to character
        2 -- Convert character to digit
        3 -- Exit
        """);
        int choice = scanner.nextInt();

        // process request
        switch (choice) {
            case 1 -> { // convert digit to character
                toChar(radix);
            }
            case 2 -> { // convert character to digit
                toDigit(radix);
            }
            case 3 -> System.exit(0);
        }
    }

    private static void toChar( int radix) {
        System.out.println("Enter a digit:");
        int digit = scanner.nextInt();
        System.out.printf("Convert digit to character: %s%n%n", Character.forDigit(digit, radix));
        main();

    }

    private static void toDigit(int radix) {
        System.out.println("Enter a character:");
        char character = scanner.next().charAt(0);
        System.out.printf("Convert character to digit: %s%n%n", Character.digit(character, radix));
        main();
    }
}
