package Practice;

import java.util.ArrayList;

public class CollectionMethod {
    public static void main(String[] args) {
        Integer[] arrays = {3,5,2,6,3,8,5,7,4,6};
        ArrayList<Integer> list = toArrayList(arrays);
        //Collections.rotate(list,4);         //this method in Collection class rotates the list using the distance from the back to move to the front. e.g
                                                // distance 4 moves 5746 to the front now having [5746352638]
        //Collections.unmodifiableList(list);   //this makes the list to be immutable, unmodifiable, fixed
        //Collections.reverse(list);            // this reverses the list from the back
        //Collections.shuffle(list);            //this shuffles the list, we get different results everytime we execute the method
        //Collections.sort(list);               //this sorts the array
        //System.out.println(Collections.binarySearch(list, 4));        //this only work with a sorted list.
                                                                        // it searches for an element in the list using the key. the key is the target we are searching for

        System.out.println(list);

    }
    public static ArrayList<Integer> toArrayList(Integer[] arrays) {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>(List.of(arrays));       //another way
        for (Integer array: arrays) {
            list.add(array);
        }
        //Collections.addAll(list, arrays);     //i could have written it like this
        return list;
    }
}
