package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class Lists {
    transient int number;

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(43);
        numbers.add(90);

//        System.out.println(numbers.get(2));
//
//        Iterator<Integer> numIte = numbers.iterator();
//
//        while (numIte.hasNext()) {
//            System.out.println(numIte.next());
//            numIte.remove();
//            System.out.println(numbers);
//        }
//
//        ListIterator<Integer> numbIte = numbers.listIterator();
//
//        while (numbIte.hasPrevious()) {
//            System.out.println(numbIte.previous());
//            numIte.remove();
//            System.out.println(numbers);
//        }

        Spliterator<Integer> numSplit = numbers.spliterator();
        var s = numSplit.trySplit();
        System.out.println(s.estimateSize());

        s.forEachRemaining(System.out::println);
    }
}
