package assignment.weekend_snack;

public class Palindromes {
    public static void main(String[] args) {
        int[] rays = {1, 2, 1, 2, 1};
        boolean y = palindrome(rays);
        System.out.println(y);

    }
    public static boolean palindrome(int[] arrays) {
        int[] newArrays = new int[arrays.length];
        for (int i = 0, j = arrays.length - 1; i < arrays.length; i++, j--) {
            newArrays[i] = arrays[j];
        }
        //            System.out.println("true");
        return newArrays == arrays;
    }
}
