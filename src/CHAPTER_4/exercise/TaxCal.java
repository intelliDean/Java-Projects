package CHAPTER_4.exercise;

import java.security.SecureRandom;
import java.util.Scanner;

public class TaxCal {
    static Scanner input = new Scanner(System.in);
    private static final SecureRandom wages = new SecureRandom();
    /*(Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display
the citizen’s total tax. Use class Scanner to input the data.*/
    public static void tax() {
        int i = 1;
        double tax = 0;
        String name = " ";
        while (i <= 3) {
        System.out.println("\nEnter name");
        name = input.nextLine();

        double salary = 10000 * (1 + wages.nextDouble(9));

        if (salary <= 30000) {
            tax = salary * 0.15;
        } else {
            tax = salary * 0.2;
        }
            System.out.printf("%n%s: %s%n%s: ₦%,.2f%n%s: ₦%,.2f%n", "Name", name, "salary", salary, "Tax", tax);
        i++;
        }
    }

    public static void main(String[] args) {
        tax();
    }
}
