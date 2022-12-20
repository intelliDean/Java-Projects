package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted%n%s%n", list);

        Collections.sort(list); // sort ArrayList
        System.out.printf("Asc Sort%n%s%n", list);

        list.sort(Collections.reverseOrder());
        System.out.printf("Desc Sort:%n%s%n", list);
    }
}
