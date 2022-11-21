package CHAPTER_7;

import MyReusableCodes.Count;

public class EvenDigitsInAnArray {
    public static void main(String[] args) {
        int[] arrays = {12, 345, 8737, 90, 231, 625, 6};
        int result = evenDigits(arrays);
        System.out.println(result);
    }
    public static int evenDigits(int[] arrays) {
        if (arrays.length == 0) {
            return -1;
        }
        int count = 0;
        for (int arr : arrays) {
            if (even(arr)) {
                count++;
            }
        }
        return count;
    }
    public static boolean even(long arr) {
        long number = Count.digits2(arr);
        return number % 2 == 0;
    }


}
