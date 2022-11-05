package CHAPTER_7;

public class LinearSearchArrays {
    public static void main(String[] args) {
        int[] arrays = {8, 34, 23, 90, 23, 75, 45};
        int target = 8;
        int result = linearSearch(arrays, target,2,6);
        System.out.println(result);
    }
    public static int linearSearch(int[] arrays, int target) {
        if (arrays.length == 0) {
            return -1;
        }
        for (int i = 0; i < arrays.length; i++) {
            int found = arrays[i];
            if (found == target) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arrays, int target, int start, int finish) {
        if (arrays.length == 0) {
            return -1;
        }
        for (int i = start; i < finish; i++) {
            int found = arrays[i];
            if (found == target) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchCount(int[] arrays, int target) {
        if (arrays.length == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            int found = arrays[i];
            if (found == target) {
                count++;
            }
        }
        return count;
    }
    public static boolean linearSearchBool(int[] arrays, int target) {
        if (arrays.length == 0) {
            return false;
        }
        for (int found : arrays) {
            if (found == target) {
                return true;
            }
        }
        return false;
    }
}
