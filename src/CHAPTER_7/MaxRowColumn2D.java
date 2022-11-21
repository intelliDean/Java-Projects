package CHAPTER_7;

public class MaxRowColumn2D {
    public static void main(String[] args) {
        int[][] arrays = {
                {2,4,5},
                {1,2,3,4},
                {4,9,5},
                {2,7,4}
        };
        int result = maxRow(arrays);
        System.out.println(result);
    }
    public static int maxColumn(int[][] arrays) {
        if (arrays.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int[] rows : arrays) {
            int total = 0;
            for(int column : rows) {
                total += column;
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
    public static int maxRow(int[][] arrays) {
        if (arrays.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int a = 0;
        for (int i = 0; i < arrays.length; i++) {
            int total = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                total += arrays[i][j];
            }
            if (total > max) {
                max = total;
                a = i;
            }
        }
        return a;
    }
}
