package chapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) {
        // open clients.txt, output data to the file then close clients.txt
        try (Formatter save = new Formatter("clients.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.print("""
                    Enter account number, first name, last name and balance.
                    Enter end-of-file indicator to end input
                    ?\s""");

            while (input.hasNext()) { // loop until end-of-file indicator
                try {
                    // output new record to file; assumes valid input
                    save.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());

                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }
                System.out.print("? ");
            }
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            if (e instanceof SecurityException) {
                System.out.println(((SecurityException) e).getMessage());
                ((SecurityException) e).printStackTrace();
            } else if (e instanceof FileNotFoundException) {
                System.out.println(((FileNotFoundException) e).getMessage());
                ((FileNotFoundException) e).printStackTrace();
            } else {
                System.out.println(((FormatterClosedException) e).getMessage());
                ((FormatterClosedException) e).printStackTrace();
            }
        }
    }
}