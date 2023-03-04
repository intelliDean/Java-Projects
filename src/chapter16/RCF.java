package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RCF {
    public static void main(String[] args) {
        // create and display a List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters); // get List
        System.out.println("list contains: ");
        output(list);

        // reverse and display the List<Character>
        Collections.reverse(list); // reverse order the elements
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);
// create copyList from an array of 3 Characters
        Character[] lettersCopy = new Character[list.size()];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        // fill list with Rs
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
        System.out.printf("%nAfter calling fill, copyList contains:%n");
        output(copyList);
    }

    // output List information
    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf(" Main: %s%n", Collections.min(listRef));
    }
}