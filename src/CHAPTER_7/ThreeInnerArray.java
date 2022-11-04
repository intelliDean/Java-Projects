package CHAPTER_7;

import java.security.SecureRandom;
import java.util.Arrays;

public class ThreeInnerArray {
    public static void main(String[] args) {
        int[][][] result = nested3by3();
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][][] nested3by3() {
        SecureRandom rand = new SecureRandom();
        int[][][] arrays = new int[3][3][3];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                for (int k = 0; k < arrays[i][j].length; k++) {
                    arrays[i][j][k] = 1 + rand.nextInt(9);
                }
            }
        }
        return arrays;
    }
}
