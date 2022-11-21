package assignment.drivers;

import assignment.SumNumbersWithLoop;

import java.util.Scanner;

public class SumNumbersWithLoopDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number to sum");
        System.out.printf("%n%d%n",SumNumbersWithLoop.sumWithLoop(input.nextInt()));
    }
}
