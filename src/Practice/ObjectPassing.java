package Practice;

public class ObjectPassing {
         /** Print a table of areas for radius */
    public static void printAreas(CircleWithStatic smallCircle, int times) {
        System.out.printf("%n%s%8s", "Radius", "Area");
        while (times >= 1) {
            System.out.printf("%n%5.1f%10.2f",smallCircle.getRadius(), smallCircle.getArea());

            smallCircle.setRadius(smallCircle.getRadius() + 1);
            times--;
        }
    }
}
