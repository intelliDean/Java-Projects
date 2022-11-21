package MyReusableCodes;

import java.security.SecureRandom;
import java.util.Arrays;

public class ShuffleRandom {
    public static void main(String[] args) {
        int[] arrays = {65};

        int[] result = shuffle(arrays);
        System.out.println(Arrays.toString(result));
    }
    public static int[] shuffle(int[] arrays) {
        SecureRandom rand = new SecureRandom();
        if (arrays.length < 2) {
            return new int[]{-1};
        }
        for (int i = 0; i < arrays.length; i++) {
            // select a random number between 0 and arrays.length
            int j = rand.nextInt(arrays.length);
            // swap current element with randomly selected number
            int temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
        }
        return arrays;
    }
}
