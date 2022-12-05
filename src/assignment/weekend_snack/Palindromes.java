package assignment.weekend_snack;

import java.util.Arrays;

public class Palindromes {
    public static void main(String[] args) {
        int[] rays = {1, 2, 1, 2, 1};
        boolean y = palindrome(rays);
        System.out.println(y);

        System.out.println(Arrays.toString(swappedReverse(new int[]{2, 3, 6,8,5,4,3,45,6,7,7,5,4, 4, 5, 6, 7})));

    }
    public static boolean palindrome(int[] arrays) {
        int[] newArrays = new int[arrays.length];
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            newArrays[i] = arrays[j];
        }
        return newArrays == arrays;
    }
    // This is very optimised because a new array is not needed to be created and also,
    // it iterates for half of the length of the array
    public static int[] swappedReverse(int[] arrays) {
        for (int i = 0, j = arrays.length - 1; i < arrays.length / 2; i++,j--) {
            int temp = 0;
            temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
        }
        return arrays;
    }
    public static char[] charPalindrome(String word) {
        char[] newWord = word.toCharArray();
        for (int i = 0, j = newWord.length - 1; i < newWord.length / 2; i++, j--) {
            char temp = newWord[i];
            newWord[i] = newWord[j];
            newWord[j] = temp;
        }
        return newWord;
    }
}
