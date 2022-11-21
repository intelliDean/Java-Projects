package Practice;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrays = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Enter valid grades between 0 and 100");
            int grade = input.nextInt();
            if (grade >= 0 && grade <= 100) {
                arrays[i] = grade;
                i++;
            }
        }
        int[] max = maxim(arrays);
        System.out.printf("%nThe maximum is %d and%nthe minimum is %d", max[0], max[1]);
    }
    public static int[] maxim(int[] arrays) {
        int max = arrays[0];
        int min = arrays[0];
        int[] result = new int[2];
        for (int array : arrays) {
            if (array >= 0 && array <= 100) {
            if (array > max) {
                max = array;
            }
            result[0] = max;
            if (array < min) {
                min = array;
            }
            result[1] = min;
        }
        }
        return result;
    }
}
