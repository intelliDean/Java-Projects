package Practice.drivers;

import Practice.CircleWithStatic;
import Practice.ObjectPassing;

public class ObjectPassingDriver {
    public static void main(String[] args) {
        // Create a Circle object with radius 1
        CircleWithStatic myCircle = new CircleWithStatic(1);

        // Print areas for radius 1, 2, 3, 4, and 5.
        int numberOfTimes = 5;
        ObjectPassing.printAreas(myCircle, numberOfTimes);

        // See myCircle.radius and times
        System.out.printf("%n%nRadius is %.2f%n", myCircle.getRadius());
        System.out.printf("%d number of times%n", numberOfTimes);
    }
}
