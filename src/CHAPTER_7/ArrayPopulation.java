package CHAPTER_7;

import java.util.Arrays;

public class ArrayPopulation {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i + 1;
            System.out.print(arrays[i]+ ", ");
        }
        System.out.println("\n");
        Arrays.stream( arrays).parallel().boxed().forEach(array -> System.out.print(array+", "));

        char [] den = {'x', 'o', 'x', 'o'};

    }
}
