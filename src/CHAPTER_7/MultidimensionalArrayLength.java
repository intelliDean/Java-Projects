package CHAPTER_7;

import java.util.Arrays;

public class MultidimensionalArrayLength {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[] res = manipulateLength(array);

        System.out.println(Arrays.toString(res));
        System.out.printf("The row length is %d and the column length is %d%n", res[0], res[1]);
    }

    public static int[] manipulateLength(int[][] arrays) {
        int[] result = new int[2];
        result[0] = arrays.length;
        result[1] = arrays[0].length;
        return result;
    }
}
