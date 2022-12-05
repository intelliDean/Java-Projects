package MyReusableCodes;

import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        int target = 100;
        System.out.printf("%d! is %n %,d", target, factorial(target));
    }

    public static BigInteger factorial(long n) {
        if (n == 0) {
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
    public static BigInteger factorial(int start, int end) {
        if (end == 0) {
            return BigInteger.valueOf(-1);
        }
        BigInteger result = BigInteger.ONE;
        for (int i = start; i <= end; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
