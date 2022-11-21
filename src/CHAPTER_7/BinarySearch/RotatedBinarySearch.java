package CHAPTER_7.BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arrays = {2,3,4,5,6,7,1,3,5};
        int target  = 3;
        int result = rotatedSearch(arrays, target);
        System.out.println(result);
    }
    public static int rotatedSearch(int[] arrays, int target) {
        int pivot = findPivot(arrays);
        //if pivot not found, it means the array is not rotated array
        if (pivot == -1) {
            //do normal binary search
            return ArrayBinarySearch.binarySearch(arrays, target, arrays.length - 1);
        }
        //if pivot found, that means there are 2 ascending arrays
        if (arrays[pivot] == target) {
            return pivot;
        }
        if (target>= arrays[0]) {
            return ArrayBinarySearch.binarySearch(arrays, target, pivot - 1);
        }
        return ArrayBinarySearch.binarySearch(arrays, target, pivot + 1,arrays.length - 1);
    }
    public static int findPivot(int[] arrays) {
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arrays[mid] > arrays[mid + 1]) {
                return mid;
            }
            if (mid > start && arrays[mid] < arrays[mid - 1]) {
                return mid - 1;
            }
            if (arrays[mid] <= arrays[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
