package chapter17;

import java.util.stream.IntStream;

public class StreamFilter {
    public static void main(String[] args) {
        // sum the triples of the even integers from 2 through 10

        int result = IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum();

        System.out.printf(
                "Lambdas: with filter method: Sum of the triples of the even ints from 2 through 10 is: %d%n", result);
        int newResult = IntStream.rangeClosed(1, 10)
                .map((int x) ->{
                    if (x % 2 == 0) {
                        return x * 3;
                    } return 0;
                })
                .sum();

        System.out.printf(
                "Lambdas: without filter method: Sum of the triples of the even ints from 2 through 10 is: %d%n", newResult);


        int total = 0;
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) { // if x is even
                total += x * 3;
            }
        }
        System.out.printf(
                "Loop: Sum of the triples of the even ints from 2 through 10 is: %d%n", total);
    }
}