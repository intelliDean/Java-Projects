package chapter16;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {
    public static void main(String[] args) {
        String[] colors = {"red", "orange", "yellow",
                "green", "blue", "indigo", "violet"};


        // create a List
        List<String> colorList = List.of(colors);       //factory method element is unmodifiable

        System.out.printf("colorList: %s%n%n", colorList);      //Factory method elements are unmodifiable

        // create a Set
        Set<String> colorSet = Set.of(colors);
        System.out.printf("colorSet: %s%n%n", colorSet);

        // create a Map using method "of"
        Map<String, Integer> dayMap = Map.of("Sunday", 1, "Monday", 2, "Tuesday", 3,
                "Wednesday", 4, "Thursday", 5, "Friday", 6, "Saturday", 7);


        System.out.printf("dayMap: %s%n%n", dayMap);

        // create a Map using method "ofEntries" for more than 10 pairs
        Map<String, Integer> daysPerMonthMap = Map.ofEntries(
                Map.entry("January", 31),
                Map.entry("February", 28),
                Map.entry("March", 31),
                Map.entry("April", 30),
                Map.entry("May", 31),
                Map.entry("June", 30),

                Map.entry("July", 31),
                Map.entry("August", 31),
                Map.entry("September", 30),
                Map.entry("October", 31),
                Map.entry("November", 30),
                Map.entry("December", 31)
        );


        System.out.printf("monthMap: %s%n", daysPerMonthMap);
    }
}