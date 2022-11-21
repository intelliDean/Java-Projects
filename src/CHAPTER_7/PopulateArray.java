package CHAPTER_7;

import java.security.SecureRandom;
import java.util.Arrays;

public class PopulateArray {
    private static final SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Sorted  "+populateArray(3 + rand.nextInt(4)));
    }
    public static String populateArray(int num) {
        int [] small = new int[num];
        for (int i = 0; i < small.length; i++) {
            small[i] = 10 * (1 + rand.nextInt(10));
        }
        System.out.println("Original " + Arrays.toString(small));
        Arrays.sort(small);
        return Arrays.toString((small));
    }
}
