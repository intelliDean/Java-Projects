package chapter17;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        // sum the even integers from 2 through 20
        int result = IntStream.rangeClosed(1, 10)                              //get numbers 1 - 10
                .map((int eachNumber)->{ return eachNumber * 2;})       //take each number and multiply it by 2
                .sum();                                                       //sum all the numbers multiplied by 2


        System.out.printf("Lambdas: Sum of the even ints from 2 through 20 is: %d%n", result);

        int total = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
            total += i;
            }
        }
        System.out.printf("Loop: Sum of the even ints from 2 through 20 is: %d%n", total);
    }
}
