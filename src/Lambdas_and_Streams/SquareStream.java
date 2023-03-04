package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class SquareStream {
    public static void main(String[] args) {
        //Stream is not a collections hence, it does not store the whole streams, it's only a pipeline that the streams flows
        //
        System.out.printf("%,d", IntStream.rangeClosed(1, 40)
                .filter((n)->n % 2 == 0)
                .map(m->m * m)
                .sum()
        );
    }
}
