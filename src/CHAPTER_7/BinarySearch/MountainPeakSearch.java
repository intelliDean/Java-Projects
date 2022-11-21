package CHAPTER_7.BinarySearch;

public class MountainPeakSearch {
    public static void main(String[] args) {
        int[] arrays = {12, 34, 56, 67, 78, 90, 65, 54, 32, 21, 3};
        int target = 90;
        int result = mountainPeak(arrays);
        System.out.println(result);
    }
    public static int mountainPeak(int[] arrays) {
        int start = 0;
        int end = arrays.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arrays[mid] > arrays[mid + 1]) {
                end = mid; // descending part. end is not mid - 1 cos mid might be the answer. We look at left still
            } else {
                start = mid + 1; //ascending part. mid + 1 element is greater than element at mid, hence we look at right
            }
        }
        return start; //or end, as both have the same value (point to the same value)
    }
}
