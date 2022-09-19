package chapter02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input your weight");
        double weight = input.nextDouble();

        System.out.println("Input your height");
        double height = input.nextDouble();

        double bmi = (weight * 703)/ (height * height);
        System.out.printf("%nYour BMI = %.2f%n", bmi);
    }
}
