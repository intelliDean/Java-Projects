package Practice;

public class CircleWithStatic {
    // The radius of the circle
    private double radius;
    /** The number of objects created */
    private static int numberOfObjects = 0;
    private int myNumber;

     // Construct a circle with radius 1
    public CircleWithStatic() {
        myNumber = ++numberOfObjects; // numberOfObjects increases by 1 every time the constructor is called
    }
         /** Construct a circle with a specified radius */
    public CircleWithStatic(double newRadius) {
         radius = newRadius > 0 ? newRadius : 0;
        myNumber = ++numberOfObjects;    //numberOfObjects increases by 1 every time the constructor is called
    }

    public void setRadius(double radius) {
        this.radius = (radius > 0 ? radius : 0);
    }
    public double getRadius() {
        return radius;
    }

         /** Return numberOfObjects */
    public static int getNumberOfObjects() {
         return numberOfObjects;
    }
    public int getMyNumber() {
        return myNumber;
    }

         /** Return the area of this circle */
    public double getArea() {
         return radius * radius * Math.PI;
    }
}
