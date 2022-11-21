package CHAPTER_7.BinarySearch;

public class FloorOfALetter {
    public static void main(String[] args) {
        /* CONDITIONS FOR THIS PARTICULAR PROBLEM
         * 1. the largest letter that is less than the target (the letter exclusive hence not equal to)
         * 2. the letter wraps up, which means if the target is not found in the array, then the first letter is pick*/
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char target = 'c';
        char result = floor(letters, target);
        System.out.println(result);
    }
    public static char floor(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target == letters[start]) {
            return letters[end];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[end - 1];
    }
}
