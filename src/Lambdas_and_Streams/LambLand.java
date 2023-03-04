package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class LambLand {
    public static void main(String[] args) {
//        IntStream.of(23, 43, 54, 24, 90, 12, 54)
//                .filter((number)->number % 2 == 0 && number > 20)
//                .map((number)-> number* 2)
//                .forEach((number)->System.out.print(number+" "));

        System.out.println(IntStream.rangeClosed(12, 500)
                .dropWhile((number)->number < 200 && number % 2 == 0)
                .average()
        );

    }

}
