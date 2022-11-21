package Practice;

import java.security.SecureRandom;

public class ArrayObject {
         /** Create an array of Circle objects */
    public static CircleWithStatic[] createCircleArray() {
            SecureRandom rand = new SecureRandom();
         CircleWithStatic[] circleArray = new CircleWithStatic[5];

         for (int i = 0; i < circleArray.length; i++) {
             circleArray[i] = new CircleWithStatic(1 + rand.nextInt(9));
         }

         // Return Circle array
         return circleArray;
    }

         /** Print an array of circles and their total area */
    public static void printCircleArray(CircleWithStatic[] arrayCircle) {
         System.out.printf("%-20s%-10s%n", "Radius", "Area");

         for (int i = 0; i < arrayCircle.length; i++) {
             System.out.printf("%-20.2f%-15.2f\n", arrayCircle[i].getRadius(),
                     arrayCircle[i].getArea());
         }

         System.out.println("—————————————————————————————————————————-");

         // Compute and display the result
         System.out.printf("%-30s%-15.2f%n", "The total area of circles is",
                 sumArray(arrayCircle) );
    }

    /** Add circle areas */
    public static double sumArray(CircleWithStatic[] circleArray) {
         // Initialize sum
         double sum = 0;

         // Add areas to sum
         for (int i = 0; i < circleArray.length; i++)
             sum += circleArray[i].getArea();

         return sum;
    }
}
