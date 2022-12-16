package Practice.Person;

import chapter8.DatePackage.Date;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonMain {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Person dean = new Person();

        System.out.println("""
                Enter name, phone number and date of birth
                """);
        try{
            dean.setName(input.nextLine());
            dean.setPhoneNumber(input.nextLine());
            dean.setDateOfBirth(new Date(input.nextInt(), input.nextInt()));
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(dean);
    }
}
