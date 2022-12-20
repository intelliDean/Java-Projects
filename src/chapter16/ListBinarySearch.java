package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListBinarySearch {
    public static void main(String[] args) {
        // create an ArrayList<String> from the contents of colors array
        String[] colors = {"red", "white", "blue", "black", "yellow",
                "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); // sort the ArrayList
        System.out.printf("Sorted ArrayList: %s%n", list);

        // search list for various values
        printSearchResults(list, "black");
        printSearchResults(list, "red");
        printSearchResults(list, "pink");
        printSearchResults(list, "aqua"); // below lowest
        printSearchResults(list, "gray"); // does not exist
        printSearchResults(list, "teal"); // does not exist
    }

    // perform search and display result
    private static void printSearchResults(List<String> list, String key) {

        System.out.printf("%nSearching for: %s in %n%s%n", key, list);
        int result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }
    }
}