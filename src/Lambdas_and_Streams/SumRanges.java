package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class SumRanges {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 20; i += 2) {
            total += i;
        }
        System.out.println(total);

        int total1 = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                total1 += i;
            }
        }
        System.out.println(total);

        int numbers = IntStream.rangeClosed(1, 20)
                .filter((n)->n % 2 == 0)    // TODO: 26-Jan-23  plenty conditions could be in another method and called in the filter
                .sum();
        System.out.println(numbers);
    }
}
