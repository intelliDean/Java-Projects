package Lambdas_and_Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(23, 43, 12, 78, 54, 34, 65);
        List<Integer> numberList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numberList);
    }
}
