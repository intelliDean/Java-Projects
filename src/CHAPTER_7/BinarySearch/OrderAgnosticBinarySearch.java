package CHAPTER_7.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arrays =  {2,3,5,6,7,12,23,45,56,67};      //ascending order sorted arrays
        int[] rays = {65,56,48,39,34,23,12,5};          //descending order sorted arrays

        int result = orderAgnosticBS(rays, 23);
        System.out.println(result);
    }
    //Overloaded method
    public static int orderAgnosticBS(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arrays[start] < arrays[end];
            if (target == arrays[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    //Overloaded method
    public static int orderAgnosticBS(int[] arrays, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arrays[start] < arrays[end];
            if (target == arrays[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    //Overloaded method
    public static int orderAgnosticBS(int[] arrays, int target, int end) {
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            boolean isAsc = arrays[start] < arrays[end];
            if (target == arrays[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
