package CHAPTER_7.exercise;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5,3,2,4,1};
        bubbleSortingAscending(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] bubbleSortingAscending(int[] array){
        boolean swap;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) { //swap is false, i.e, no swap
                 break;
            }
        }
        return array;
    }
    public static int[] bubbleSortingDescending(int[] array){
        boolean swap;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap) { //swap is false, i.e, no swap
                break;
            }
        }
        return array;
    }
}
