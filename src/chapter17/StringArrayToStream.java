package chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrayToStream {
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));
        System.out.println();
        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String :: toUpperCase)
                        .collect(Collectors.toList()));
        System.out.println();
        // strings less than "n" (case-insensitive) sorted ascending
        System.out.printf("strings less than n sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
        System.out.println();
        // strings less than "n" (case-insensitive) sorted descending
        System.out.printf("strings greater than n sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
        System.out.println();
        System.out.printf("strings less than n sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s->s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
    }
}
