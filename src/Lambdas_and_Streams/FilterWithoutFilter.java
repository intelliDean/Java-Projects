package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class FilterWithoutFilter {
    public static void main(String[] args) {
        System.out.println(IntStream.of(23, 43, 65, 23, 67, 45, 78, 89, 23, 67)
                .map((number)->odd(number)) //FilterWithoutFilter :: odd)
                .sum());
    }
    private static int odd(int number) {
        if (number % 2 != 0) {
            return number;
        } else return 0;
    }
}
