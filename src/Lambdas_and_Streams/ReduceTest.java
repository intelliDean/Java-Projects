package Lambdas_and_Streams;

import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
    List<Integer> numbers  = List.of(12, 43, 45, 23, 54, 56);

        System.out.println(numbers.stream().reduce(0, (x, y) -> x + y));
    }

}
