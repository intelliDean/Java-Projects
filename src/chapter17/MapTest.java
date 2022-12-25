package chapter17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapTest {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 6, 2, 7, 3, 8, 4, 9, 10};

        System.out.println(IntStream.of(12, 89, 98, 90, 64)
                .map(x->x * x)
                .map(x->x * 2)
                .filter(x->x > 4)
                .sorted()
                .mapToObj(String :: valueOf)
                .collect(Collectors.joining(", ")));

        IntStream.of(numbers).map(x->{
                    if (x > 5) {
                        return x * 2;
                    } else
                        return x * 3;
                }).sorted()
                .forEach(System.out :: print);
        System.out.println("\n");
        System.out.println(IntStream.of(numbers).summaryStatistics());


    }
}
