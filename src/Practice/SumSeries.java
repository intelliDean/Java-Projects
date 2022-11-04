package Practice;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth number of times");
        int nth = input.nextInt();
        sumSeries(nth);
    }
    public static void sumSeries(int nthNumber) {
        double div = 0;
        if (nthNumber > 1) {
            System.out.printf("%n%-10s%-10s%n%s", "i", "m(i)", "---------------");
            for (int i = 1; i <= nthNumber; i++) {
                div += (float)i / (i + 1);
                System.out.printf("%n%-10d%-10.2f", i, div);;
            }
        } else {
            System.out.println("invalid nth number.\nEnter nth number above 1");
        }
    }
}
