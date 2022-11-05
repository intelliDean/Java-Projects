package CHAPTER_7;

import java.util.Arrays;

public class LinearSearch2DArrays {
    public static void main(String[] args) {
        int[][] arrays = {
                {23, 56, 89},
                {21, 65, 34, 65},
                {76, 12}
        };
        int target = 34;
        int[] result = linearSearch2D(arrays, target);

        System.out.println(Arrays.toString(result));

    }
    public static int[] linearSearch2D(int[][] arrays, int target) {
        if (arrays.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (target == arrays[i][j]) {
                 return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
