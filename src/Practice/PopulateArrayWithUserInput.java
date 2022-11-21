package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArrayWithUserInput {
    public static void main(String[] args) {
        System.out.println("The total is "+enterArray());
    }
    public static int enterArray() {
        Scanner input = new Scanner(System.in);
        int[] ray = new int[10];
        int total = 0;
        System.out.println("Enter "+ray.length+ " values");
        for (int i = 0; i < ray.length; i++) {
            ray[i] = input.nextInt();
            total += ray[i];
        }
        System.out.println(Arrays.toString(ray));
        return  total;
    }
}
