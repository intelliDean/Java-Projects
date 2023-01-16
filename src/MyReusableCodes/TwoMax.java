package MyReusableCodes;

import java.util.Arrays;

public class TwoMax {
    public static void main(String[] args) {
        int[] arrays = {65, 1000, 25, 78, 76, 90, 32, 720};
        int[] max = twoMax(arrays);
        System.out.println(Arrays.toString(max));
    }

    public static int[] twoMax(int[] arrays) {
        Arrays.sort(arrays);
        return new int[]{arrays[arrays.length - 2], arrays[arrays.length - 1]};
    }
}
