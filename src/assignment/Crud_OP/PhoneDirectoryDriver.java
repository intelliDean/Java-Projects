package assignment.Crud_OP;

import java.util.Scanner;

public class PhoneDirectoryDriver {
    private static final Directory directory = new Directory();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            print("""
                    Welcome to Phone book

                    1 - View all contacts
                    2 - Create new contact

                    0 - Quit
                    """);
            String res = in.nextLine();

            if (res.trim().equals("0")) {
                System.exit(0);
            }

            switch (res) {
                case "1" -> {
                    while (true) {
                        if (contact()) break;
                    }
                }
                case "2" -> {
                    saveInfo();
                }
            }
        }

    }

    private static boolean contact() {
        displayPhoneBook();
        try {
            System.out.println("Enter contact ID to view or -1 to go back");
            int contactId = Integer.parseInt(in.next());
            in.nextLine();

            if (contactId == -1) {
                return true;
            } else {
                int editOption = -2;
                while (editOption != -1 && editOption != 99) {

                    editOption = displayUpdate(contactId);
                }
            }
        } catch (ContactNotFoundException e) {
            System.out.println("\n ❌ " + e.getMessage() + " ❌ \n");
        }
        return false;
    }

    private static int displayUpdate(int contactId) {
        int editOption;
        Contact contact = directory.getContactById(contactId);
        displayContact(contact);

        print("""
                <-- Edit -->
                1 -> Address
                2 -> Telephone
                3 -> Email

                99 to delete contact
                -1 to Quit
                """);

        editOption = Integer.parseInt(in.next());

        updateContact(contactId, editOption);
        return editOption;
    }

    private static void updateContact(int contactId, int editOption) {
        switch (editOption) {
            case 1 -> {
                saveAddress(contactId);
            }
            case 2 -> {
                savePhoneNumber(contactId);
            }
            case 3 -> {
                saveEmail(contactId);
            }
            case 99 -> {
                directory.deleteContact(contactId);
                System.out.println("\n ✅ Deleted successfully\n\n");
            }
        }
    }

    private static void saveInfo() {
        String firstName = input("Enter First Name");
        String lastName = input("Enter Last Name");
        String houseNumber = input("Enter House Number");
        String streetName = input("Enter Street name");
        String city = input("Enter City");
        String state = input("Enter State");
        String country = input("Enter Country");
        String phoneNumber = input("Enter Phone number");
        String email = input("Enter Email address");

        Contact newContact = new Contact(firstName, lastName,
                new Address(houseNumber, streetName, city, state, country),
                phoneNumber, email);
        directory.addContact(newContact);
        directory.addContact(newContact);

        System.out.println("\n ✅ Added successfully!");
    }

    private static void saveEmail(int contactId) {
        String email = input("Enter the new Email: ");

        directory.editContactEmail(contactId, email);
        System.out.println("\n ✅ Updated successfully\n");
    }

    private static void savePhoneNumber(int contactId) {
        String phoneNumber = input("Enter new phone number: ");

        directory.editContactTelephone(contactId, phoneNumber);
        System.out.println("\n ✅ Updated successfully\n");
    }

    private static String input(String prompt) {
        print(prompt);
        return in.nextLine();
        //return JOptionPane.showInputDialog(null, prompt);
    }

    private static void print(String prompt) {
        System.out.println(prompt);
        //JOptionPane.showMessageDialog(null, prompt);
    }

    private static void saveAddress(int contactId) {
        String streetName = input("Enter Street name: ");
        String city = input("Enter City name: ");
        String country = input("Enter Country: ");

        Address address = new Address(streetName, city, country);
        directory.editContactAddress(contactId, address);

        System.out.println("\n ✅ Updated successfully\n");
    }

    public static void displayPhoneBook() {
        System.out.println("================ Phone book ================\n<-- All Contacts -->");
        if (directory.getAllContacts().size() == 0) {
            System.out.println("\n# No Contacts #\n");
        } else {
            for (Contact contact : directory.getAllContacts()) {
                displayContact(contact);
            }
        }
    }

    private static void displayContact(Contact contact) {
        System.out.println("-".repeat(40));
        System.out.printf("""
                        id: %-10d
                        Name: %-10s
                        Address: %-10s
                        Mobile: %-10s
                        Email: %-10s
                        """,
                contact.getId(), contact.getFirstName() + " " + contact.getLastName(),
                contact.getAddress(), contact.getTelephone(), contact.getEmail());
        System.out.println("-".repeat(40));
    }
}
