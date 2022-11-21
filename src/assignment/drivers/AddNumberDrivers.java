package assignment.drivers;

import assignment.AddNumber;

import java.util.Scanner;

public class AddNumberDrivers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("""
                Input numbers or Ctrl d to quit""");
        do {
        num1 = input.nextInt();
        num2 = input.nextInt();
        int value = AddNumber.sum(num1, num2);

        System.out.printf("%d + %d = %,d%n%n",num1, num2, value);
        } while (input.hasNext()); //press ctrl d to terminate the loop
    }
}
