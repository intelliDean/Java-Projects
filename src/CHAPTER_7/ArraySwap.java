package CHAPTER_7;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] rays = {1,2};

        int [] arr = swapRay(rays);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] swap(int[] arrays) {
        int temp = arrays[0];
        arrays[0] = arrays[1];
        arrays[1] = temp;
        return arrays;
    }
    public static int[] swapRay(int[] arrays) {
        return new int[]{arrays[1], arrays[0]};
    }
    public static int[] swap_(int[] arrays) {
        int temp;
        for (int i = 0, j = i+1; i < arrays.length - 1; i++, j++) {
            temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;

        }
        return arrays;
    }

}
