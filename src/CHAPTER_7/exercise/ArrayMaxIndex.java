package CHAPTER_7.exercise;

public class ArrayMaxIndex {
    /*This program checks to know the smallest index with the highest element*/
    public static int indexMaxArray() {
        int[] rays = {2, 4, 9, 7, 9, 2, 6, 9};
        int max = rays[0];
        int indexOfMax = 0;
        int count = 0;
        for (int i = 1; i < rays.length; i++) {
            if (rays[i] > max) {
                max = rays[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public static void main(String[] args) {
        System.out.println(indexMaxArray());
    }
}
