package assignment;

import java.util.Scanner;

//Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print
// the combined miles per gallon obtained for all trips up to this point
//All averaging calculations should
//produce floating-point results
public class Miles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        double totalMiles = 0;
        double totalGallon = 0;



        for (int i = 1; i > 0; i++){
            System.out.println("Enter miles travelled : ");
            double miles = input.nextDouble();
            totalMiles += miles;

            System.out.println("\nEnter gallons used: ");
            double gallons= input.nextDouble();
            totalGallon += gallons;
            System.out.printf("%n%s%n%s%n","Press 1 to continue", "or any number to terminate");
            int reply = input.nextInt();
            if (reply == 1) {
                i++;
            } else break;
            double average = totalMiles/totalGallon;
            System.out.printf("%nMiles per gallons for last trip = %.2f%n%n",average);

       }
        double average = totalMiles/totalGallon;
        System.out.printf("%nTotal Miles per gallons = %.2f%n%n", average);
        }
    }