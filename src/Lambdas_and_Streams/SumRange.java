package Lambdas_and_Streams;

import java.util.stream.IntStream;

public class SumRange {
    public static void main(String[] args) {
//        int sum = sumRange(4, 1000);
//        System.out.printf("%,d", sum);

//        int[] num = sorting(new int[]{54, 65, 23, 12, 43, 23, 64, 55});
//        System.out.println(Arrays.toString(num));
//        int[] numbers = reverse(new int[] {23, 54, 65, 12, 65});
//        System.out.println(Arrays.toString(numbers));

//        int index1 = 2;
//        int index2 = 5;
//        int[] numbers = swap(new int[]{23, 54, 65, 24, 90, 15, 54, 10}, index1, index2);
//        System.out.println(Arrays.toString(numbers));

//        int index1 = 2;
//        int index2 = 5;
//        int[] numbers = {23, 54, 65, 24, 90, 15, 54, 10};
//        swapped(numbers, index1, index2);
//        System.out.println(Arrays.toString(numbers));

        int index = bSearch(new int[]{12, 23, 34, 45, 56, 65, 70, 90, 115}, 90);
        System.out.println(index);

    }

    private static int sumRange(int base, int peak) {
        if (base < peak) {
            return IntStream
                    .rangeClosed(base, peak)
                    .sum();
        } else {
            return IntStream
                    .rangeClosed(peak, base)
                    .sum();
        }
    }

    public static int[] sorting(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return numbers;
    }

    public static int[] reverse(int[] arrays) {
        for (int i = 0, j = arrays.length - 1;
             i < arrays.length / 2; i++, j--) {
            int temp = arrays[j];
            arrays[j] = arrays[i];
            arrays[i] = temp;
        }
        return arrays;
    }

    public static int[] swap(int[] arrays, int a, int b) {
        int temp = arrays[a];
        arrays[a] = arrays[b];
        arrays[b] = temp;
        return arrays;
    }

    public static void swapped(int[] arrays, int a, int b) {
        int temp = arrays[a];
        arrays[a] = arrays[b];
        arrays[b] = temp;
    }

    public static int bSearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > numbers[mid]) {
                start = mid + 1;
            } else if (target < numbers[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}