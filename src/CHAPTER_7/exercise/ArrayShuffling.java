package CHAPTER_7.exercise;

import java.util.Arrays;

public class ArrayShuffling {
    public static String[] shuffling() {
        int[] rays = {3, 4, 8, 5, 9, 9, 12};
        for (int i = rays.length - 1; i > 0; i--) {
                // Generate an index j randomly with 0 <= j <= i
            int j = (int) (Math.random() * (i + 1));
                // Swap myList[i] with myList[j]
            int temp = rays[i];
            rays[i] = rays[j];
            rays[j] = temp;
        }
        return new String[]{Arrays.toString(rays)};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffling()));
    }
}
