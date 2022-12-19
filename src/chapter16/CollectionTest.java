package chapter16;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> lists = new ArrayList<>(Arrays.asList(colors));


        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>(Arrays.asList(removeColors));

        // output list contents
        System.out.println("ArrayList: ");

        displayList(lists);

        // remove from list the colors contained in removeList
        removeColors(lists, removeList);

        // output list contents
        System.out.printf("%n%nArrayList after calling removeColors:%n");

        displayList(lists);
    }

    private static void displayList(List<String> lists) {
        for (String list : lists) {
            System.out.printf("%s ", list);
        }
    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

        Iterator<String> iterator = collection1.iterator();

        //collection1.removeIf(collection2 :: contains);
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove(); // remove current element
            }
        }
    }
}
