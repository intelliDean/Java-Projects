package Lambdas_and_Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleMap {
    public static void main(String[] args) {
        List<Integer> lists = List.of(1, 2, 3, 4, 5);
        System.out.println(lists.stream().
                map((num)->num * num)
                .map((x)->x * x)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
