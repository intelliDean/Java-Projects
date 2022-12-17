package chapter15.balance;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditEnquiry {
    private static Scanner input = new Scanner(System.in);
    private final static BalanceType[] choices = BalanceType.values();

    public static void main(String[] args) {

        // get user's request (e.g., zero, credit or debit balance)
        BalanceType accountType = getRequest();

        while (accountType != BalanceType.END) {
            switch (accountType) {
                case ZERO_BALANCE -> System.out.printf("%nAccounts with zero balances:%n");
                case CREDIT_BALANCE -> System.out.printf("%nAccounts with credit balances:%n");
                case DEBIT_BALANCE -> System.out.printf("%nAccounts with debit balances:%n");
            }

            readRecords(accountType);
            accountType = getRequest(); // get user's request
        }
    }

    // obtain request from user
    private static BalanceType getRequest() {
        int request = 4;

        // display request options
        System.out.println("""
                
                1 - Accounts with zero balances
                2 - Accounts with credit balances
                3 - Accounts with debit balances
                4 - Exit
                """);
        while (request == 4) {
            try {

                do { // input user request
                    System.out.printf("%n? ");
                    request = input.nextInt();
                } while ((request < 1) || (request > 4));

            } catch (NoSuchElementException noSuchElementException) {
                System.err.println("Invalid input. Enter number.");
                input.nextLine();
            }
        }

        return choices[request - 1]; // return enum value for option
    }

    private static void readRecords(BalanceType accountType) {
        // open file and process contents
        try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.printf("%-7s%-13s%-15s%-15s%n", "A/c", "First Name", "Last name", "Balance");
            while (input.hasNext()) { // more data to read
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                // if proper account type, display record
                if (shouldDisplay(accountType, balance)) {
                    System.out.printf("%-10d%-12s%-12s%10.2f%n", accountNumber, firstName, lastName, balance);
                } else {
                    input.nextLine(); // discard the rest of the current record
                }
            }
        } catch (NoSuchElementException | IllegalStateException | IOException e) {
            System.err.println("Error processing file. Terminating.");
            System.exit(1);
        }
    }

    // use record type to determine if record should be displayed
    private static boolean shouldDisplay(BalanceType option, double balance) {

        if ((option == BalanceType.CREDIT_BALANCE) && (balance < 0)) {
            return true;
        } else if ((option == BalanceType.DEBIT_BALANCE) && (balance > 0)) {
            return true;
        } else return (option == BalanceType.ZERO_BALANCE) && (balance == 0);
    }
}