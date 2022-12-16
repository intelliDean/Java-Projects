package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HasNextInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String name;
        String address;
        System.out.print("""
                age and name
                ->\s""");
        while (input.hasNext()) {
            
            try {
                age = input.nextInt();
                name = input.next();
                // TODO: 16-Dec-22  
            } catch (InputMismatchException ex) {
                System.err.println("Invalid input. enter a number");
                input.nextLine();
            }
            System.out.print("-> ");
        }

    }
}
