package CHAPTER_7.exercise;

import java.util.Arrays;

public class SumArray {

    public static void toInitializeArray() {
        int [] arr = new int[4];
        int a = 16;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + (4 * i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void toSumArrays() {
        int [] arr = {43,56,23,12};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(total);
    }
    public static void initializeArray() {
        // initializer list specifies the initial value for each element
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%7s%7s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
    public static void toInitializeArrayWithLoop() {
        System.out.printf("%7s%7s%n", "Index", "Value"); // column headings
        int [] ray = new int [13];
        int temp = 0;
        for (int i = 0; i < ray.length; i++) {
            ray[i] = ray.length * i + ray.length % 2;
            temp += ray[i];
            System.out.printf("%5d%8d%n", i, ray[i]);
        }
        System.out.println(Arrays.toString(ray));
    }
    public static void usingArrayLengthToInitialize() {
        final int ARRAY_LEN = 10; // declare constant
        int[] array = new int[ARRAY_LEN]; // create array
         // calculate value for each array element
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
         for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
             System.out.printf("%4d%8d%n", counter, array[counter]);
         }
    }




    public static void main(String[] args) {
        usingArrayLengthToInitialize();
    }


}
