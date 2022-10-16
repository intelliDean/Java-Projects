package assignment.drivers;

import assignment.OverloadedSumMethod;

public class OverloadedSumMethodDriver {
    public static void main(String[] args) {

        System.out.printf("%n%d + %d = %d",9, 4, OverloadedSumMethod.sum(9, 4));
        System.out.printf("%n%d + %.2f = %.2f",6, 2.0, OverloadedSumMethod.sum(6, 2.0));
        System.out.printf("%n%.2f + %d = %.2f",5.0, 5, OverloadedSumMethod.sum(5.0, 5));
        System.out.printf("%n%.2f + %.2f = %.2f",9.0, 4.8, OverloadedSumMethod.sum(9.0, 4.8));
    }
}
