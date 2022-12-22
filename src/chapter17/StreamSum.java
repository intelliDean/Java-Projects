package chapter17;

import java.util.stream.IntStream;

public class StreamSum {
    public static void main(String[] args) {
        // sum the integers from 1 through 10

        int result = IntStream.rangeClosed(1, 10).sum();

        System.out.printf("Lambdas: Sum of 1 through 10 is: %d%n",result);

        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.printf("Loop: Sum of 1 through 10 is: %d%n",total);
    }
}