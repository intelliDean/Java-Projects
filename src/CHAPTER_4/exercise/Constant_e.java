package CHAPTER_4.exercise;

public class Constant_e {
    /*Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.
e = 1 + (1/1!) + (1/2!) + (1/3!) + (1/4!)*/

    public static void calculate_e(int num) {

        int i = 0;
        int total = 1;
        int fact = 1;
        while (i <= num) {
            fact *= i;
            total = total + (1/fact);
            i++;
            System.out.println(total);
        }
    }

    public static void main(String[] args) {
        calculate_e(5);
    }
}
