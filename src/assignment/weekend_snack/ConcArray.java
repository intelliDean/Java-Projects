package assignment.weekend_snack;

import java.util.ArrayList;

public class ConcArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        char[] ray = {'a', 'b', 'c', 'd'};
        ArrayList<Object> wink = innerArray(arr, ray);
        System.out.println(wink);
    }
    public static ArrayList<Object> twoArrays(int[] arrays, char[] arrays1) {
        ArrayList<Object> newArrays = new ArrayList<>();
        for (int array : arrays) {
            newArrays.add(array);
        }
        for (char c : arrays1) {
            newArrays.add(c);
        }
        return newArrays;

    }
    public static ArrayList<Object> innerArray(int[] arrays, char[] arrays1) {
        ArrayList<Object> inner = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            inner.add(arrays[i]);
            inner.add(arrays1[i]);
        }
        return inner;
    }
}


