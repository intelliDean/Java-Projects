package chapter02;

public class Arithmetic {

    public String squareTwoNumbers(int a, int b) {
        int c = a * a;
        int d = b * b;
        return c+":"+d;
    }

    public int sumSquare(int a, int b) {
        return (a * a + b * b);
    }

    public int squareDifferences(int a, int b) {
        return (a * a - b * b);
    }
}
