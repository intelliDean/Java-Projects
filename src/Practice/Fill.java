package Practice;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int[][] arrays = new int[3][];
        arrays[0] = new int[7];
        arrays[1] = new int[3];
        arrays[2] = new int[9];


        for (int i = 0; i < arrays.length; i++) {
            //to populate the multidimensional array row and column
            Arrays.fill(arrays[i], (i + 1));
        }

        for (int[] array : arrays) {
             for (int i : array) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
