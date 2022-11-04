package CHAPTER_7;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] array = {4,5,8,87,23,54,65,76,23,87,9};

        int[] rays = swapArray(array);
        System.out.println("\t\tSorted in ascending \n"+ Arrays.toString(rays));

    }
    public static int[] swapArray(int[] arrays) {

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

}
