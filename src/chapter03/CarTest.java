package chapter03;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car myCar1 = new Car("Benz", "2023", 45000000);
        Car myCar2 = new Car("Range Rover", "2023", 92000000);

        System.out.printf("%n%s%n%s%n%.2f%n", myCar1.getModel(), myCar1.getYear(), myCar1.getPrice());
        System.out.printf("%n%s%n%s%n%.2f%n", myCar2.getModel(), myCar2.getYear(), myCar2.getPrice());

        myCar1.discount(5);
        myCar2.discount(7);

        System.out.printf("%n%s%n%s%n%.2f%n%.2f%n", myCar1.getModel(), myCar1.getYear(), myCar1.getPrice(), myCar1.discount(5));
        System.out.printf("%n%s%n%s%n%.2f%n%.2f%n", myCar2.getModel(), myCar2.getYear(), myCar2.getPrice(), myCar2.discount(7));

        System.out.println("Enter model");
        String model1 = input.nextLine();
        myCar1.setModel(model1);

        System.out.println("Input year");
        String year = input.nextLine();
        myCar1.setYear(year);

        System.out.println("Input price");
        double price = input.nextDouble();
        myCar1.setPrice(price);

        System.out.printf("%n%s%n%s%n%.2f%n%.2f%n", myCar1.getModel(), myCar1.getYear(), myCar1.getPrice(), myCar1.discount(16));
        System.out.printf("%n%s%n%s%n%.2f%n%.2f%n", myCar2.getModel(), myCar2.getYear(), myCar2.getPrice(), myCar2.discount(7));

    }
}
