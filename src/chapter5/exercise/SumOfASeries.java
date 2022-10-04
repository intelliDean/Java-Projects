package chapter5.exercise;

public class SumOfASeries {
    /*(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?*/
    public static void seriesSum() {
        long total = 1;
        System.out.printf("%n%4s%7s%n", "nth", "sum");
        for (int i = 1; i <= 100; i++) {
            total *= i;
            System.out.printf("%3d%7d%n", i, total);
        }
    }

    public static void main(String[] args) {
        seriesSum();
        //If it were a product instead of a sum, it would exceed the capacity of long.
    }
}
