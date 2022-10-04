package CHAPTER_7;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] array = {4,5,8,87,23,54,65,76,23,87,9};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array [j] < array[i]) {
                    int temp = array [j];
                    array[j] = array[i];
                    array [i] = temp;
                }

            }
    }
        System.out.println("Sorted Arrays - "+ Arrays.toString(array));
    }
}
