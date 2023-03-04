package Lambdas_and_Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 54, 76, 23, 15, 63, 34, 65, 63);

        System.out.println(numbers
                .stream()
                .distinct()     //get the distinct first...then sort
                .sorted()       //this is efficient as you'll have smaller list to sort
                .collect(Collectors.toList())
        );
    }
}
