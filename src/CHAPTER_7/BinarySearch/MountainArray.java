package CHAPTER_7.BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,3,1};
        int target = 6;
        int result = search(arrays, target);
        System.out.println(result);
    }
    public static int search(int[] arrays, int target) {
        //this gets you the peak (the highest number) in the array
        int peak = MountainPeakSearch.mountainPeak(arrays);
        // if the target is less than the peak, it searches the left hand of the array and if found, it is returned
        int firstTry = OrderAgnosticBinarySearch.orderAgnosticBS(arrays, target, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //if the target is not in the left hand of the array, it searches the right hand of the array and if found it's returned else -1 is returned
        return OrderAgnosticBinarySearch.orderAgnosticBS(arrays, target, peak + 1, arrays.length - 1);
    }
}