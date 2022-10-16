package Practice.drivers;

import Practice.ArrayObject;
import Practice.CircleWithStatic;

public class ArrayObjectDriver {
    public static void main(String[] args) {
        // Declare circleArray
        CircleWithStatic[] circleArray;

        // Create circleArray
        circleArray = ArrayObject.createCircleArray();

        // Print circleArray and total areas of the circles
        ArrayObject.printCircleArray(circleArray);
    }
}
