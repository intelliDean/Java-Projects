package Lambdas_and_Streams;

import javax.swing.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LambdaPrimeNumbers {
    public static void main(String... args) {
        mainPrime();

        toContinue();
    }

    private static void mainPrime() {
        try {
            Integer start = input("Enter start");
            Integer end = input("Enter end");

            if (end < start) {
                int temp = start;
                start = end;
                end = temp;
            }
            primeNumbers(start, end);
        } catch (IllegalArgumentException ex) {
            print("input only valid integer e.g, 5");
            main();
        }
    }

    private static void toContinue() {
        try {
            int reply = input("press 1 for more or any other number to quit");
            if (reply == 1) {
                main();
            } else print("Thank You for using our app");
        } catch (IllegalArgumentException ex){
            print("Enter integer e.g 1 or other integers");
            toContinue();
        }

    }

    public static void print(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static void primeNumbers(int start, int end) {
        int[] primeNumbers = IntStream.rangeClosed(start, end)
                .filter((eachNumber)->isPrime(eachNumber))  //LambdaPrimeNumbers :: isPrime
                .toArray();
        int sum = Arrays.stream(primeNumbers).sum();

        print(start, end, primeNumbers, sum);
    }

    private static void print(int start, int end, int[] primeNumbers, int sum) {
        String message;
        if (primeNumbers.length < 1) {
            message = String.format("No prime number between %d and %d%n", start, end);
        } else {
            message = String.format("The prime numbers between %d and %d%n%s%n and their sum is %,d%n",
                    start, end, Arrays.toString(primeNumbers), sum);
        }
        JOptionPane.showMessageDialog(null, message);
    }

    private static int input(String prompt) {
        String strNum1 = JOptionPane.showInputDialog(null, prompt);
        return Integer.parseInt(strNum1);
    }

    public static boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
