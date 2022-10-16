package Practice;

public class PassingObjectIntoMethod {
    public static void printCircle(CircleWithStatic smallCircle) {
         System.out.printf(
                 "%nThe area of the circle of radius %.1f is %.2f%nObject Number: %d%n",
                 smallCircle.getRadius(), smallCircle.getArea(), smallCircle.getMyNumber()
         );
    }
}
