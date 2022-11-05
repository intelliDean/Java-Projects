package MyReusableCodes;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[] arrays = {2, 1, 70, 43, 21, 56};

        int[] result = sortedAscending(arrays);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortedAscending(int[] arrays) {
        if (arrays.length < 2) {
            return new int[]{-1};
        }
        boolean swapped;
        for (int i = 0; i < arrays.length; i++) {
            swapped = false;
            for (int j = 1; j < arrays.length - i; j++) { //for each pass, the length condition of J decreases by the number of I
                if (arrays[j] < arrays[j - 1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arrays;
    }
    public static int[] sortedDescending(int[] arrays) {
        if (arrays.length < 2) {
            return new int[]{-1};
        }
        boolean swapped;
        for (int i = 0; i < arrays.length; i++) {
            swapped = false;
            for (int j = 1; j < arrays.length - i; j++) { //for each pass, the length condition of J decreases by the number of I
                if (arrays[j] > arrays[j - 1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arrays;
    }
}
