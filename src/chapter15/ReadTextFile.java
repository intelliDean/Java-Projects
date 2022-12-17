package chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.printf("%-10s%-12s%-12s%10s%n",
                    "Account", "First Name", "Last Name", "Balance");

            while (input.hasNext()) { // while there is more to read
                // display record contents
                System.out.printf("%-12d%-12s%-13s%-15.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());

            }
        } catch (IOException | NoSuchElementException |
                 IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
