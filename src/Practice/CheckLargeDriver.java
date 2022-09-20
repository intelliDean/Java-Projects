package Practice;

public class CheckLargeDriver {
    public static void main(String[] args) {
        CheckLarge great = new CheckLarge();


        System.out.printf("%n%s%d%n","The greatest number is ", great.check(2, 78));
        System.out.println("The greatest number is "+ Math.max(2,78));
    }
}
