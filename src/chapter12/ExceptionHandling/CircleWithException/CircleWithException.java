package chapter12.ExceptionHandling.CircleWithException;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;         //The number of the objects created


    public CircleWithException() {      ///Construct a circle with radius 1
        this(1.0);
    }

    public CircleWithException(double newRadius) {      //Construct a circle with a specified radius
        validateRadius(newRadius);
        this.radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {         // Return radius
        return radius;
    }

    public void setRadius(double newRadius) {       //Set a new radius
        validateRadius(newRadius);
        radius = newRadius;
    }
    private static void validateRadius(double radius) throws IllegalArgumentException {
        boolean invalidRadius = radius < 0;
        if (invalidRadius) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public static int getNumberOfObjects() {        //Return numberOfObjects
        return numberOfObjects;
    }

    public double findArea() {                      //Return the area of this circle
        return radius * radius * 3.14159;
    }
}
