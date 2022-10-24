package CHAPTER_7.exercise;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("arrays before manipulation");
        int[] arrays = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrays));

        System.out.println("arrays reversed");
        int[] revArrays = reverse(arrays);
        System.out.println(Arrays.toString(revArrays));

        System.out.println("arrays shuffled");
        int[] shuffledArrays = shuffled(revArrays);
        System.out.println(Arrays.toString(shuffledArrays));

        System.out.println("arrays sorted");
        int[] sortArrays = sorted(shuffledArrays);
        System.out.println(Arrays.toString(sortArrays));
    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
             result[j] = list[i];
        }
        return result;
    }

    public static int[] shuffled(int[] arrays) {
        Random rand = new Random();
        for (int i = 0, j = rand.nextInt(arrays.length - 1); i < arrays.length ; i++) { //All initialization in one place, the condition, then increment in one place
            int temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
        }
        return arrays;
    }

    public static int[] sorted(int[] arrays) {
        boolean isSwap;
        for (int i = 0; i < arrays.length; i++) {
            isSwap = false;
            for (int j = 1; j < arrays.length - i; j++) { //for each pass, the length condition of J decreases by the number of I
                if (arrays[j] < arrays[j - 1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                    isSwap = true;
                }
            }
            if(!isSwap) {
                break;
            }
        }
        return arrays;
    }
}