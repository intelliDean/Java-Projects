package CHAPTER_7;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] array = {1};

        int[] rays = swapAndReverse(array);
        System.out.println("\t\tSorted in ascending \n"+ Arrays.toString(rays));

    }

    public static int[] swapAndReverse(int[] arrays) {
        if (arrays.length == 0) {
            return new int[]{-1};
        }
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            if (i < j) {
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
        }
        return arrays;
    }
    public static int[] sortingArray(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays [j] < arrays[i]) {
                    int temp = arrays [j];
                    arrays[j] = arrays[i];
                    arrays [i] = temp;
                }
            }
        }
        return arrays;
    }
    public static int[] reverse(int[] arrays) {
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {

        }
        return arrays;
    }
}
