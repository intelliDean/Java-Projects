package CHAPTER_7.BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        //Find the floor of a target
        //ceiling is the greatest number that is less or equals to the target
        int[] arrays = {2,4,6,8,10,12,14,16,18,20};
        int floor = floor(arrays, 1);
        System.out.println(floor);
    }
    public static int floor(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        if (target < arrays[start]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            }
            else {
                return arrays[mid];
            }
        }
        return arrays[end];
    }
}
