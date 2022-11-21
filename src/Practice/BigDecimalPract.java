package Practice;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.text.NumberFormat;
import java.util.Arrays;

public class BigDecimalPract {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        BigDecimal[] arrays = new BigDecimal[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = BigDecimal.valueOf(1 + rand.nextInt(100));
        }
        System.out.println(Arrays.toString(arrays)+"\n");

        BigDecimal result = divideTwoNumbers(840.2, 8);
        System.out.println(NumberFormat.getNumberInstance().format(result));
    }
    public static BigDecimal sumTwoNumbers(int num1, int num2) {
        return BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2));
    }
    public static BigDecimal sumTwoNumbers(double num1, int num2) {
        return BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2));
    }
    public static BigDecimal sumTwoNumbers(double num1, double num2) {
        return BigDecimal.valueOf(num1).add(BigDecimal.valueOf(num2));
    }
    public static BigDecimal subtractTwoNumbers(int num1, int num2) {
        return BigDecimal.valueOf(num2).subtract(BigDecimal.valueOf(num1));
    }
    public static BigDecimal subtractTwoNumbers(double num1, int num2) {
        return BigDecimal.valueOf(num2).subtract(BigDecimal.valueOf(num1));
    }
    public static BigDecimal subtractTwoNumbers(double num1, double num2) {
        return BigDecimal.valueOf(num2).subtract(BigDecimal.valueOf(num1));
    }
    public static BigDecimal divideTwoNumbers(int num1, int num2) {
        return BigDecimal.valueOf(num1).divide(BigDecimal.valueOf(num2));
    }
    public static BigDecimal divideTwoNumbers(double num1, int num2) {
        return BigDecimal.valueOf(num1).divide(BigDecimal.valueOf(num2));
    }
    public static BigDecimal divideTwoNumbers(double num1, double num2) {
        return BigDecimal.valueOf(num1).divide(BigDecimal.valueOf(num2));
    }
    public static BigDecimal multiplyTwoNumbers(int num1, int num2) {
        return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2));
    }
    public static BigDecimal multiplyTwoNumbers(double num1, int num2) {
        return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2));
    }
    public static BigDecimal multiplyTwoNumbers(double num1, double num2) {
        return BigDecimal.valueOf(num1).multiply(BigDecimal.valueOf(num2));
    }

}
