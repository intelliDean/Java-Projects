package Practice;

public class Wait {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        int[] rays = {10, 9,8,7,6,5,4,3,2,1};
        System.out.println(bS(arrays, 8));
        System.out.println(orderAgnostic(rays, 8));

    }
    public static int bS(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
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
    public static int orderAgnostic(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
            boolean isAsc = arrays[start] < arrays[end];
            int mid = start + (end - start) / 2;
            if (target == arrays[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arrays[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
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
