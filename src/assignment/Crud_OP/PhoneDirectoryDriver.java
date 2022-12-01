package assignment.Crud_OP;

import java.util.Scanner;

public class PhoneDirectoryDriver {
    private static final Directory directory = new Directory();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("""
                    Welcome to Phone book

                    1 - View all contacts
                    2 - Create new contact

                    0 - Quit
                    """);
            String res = input.nextLine();

            if (res.trim().equals("0")) {
                break;
            }

            switch (res) {
                case "1" -> {
                    while (true) {
                        displayPhoneBook();
                        try {
                            System.out.println("Enter contact ID to view or -1 to go back");
                            int contactId = Integer.parseInt(input.next());
                            input.nextLine();

                            if (contactId == -1) {
                                break;
                            } else {
                                int editOption = -2;
                                while (editOption != -1 && editOption != 99) {

                                    Contact contact = directory.getContactById(contactId);
                                    displayContact(contact);

                                    System.out.println("""
                                            <-- Edit -->
                                            1 -> Address
                                            2 -> Telephone
                                            3 -> Email

                                            99 to delete contact
                                            -1 to Quit
                                            """);

                                    editOption = Integer.parseInt(input.next());

                                    switch (editOption) {
//                                        case 1 -> {
//                                            System.out.print("Enter new name: ");
//                                            String newName = input.nextLine();
//
//                                            directory.editContactName(contactId, newName);
//                                            System.out.println("\n ✅ Updated successfully\n");
//                                        }
                                        case 1 -> {
                                            System.out.print("Enter Street name: ");
                                            String streetName = input.nextLine();

                                            System.out.print("Enter City name: ");
                                            String city = input.nextLine();

                                            System.out.print("Enter Country: ");
                                            String country = input.nextLine();

                                            Address address = new Address(streetName, city, country);
                                            directory.editContactAddress(contactId, address);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 2 -> {
                                            System.out.print("Enter new phone number: ");
                                            String phoneNumber = input.nextLine();

                                            directory.editContactTelephone(contactId, phoneNumber);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 3 -> {
                                            System.out.print("Enter the new Email: ");
                                            String email = input.nextLine();

                                            directory.editContactEmail(contactId, email);
                                            System.out.println("\n ✅ Updated successfully\n");
                                        }
                                        case 99 -> {
                                            directory.deleteContact(contactId);
                                            System.out.println("\n ✅ Deleted successfully\n\n");
                                        }
                                    }
                                }
                            }
                        } catch (ContactNotFoundException e) {
                            System.out.println("\n ❌ " + e.getMessage() + " ❌ \n");
                        }
                    }
                }
                case "2" -> {

                    System.out.println("Enter First Name");
                    String firstName = input.nextLine();

                    System.out.println("Enter Last Name");
                    String lastName = input.nextLine();

                    System.out.println("Enter House Number");
                    String houseNumber = input.nextLine();

                    System.out.println("Enter Street name");
                    String streetName = input.nextLine();

                    System.out.println("Enter City");
                    String city = input.nextLine();

                    System.out.println("Enter State");
                    String state = input.nextLine();

                    System.out.println("Enter Country");
                    String country = input.nextLine();

                    System.out.println("Enter Phone number");
                    String phoneNumber = input.nextLine();

                    System.out.println("Enter Email address");
                    String email = input.nextLine();

                    Contact newContact = new Contact(firstName, lastName,
                            new Address(houseNumber, streetName, city, state, country),
                            phoneNumber, email);
                    directory.addContact(newContact);
                    directory.addContact(newContact);

                    System.out.println("\n ✅ Added successfully!");
                }
            }
        }

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
