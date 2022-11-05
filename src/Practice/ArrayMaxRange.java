package Practice;

public class ArrayMaxRange {
    public static void main(String[] args) {
        int[] arrays = {65, 34, 32, 90, 48, 14, 34,23,87,34,12,98,42,76};
        int start = 5;
        int end = 12;
        int max = minRange(arrays, start, end);
        System.out.println(max);
    }
    public static int maxRange(int[] arrays, int start, int finish) {
        if (start > finish) {
            return -1;
        }
        if (arrays.length == 0) {
            return -1;
        }
        int max = arrays[0];
        for (int i = start; i <= finish; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }
        return max;
    }
    public static int minRange(int[] arrays, int start, int finish) {
        if (start > finish) {
            return -1;
        }
        if (arrays.length == 0) {
            return -1;
        }
        int max = arrays[0];
        for (int i = start; i <= finish; i++) {
            if (arrays[i] < max) {
                max = arrays[i];
            }
        }
        return max;
    }
}
