package chapter12.Polymophism.Interfaces;

import Chapter11.Inheritance.Geometry.Rectangle;

import java.lang.Comparable;

public class ComparableRectangles extends Rectangle implements Comparable<ComparableRectangles> {

    //Construct a ComparableRectangle with specified properties
    public ComparableRectangles(double width, double height) {
        super(width, height);
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(ComparableRectangles object) {
        if (getArea() > object.getArea()) {
            return 1;
        } else if (getArea() < object.getArea()) {
            return -1;
        } else return 0;
    }

    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return String.format("%s%n%s%.2f",super.toString(), "Area: ", getArea());
    }

    public static void main(String[] args) {
        ComparableRectangles[] rectangles = {
                new ComparableRectangles(3.4, 5.4),
                new ComparableRectangles(13.24, 55.4),
                new ComparableRectangles(7.4, 35.4),
                new ComparableRectangles(1.4, 25.4)};

        java.util.Arrays.sort(rectangles);

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle + " ");
            System.out.println();
        }
    }
}