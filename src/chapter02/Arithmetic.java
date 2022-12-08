package chapter02;

public class Arithmetic {

    public static String squareTwoNumbers(int a, int b) {
        int c = a * a;
        int d = b * b;
        return c+":"+d;
    }

    public static int sumSquare(int a, int b) {
        return (a * a + b * b);
    }

    public static int squareDifferences(int a, int b) {
        return (a * a - b * b);
    }
}