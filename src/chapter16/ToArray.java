package chapter16;

import java.util.Arrays;
import java.util.LinkedList;

public class ToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};

        System.out.println("colors array");
        for (String color : colors) {
            System.out.printf("%s ", color);
        }
        System.out.println("\n");

        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        links.addLast("red"); // add as last item
        links.add("pink"); // add to the end
        links.add(3, "green"); // add at 3rd index
        links.addFirst("cyan"); // add as first item

        // get LinkedList elements as an array

        colors = links.toArray(new String[0]);

        System.out.println("new colors array: ");

        for (String color : colors) {
            System.out.printf("%s ", color);
        }
    }
}