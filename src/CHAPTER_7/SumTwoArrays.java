package CHAPTER_7;

import java.util.Arrays;

public class SumTwoArrays {
    public static void main(String[] args) {
        int[] arrays = {2,7,11,13};
        int[] ans = twoArraySum(arrays, 9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arrays = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arrays[0] = i;
                    arrays[1] = j;
                }
            }
        }
        return arrays;
    }
    public static int[] twoArraySum(int[] nums, int target) {
        int[] arrays = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    arrays[0] = i;
                    arrays[1] = j;
                }
            }
        }
        return arrays;
    }
}
