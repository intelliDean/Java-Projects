package chapter8;

import Practice.CircleWithStatic;

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Declare circleArray
        CircleWithStatic[] circleArray = createCircleArray();

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /**
     * Create an array of Circle objects
     */
    public static CircleWithStatic[] createCircleArray() {
        CircleWithStatic[] circleArray = new CircleWithStatic[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithStatic(Math.random() * 100); //This creates all objects of CircleWithStatic
        }

        // Return Circle array
        return circleArray;
    }

    /**
     * Print an array of circles and their total area
     */
    public static void printCircleArray(CircleWithStatic[] circleArray) {
        System.out.printf("%-30s%-15s%n", "Radius", "Area");
        for (CircleWithStatic circle : circleArray) {
            System.out.printf("%-30.2f%,-15.2f%n", circle.getRadius(), circle.getArea());
        }

        // Compute and display the result
        System.out.printf("%s%n%-30s%,-15.2f%n", "——————————————————————————————————————-",
                "The total area of circles is", sumOfArea(circleArray));
    }

    public static double sumOfArea(CircleWithStatic[] circleArray) {
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (CircleWithStatic circle : circleArray) {
            sum += circle.getArea();
        }
        return sum;
    }
}
