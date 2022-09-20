package assignment;

public class AddNumbers {
    //METHOD OVERLOADING
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, int b) {
        return (double) (a + b);
    }
    public float add(float a, int b) {
        return (float) (a + b);
    }
    public double add(int a, double b) {
        return (double) (a + b);
    }
    public double add(float a, double b) {
        return (double) (a + b);
    }
    public double add(double a, double b) {
        return (double) (a + b);
    }

    public static void main(String[] args) {
        AddNumbers two = new AddNumbers();

        System.out.println(two.add(2,6));
    }
}
