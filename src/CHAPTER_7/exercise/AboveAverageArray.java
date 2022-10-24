package CHAPTER_7.exercise;

import java.util.Arrays;
import java.util.Random;

public class AboveAverageArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] rays = new int[9];
        for (int i = 0; i < rays.length; i++) {
            rays[i] = 5 * (1 + rand.nextInt(20));
        }
        System.out.println(Arrays.toString(rays));
        System.out.println(aboveAverage(rays)+" element(s) are above the average");
    }
    public static int aboveAverage(int[] rays) {
        int total = 0;
        for (int ray : rays) {
            total += ray;
        }
        float avg = (float) total / rays.length;
        System.out.printf("The average is %.2f%n", avg);
        int count = 0;
        for (int ray : rays) {
            if (ray > avg) {
                count++;
            }
        }
        return count;
    }
}
