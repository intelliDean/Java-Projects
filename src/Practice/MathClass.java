package Practice;

public class MathClass {
    public static void main(String[] args) {

        mathClass();
    }
    public static void mathClass() {
        for (int i = 0; i <= 500; i++) {
            System.out.println('A' + Math.random() * ('Z' - 'A' + 1));  //Math.random returns a decimal number less than 1
        }
    }
}
