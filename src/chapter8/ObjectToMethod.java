package chapter8;

import Practice.CircleWithStatic;

public class ObjectToMethod {
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithStatic myCircle = new CircleWithStatic(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(myCircle, n);

        // See myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    /**
     * Print a table of areas for radius
     */
    public static void printAreas(CircleWithStatic circle, int times) {
        System.out.printf("%n%-13s%-15s","Radius", "Area");
        while (times >= 1) {
            System.out.printf("%n%-12.2f%-30f",circle.getRadius(), circle.getArea());
            circle.setRadius(circle.getRadius() + 1); //this increment the radius for every loop
            times--;
        }
    }
}
