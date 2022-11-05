package MyReusableCodes;

public class SumArrays {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 8, 9, 12, 45, 89, 65, 35, 28, 89, 90, 76};

        int result = sumArray(numbers);
        System.out.println(result);
    }
    public static int sumArray(int[] arrays) {
        if (arrays.length <= 1) {
            return -1;
        }
        int total = 0;
        for (int element : arrays) {
            total += element;
        }
        return total;
    }
}
