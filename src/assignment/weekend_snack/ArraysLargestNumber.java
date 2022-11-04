package assignment.weekend_snack;

public class ArraysLargestNumber {
    public static int largestNumber(int[] arrays) {
    int largest = arrays[0];    //assume that arrays[0] is thr largest
        for (int array : arrays) {
            if (array > largest) {
                largest = array;
            }
        }
        return largest;
    }
}
