package CHAPTER_7;

import CHAPTER_7.exercise.SortArray;

public class BinarySearch {
    /**
     * Use binary search to find the key in the list
     */
    public static void main(String[] args) {
        int[] array = {3,3,4,6,2,8,9};
        int[] sorted = SortArray.bubbleSortingAscending(array); //Binary search works only with a sorted array
        int result = binarySearch(sorted,9);
        System.out.println(result);
    }
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -1; // Now high < low, key not found
    }
}
