package CHAPTER_7.BinarySearch;

import java.util.Arrays;

public class FirstAndLastIndexOfATarget {
    public static void main(String[] args) {
        int[] arrays = {2, 3, 3, 3, 4, 4, 5, 6, 7, 7, 7, 9, 10, 10};
        int target = 12;
        int[] result = firstAndLastIndex(arrays, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] firstAndLastIndex(int[] arrays, int target) {
        int[] result = {-1, -1};
        result[0] = search(arrays, target, true);
        if (result[0] != -1) {
            result[1] = search(arrays, target, false);
        }

        return result;
    }

    static int search(int[] arrays, int target, boolean firstIndex) {
        int answer = -1;
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            } else {    //if the target is equal to the element at the middle then this condition will execute
                answer = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}
