package CHAPTER_7.BinarySearch;

import MyReusableCodes.SortArrays;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arrays = {23, 5, 42, 53, 23, 12, 87, 90};

        int[] sorted = SortArrays.sortedAscending(arrays);
        System.out.println(Arrays.toString(sorted));

        int search = binarySearch(sorted, 532);
        System.out.println(search);
    }

    public static int binarySearch(int[] arrays, int target) {
        // BINARY SEARCH ONLY WORK WITH A SORTED ARRAY
        if (arrays.length == 0) {
            return -1;
        }
        int start = 0;                      //start of the index
        int end = arrays.length - 1;        //end of the index
        while (start <= end) {          //the condition for the loop is as long as the start is less or equal to end
            int mid = start + (end - start) / 2; //mid is when the array is divided into 2. (end - start) is a way to avoid going out of int range
            if (target < arrays[mid]) {     //compare the target with the element at index mix
                end = mid - 1;              //if the element at index mid < target, the target will be on the left side of the mid hence end will be (mid -1) - start remains the same
            } else if (target > arrays[mid]) {
                start = mid + 1;            //if the element at index mid > target, the target will be on the right side of the mid hence start will be (mid + 1) - end remains the same
            } else {
                return mid;                 //if the element at index mid == target, then answer is found hence it will exit the while loop
            }
        }
        return -1;          //if the target is not found in the arrays then it will return index -1, which means it is not found
    }

    static int binarySearch(int[] arrays, int target, int start, int end) {
        //the beginning of the target search in the infinite array
        while (target > arrays[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        } //the beginning of the binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arrays, int target, int end) {
        int start = 0;
        //the beginning of the target search in the infinite array
        while (target > arrays[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        } //the beginning of the binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}