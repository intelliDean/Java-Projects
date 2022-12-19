package chapter15.account_file;

import javax.xml.bind.JAXB;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateAccount {
    public static void main(String[] args) {
        // open clients.xml, write objects to it then close file

        try (BufferedWriter output = Files.newBufferedWriter(Paths.get("clients.xml"))) {

            Scanner input = new Scanner(System.in);

            // stores the Accounts before XML serialization
            AccountXMLs accounts = new AccountXMLs();

            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");

            while (input.hasNext()) { // loop until end-of-file indicator
                try {
                    // create new record
                    AccountXML record = new AccountXML(
                            input.nextInt(), input.next(), input.next(), input.nextDouble());

                    // add to AccountList
                    accounts.getAccounts().add(record);
                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }

                System.out.print("? ");
            }

            // write AccountList's XML to output
            JAXB.marshal(accounts, output);
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
        }
    }
}