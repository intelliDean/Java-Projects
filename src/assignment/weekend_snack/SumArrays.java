package assignment.weekend_snack;

public class SumArrays {
    public static void main(String[] args) {
        int[] rays = {1,2,3,4, 5,6,7,8,9,10};
        int result = add_(rays);
        System.out.println(result);
    }
    public static int add(int[] arrays) {
        int total = 0;
        for (int rays : arrays) {
            total += rays;
        }
        return total;
    }
    public static int add_(int[] arrays) {
        int count = 0;
        int total = 0;
        while (count < arrays.length) {
            total += arrays[count];
            count++;
        }
        return total;
    }
    public static int addSum(int[] arrays) {
        int count = 0;
        int total = 0;
        do{
            total += arrays[count];
            count++;
        } while(count < arrays.length);
        return total;
    }
}
