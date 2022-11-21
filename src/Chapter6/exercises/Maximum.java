package Chapter6.exercises;

import static CHAPTER_4.exercise.LargestNumber.input; //Scanner was declared static in the class LargestNumber, hence it's available to be imported into this class as Scanner. No need to import and create another Scanner object

public class Maximum {

    // returns the maximum of its three double parameters
    public static double toDetermineTheMaximumNumber(double x, double y, double z) {
            double maximumValue = x; // assume x is the largest to start
            // determine whether y is greater than maximumValue
            if (y > maximumValue) {
                maximumValue = y;
            }
            // determine whether z is greater than maximumValue
            if (z > maximumValue) {
                maximumValue = z;
            }
            return maximumValue;
    }


    public static void main(String [] args) {
         // prompt for and input three floating-point values
         System.out.println("Enter three floating-point values separated by spaces");
         double number1 = input.nextDouble(); // read first double
         double number2 = input.nextDouble(); // read second double
         double number3 = input.nextDouble(); // read third double

         // determine the maximum value
        double result = toDetermineTheMaximumNumber(number1, number2, number3);
        // display maximum value
        System.out.println("Maximum is: " + result);
    }
}
