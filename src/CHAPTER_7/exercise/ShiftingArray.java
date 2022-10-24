package CHAPTER_7.exercise;

import java.util.Arrays;

public class ShiftingArray {
    public static int[] shifting(int[] rays) {
        int temp = rays[0]; // Retain the first element
//        rays[4] = rays[3];
//        rays[3] = temp;
            // Shift elements left
        for (int i = 1; i < rays.length; i++) { //by starting i at i, we are excluding the first index[0]
            rays[i - 1] = rays[i];
        }
            // Move the first element to fill in the last position
        rays[rays.length - 1] = temp;
        return rays;
    }

    public static void main(String[] args) {
        int[] rays = {45, 76, 23, 90, 65, 23, 54, 65};
        System.out.println(Arrays.toString(shifting(rays)));
    }
}
