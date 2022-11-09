package CHAPTER_7.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        //Find the ceiling of a target
        //ceiling is the smallest number that is greater or equals to the target
        int[] arrays = {2,4,6,8,10,12,14,16,18,20};
        int ceiling = ceiling(arrays, 25);
        System.out.println(ceiling);
    }
    public static int ceiling(int[] arrays, int target) {
        if (target > arrays[arrays.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrays[mid]) {
                end = mid - 1;
            } else if (target > arrays[mid]) {
                start = mid + 1;
            } else {
                return arrays[mid];     //this will find the target in the array
            }
        }
        return arrays[start];       //this will find the smallest number that is greater than the target
    }
}
