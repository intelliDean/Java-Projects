package MyReusableCodes;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};
        int[] result = reverseMain(arrays);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseMain(int[] arrays) {
        if (arrays.length <= 1) {
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
    public static int[] reverseNewCreate(int[] list) {
        if(list.length <= 1) {
            return new int[]{-1};
        }
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
