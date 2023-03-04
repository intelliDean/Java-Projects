package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class WithAndWithoutFilter {
    public static void main(String[] args) {
        // TODO: 27-Jan-23: WITH FILTER
        System.out.printf("%,d%n",IntStream.rangeClosed(1, 50)
                .filter(x->x % 2 == 0)
                .map(x->x * x)
                .sum());

// TODO: 27-Jan-23: WITHOUT FILTER
        System.out.printf("%,d%n",IntStream.rangeClosed(1, 50)
                .map(x->{
                    if (x % 2 == 0) {
                        return x * x;
                    } else {
                        return 0;
                    }
                })
                .sum());


    }
}
