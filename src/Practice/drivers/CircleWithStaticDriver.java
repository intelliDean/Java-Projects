package Practice.drivers;

import Practice.CircleWithStatic;

public class CircleWithStaticDriver {
     private String radius;
     private String numberOfObjects;

     /** Main method */
    public static void main(String[] args) {
         System.out.println("Before creating objects");
         System.out.println("The number of Circle objects is "
                 + CircleWithStatic.getNumberOfObjects());

         // Create c1
         CircleWithStatic firstCircle = new CircleWithStatic();

         // Display c1 BEFORE c2 is created
         System.out.println("\nAfter creating c1");
         System.out.printf("firstCircle: radius (%.1f) and number of Circle objects (%d)",
                 firstCircle.getRadius(), CircleWithStatic.getNumberOfObjects());

         // Create c2
         CircleWithStatic secondCircle = new CircleWithStatic(5);

         // Modify c1
         firstCircle.setRadius(9);

         // Display c1 and c2 AFTER c2 was created
         System.out.println("\nAfter creating c2 and modifying c1");
         System.out.println("firstCircle: radius (" + firstCircle.getRadius() + ") " +
                 "and number of Circle objects (" + CircleWithStatic.getNumberOfObjects() + ")");
         System.out.println("secondCircle: radius (" + secondCircle.getRadius() + ") " +
                 "and number of Circle objects (" + CircleWithStatic.getNumberOfObjects() + ")");
         }
}
