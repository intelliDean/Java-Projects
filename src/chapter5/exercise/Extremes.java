package chapter5.exercise;

import static CHAPTER_4.exercise.LargestNumber.input;

public class Extremes {
    /*(Extremes) Write an application that finds the minimum and maximum amongst several
integers and then computes the sum of the two extremes. The user will be prompted to input how
many values the application should ask the user to input.*/
    public static void largeNumber() {
        int largest = 0;
        int lowest = 0;
        int counter = 0;
        System.out.println("""
                
                Enter the integer grades in the range 0-100.
                Type the end-of-file indicator to terminate input
                On UNIX/Linux/macOS type <Ctrl> d then press Enter
                On Windows type <Ctrl> z then press Enter.""");
        while (input.hasNext()) {
            int number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
//            if (number < largest){
//                lowest = number;
//            }
            lowest = number;
            if (lowest < largest) {
                lowest = largest;
            }
            counter++;
        }
        System.out.printf("%n%d is the largest of the %d numbers entered%n while %d is the lowest.%nThe sum of both extremes is %d%n", largest, counter, lowest, largest + lowest);
    }

    public static void main(String[] args) {
        largeNumber();
    }
}
