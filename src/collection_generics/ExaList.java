package collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExaList {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
