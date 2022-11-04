package CHAPTER_7;

public class SumTwoLargestNumber {
    public static void main(String[] args) {
        int[] rays = {8,4,7,3,5,2};
        int arr = twoLargest(rays);
        System.out.println(arr);
    }
    public static int twoLargest(int[] arrays) {
        SwapArray.swapArray(arrays);
        return arrays[arrays.length - 1] + arrays[arrays.length - 2];
    }
}
