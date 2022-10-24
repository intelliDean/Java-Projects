package CHAPTER_7.exercise;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] rays = {23,43,54,23,65,23,54,90};
        System.out.println(copyArray(rays));
    }
    public static String copyArray(int[] rays) {
        int[] copyRays = new int[rays.length];
        for (int i = 0; i < rays.length; i++) {
            copyRays[i] = rays[i];
            // System.arraycopy(rays, 0, copyRays, 0, rays.length);
        }
        return Arrays.toString(copyRays);
    }
}
