package CHAPTER_7;

import java.util.Arrays;

public class EllipsisToArrayMadness {
    public static void main(String[] args) {
        int[] result = reverseArrayMadness(34,90,23,89,9,109);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArrayManipulation(int... numbers) {
        int[] newArray = new int[numbers.length];
        int numbersSum = 0;
        for(int number : numbers) {
            numbersSum += number;
        }
        for (int i = 0, j = newArray.length - 1; i < numbers.length; i++, j--) {
            newArray[i] = numbersSum - numbers[j];
        }
        return newArray;
    }
    public static int[] reverseArrayMadness(int... numbers) {
        int[] newArray = new int[numbers.length];
        int numbersSum = 0;
        for(int number : numbers) {
            numbersSum += number;
        }
        for (int i = 0, j = newArray.length - 1; i < numbers.length; i++, j--) {
            newArray[i] = (numbersSum - numbers[j]) + j;
            numbersSum = newArray [i];
        }
        return newArray;
    }
}
