package CHAPTER_7.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arrays = {1,2,4,6,8,10,12,14,16,18,20,22,24,27,32,34,37,39,40};
        int target = 32;
        int result = infiniteArraySearch(arrays, target);
        System.out.println(result);
    }

    static int infiniteArraySearch(int[] arrays, int target) {
        //this method search the target in the infinite array
        int start = 0;
        int end = 1;
        while (target >= arrays[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return ArrayBinarySearch.binarySearch(arrays, target, start,  end);
    }
}