package Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(89);
        numbers.add(65);
        numbers.add(89);
        numbers.add(23);
        numbers.add(34);
        numbers.add(89);
        numbers.add(34);
        numbers.add(13);
        numbers.add(94);
        numbers.add(79);
        numbers.add(64);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("sorted asc:: "+numbers);
        numbers.sort(Comparator.reverseOrder());



        Set<Integer> sets = new TreeSet<>();
        sets.add(34);
        sets.add(89);
        sets.add(13);
        System.out.println(sets);


        numbers.removeAll(sets);
        System.out.println(numbers.addAll(sets));

        System.out.println("sorted desc:: "+numbers);

        Set<String> names = new HashSet<>();

        names.add("Ojukwu");

    }
}
