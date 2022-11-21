package assignment.weekend_snack;

import java.util.ArrayList;

public class OddPosition {
    public static void main(String[] args) {
        int[] rays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list = oddPosition(rays);
        System.out.println(list);
    }
    public static ArrayList<Integer> oddPosition(int[] arrays) {
        ArrayList<Integer> rays = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            if (i % 2 != 0) {
                rays.add(arrays[i]);
            }
        }
        return rays;
    }
}
