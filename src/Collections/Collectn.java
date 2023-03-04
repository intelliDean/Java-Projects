package Collections;

import java.util.*;

public class Collectn {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(45);
        numbers.add(56);

        int min = Collections.min(numbers);
       // System.out.println("Minimum:: "+min);

        Collection<Integer> numbers2 = new ArrayList<>();
        numbers2.add(76);
        numbers2.add(16);
        numbers2.add(36);

       boolean added = numbers.addAll(numbers2);
       // System.out.println("did it add all? "+ added);
         System.out.println("appended:: "+numbers);

        Collection<Integer> coll = Collections.synchronizedCollection(numbers);
        System.out.println("sync:: "+coll);


        Iterator<Integer>  numIte = numbers.iterator();
//        while (numIte.hasNext()) {
//            System.out.print(numIte.next()+" ");
//        }

        Integer[] numArrays = new Integer[numbers.size()];
        numbers.toArray(numArrays);
        //System.out.println("toArray:: "+ Arrays.toString(numArrays));
    }
}
