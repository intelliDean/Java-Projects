package chapter12;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(21);
        numberList.add(89);
        numberList.add(43);
        numberList.add(90);
        ArrayList<Integer> cloneNumberList = (ArrayList<Integer>) numberList.clone();
        ArrayList<Integer> numberList2 = numberList;

        cloneNumberList.add(8999);
        cloneNumberList.add(435);

        numberList2.remove(0);
        System.out.println("numberList "+numberList);     //numberList and  numberList2 are both pointing to the same reference in memory
        System.out.println("cloneNumberList "+cloneNumberList);    //cloneNumberList is a different object from numberList but contain the content as numberList as a result of the cloning
        System.out.println("numberList2 "+numberList2);
        System.out.println();


        String[] items = {"cake", "coke", "car", "phone"};

        String[] cloneItems = (String[]) items.clone();
        String[] items2 = items;

        items2[0] = "Food";
        cloneItems[0] = "Take";

        System.out.println("items "+Arrays.toString(items));
        System.out.println("items2 "+Arrays.toString(items2));
        System.out.println("cloneItems "+Arrays.toString(cloneItems));

    }
}
