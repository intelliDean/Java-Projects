package Practice;

public class FlexOverloaded {
    public static void main(String[] args) {

        System.out.println(add(8));
    }
    public static int add(int a, int b) { //OVERLOADED METHOD
        return a + b;
    }
    public static double add(double a, int b) { //OVERLOADED METHOD
        double sum = a + b;
        System.out.printf("%.2f + %d = ", a, b);
        return sum;
    }
    public static int add(int a) {  //RECURSION
        int b = a * 12;
       a = a % 5;
       return add(a,b);
    }
}
