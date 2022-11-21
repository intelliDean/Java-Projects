package Practice;

import java.util.Scanner;

public class EstimatedPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth number");
        int result = input.nextInt();
        estimatedPi(result);
    }
    public static void estimatedPi(int nthNumber) {
        double divTotal = 0;
        if (nthNumber > 1) {
            System.out.printf("%n%-12s%-12s%n%s", "i", "m(i)", "_________________");

            for (int i = 1; i <= nthNumber ; i+= 2) {
                divTotal += 4 * (1 / i);
                System.out.printf("%n%-12d%-12.2f", i, divTotal);
            }
        }
    }
}
