package Practice;

import java.util.Arrays;

public class PlayBinarySearch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(binary(
                new int[]{23, 32, 43, 65, 87, 90, 120},
                120)));

    }
    public static int[] binary(int[] arrays, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            } else {
                result[0] = mid;
                result[1] = arrays[mid];
                return result;
            }
        }
        return new int[]{};
    }
}
