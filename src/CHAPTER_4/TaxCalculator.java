package CHAPTER_4;

import java.util.Scanner;

public class TaxCalculator {
    /*(Tax Calculator) Develop a Java application that determines the total tax for each of three
citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
a given year. Your program should input this information for each citizen, then determine and display
the citizen’s total tax. Use class Scanner to input the data.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            System.out.println("Enter name");
            String name1 = input.nextLine();
            System.out.println("Enter earning");
            int earn1 = input.nextInt();
        }
    }
}
