package Lambdas_and_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambArrays {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(9);
        numbers.add(12);
        numbers.add(92);
        numbers.add(43);
        numbers.add(64);
        numbers.add(43);
        numbers.add(23);

        Stream.of(numbers).forEach(System.out::println);

//        Stream<Integer> stream = numbers.stream();
//        Consumer<Integer> consumer = (number)->System.out.printf(number+" ");
//        stream.forEach(consumer);
//
//
//        numbers.stream().forEach((n)->System.out.println(n));
//
//        numbers.forEach(System.out :: println);


    }
}
