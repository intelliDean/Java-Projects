package chapter5.exercise;

public class DivisibleBy3 {
    /*(Integers Divisible by 3) Write an application that calculates the sum of those integers between
1 and 30 that are divisible by 3.*/
    public static void numbersDivBy3() {
        int total = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                total += i;
                System.out.println(i);
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        numbersDivBy3();
      }
}
