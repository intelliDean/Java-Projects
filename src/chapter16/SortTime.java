package chapter16;

import chapter8.Time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTime {
    public static void main(String[] args) {
        List<Time> list = new ArrayList<>(); // create List

        list.add(new Time(6, 24, 34));
        list.add(new Time(18, 14, 58));
        list.add(new Time(6, 5, 34));
        list.add(new Time(12, 14, 58));
        list.add(new Time(6, 24, 22));

        // output List elements
        System.out.printf("Unsorted array elements:%n%s%n", list);

// sort in order using a comparator
        Collections.sort(list, new CompareTime());


        // output List elements
        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
