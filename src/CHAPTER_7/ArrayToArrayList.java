package CHAPTER_7;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Collections.sort;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arrays = {"London", "Chicago","Amsterdam", "Toronto","Lagos"};     //Arrays of strings
        ArrayList<String> newList = toArrayList(arrays);        //Arrays converted to ArrayList
        sort(newList);                  //Used ArrayList method to sort the elements of the ArrayList
        Object[] toArray = newList.toArray();           //Convert the ArrayList back into Arrays
        System.out.println(Arrays.toString(toArray));       //Print out the new, sorted Arrays
        System.out.println();
        Integer[] jar = {9,5,6,8,5,7,8,4,3,23,7};
        ArrayList<Integer> newJar = toArrayList(jar);
        sort(newJar);
        Object[] backToJar = newJar.toArray();
        System.out.println(Arrays.toString(backToJar));
    }
    public static ArrayList<String> toArrayList(String[] arrays) {      //the method can even take an empty array
        ArrayList<String> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Integer> toArrayList(Integer[] arrays) {      //the method can even take an empty array
        ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Object> toArrayList(Object[] arrays) {      //the method can even take an empty array
        ArrayList<Object> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Double> toArrayList(Double[] arrays) {      //the method can even take an empty array
        ArrayList<Double> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Float> toArrayList(Float[] arrays) {      //the method can even take an empty array
        ArrayList<Float> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Long> toArrayList(Long[] arrays) {      //the method can even take an empty array
        ArrayList<Long> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }
    public static ArrayList<Boolean> toArrayList(Boolean[] arrays) {      //the method can even take an empty array
        ArrayList<Boolean> lists = new ArrayList<>(Arrays.asList(arrays));
        return lists;
    }

}
