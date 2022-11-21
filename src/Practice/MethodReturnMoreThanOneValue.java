package Practice;

import java.util.Arrays;

public class MethodReturnMoreThanOneValue {
    public static void main(String[] args) {
        int[] result = returnMultiple(4,6);
        System.out.println(Arrays.toString(result));
        int num = result[0] + result[2];
        System.out.println(num);

        loop(result[2]);
    }
    public static int[] returnMultiple(int num1, int num2) {
        int total;
        int[] result = new int[4];
        total = num1 + num2;
        result[0] = total;
        total = num2 - num1;
        result[1] = total;
        total = num1 * num2;
        result[2] = total;
        total = num2 / num1;
        result[3] = total;
        return result;
    }
    public static void loop(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i+" ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
