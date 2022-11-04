package CHAPTER_4.exercise;

import java.util.Scanner;

public class GasUsage {
    static Scanner input = new Scanner(System.in);

    /*(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.*/
    public static void gas() {
        int miles, gallons;
        int totalMiles = 0;
        int totalGallons = 0;
        double avg;
        System.out.println("Input the miles used or -1 to quit");
        miles = input.nextInt();
        int quit = miles;
        while (miles != -1) {
            System.out.println("Input the gallons used");
            gallons = input.nextInt();
            avg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip is %n%d / %d = %.2fm/g%n", miles, gallons, avg);
            totalMiles += miles;
            totalGallons += gallons;
            System.out.println("\nInput the miles used or -1 to quit");
            miles = input.nextInt();
        }
        if (quit != -1) {
            System.out.printf("Total miles covered = %d%n while the total gas used = %d%n", totalMiles, totalGallons);
            avg = (double) totalMiles / totalGallons;
            System.out.printf("Total average is %d / %d = %.2fm/g%n", totalMiles, totalGallons, avg);
        } else {
            System.out.println("No input");
        }

    }

    public static void main(String[] args) {
        gas();
    }
}
