package assignment.weekend_snack;

public class ContainInArray {
    public static void main(String[] args) {
        boolean ans = contain(28);
        System.out.println(ans);
    }

    public static boolean contain(int guess) {
        int[] arrays = {28, 45, 89, 76, 29};
        boolean result = false;
        for (int array : arrays) {
            if (guess == array) {
                result = true;
                break;
            }
        }
        return result;
    }
}
