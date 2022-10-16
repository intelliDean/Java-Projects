package assignment;

public class OverloadedSumMethod {
    //METHOD OVERLOADING
    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, int b) {
        return (double) (a + b);
    }
    public static float sum(float a, int b) {
        return (float) (a + b);
    }
    public static double sum(int a, double b) {
        return (double) (a + b);
    }
    public static double sum(float a, double b) {
        return (double) (a + b);
    }
    public static double sum(double a, double b) {
        return (double) (a + b);
    }
}
