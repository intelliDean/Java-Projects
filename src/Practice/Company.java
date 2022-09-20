package Practice;

import java.util.Scanner;
/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
public class Company {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input salary");
        double salary = input.nextDouble();
        System.out.println("Input year");
        int year = input.nextInt();

        double a = 0;
        if (year > 5) {
             a = 0;
            a =  salary + (salary * 0.05);
            System.out.println("Your salary is "+ a);
        } else {
            a =  salary;
            System.out.println("Your salary is "+ a);
        }
    }
}
