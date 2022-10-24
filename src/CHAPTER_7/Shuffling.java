package CHAPTER_7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Shuffling {
    public static int[] shuffle1(int[] array) {
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(array.length - 1);
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
        return array;
    }
    public static String[] shuffle2(String[] names) {
        for (int i = names.length - 1; i > 0; i--) {
            SecureRandom rand = new SecureRandom();
            int j = rand.nextInt(names.length - 1);
            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;
        }
        return names;
    }

    public static void main(String[] args) {
        String[] ark = {"Ade","Dean","Michael","King"};
        shuffle2(ark);
        System.out.println(Arrays.toString(ark));
    }
}
