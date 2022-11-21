package assignment.weekend_snack;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 2, 1};
        int[] result = reverse(arrays);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverse(int[] arrays) {
        int[] newArrays = new int[arrays.length];
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            newArrays[i] = arrays[j];
        }
        return newArrays;
    }
}
