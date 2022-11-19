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
    public CircleWithStatic(double newRadius) throws IllegalArgumentException {
        validateRadius(newRadius);
         radius = newRadius;
        myNumber = ++numberOfObjects;    //numberOfObjects increases by 1 every time the constructor is called

    }
    private void validateRadius(double radius) throws IllegalArgumentException{
        boolean isInvalid = radius < 0;
        if (isInvalid) throw new IllegalArgumentException("Invalid radius");
    }

    public void setRadius(double radius) {
        validateRadius(radius);
        this.radius = radius;
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
