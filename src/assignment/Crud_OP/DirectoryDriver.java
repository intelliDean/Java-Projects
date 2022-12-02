package assignment.Crud_OP;

import java.util.Scanner;

public class DirectoryDriver {
    private static final Directory directory = new Directory();
    private static Scanner exInput = new Scanner(System.in);

    public static void main(String[] args) {


        String response = input("""
                Welcome to DIS - Dean Information System
                                
                1:  Add your information to our database
                2:  View database
                                
                0:  Exit
                """);

        switch (Integer.parseInt(response)) {
            case 0 -> System.exit(0);
            case 1 -> yourInfo();
            case 2 -> viewDatabase();

        }

    }

    private static void viewDatabase() {
    }

    public static void editProfile() {
        String editPro = input("""
                            Update your profile below
                Please, be aware that you cannot update your name
                1:  Address
                2:  Telephone
                3:  Email
                                
                0:  Back""");
        switch (Integer.parseInt(editPro)) {
            case 0 -> yourInfo();
            case 1 -> updateAddress();
            case 2 -> updateTelephone();
            case 3 -> updateEmail();
            default -> {
                print("Invalid selection");
                editProfile();
            }
        }
    }

    private static void updateEmail() {
        int id = idInput();
        String email = input("Enter the new Email: ");

        directory.editContactEmail(id, email);
        System.out.println("\n ✅ Updated successfully\n");
        editProfile();
    }

    private static void updateTelephone() {
        int id = idInput();

        String phoneNumber = input("Enter new phone number");

        directory.editContactTelephone(id, phoneNumber);
        System.out.println("\n ✅ Updated successfully\n");
        editProfile();
    }
    private static int idInput() {
        return Integer.parseInt(input("""
                Please provide an accurate well detailed
                address below.
                
                Enter your ID below
                """));
    }
    private static void updateAddress() {
        int id = idInput();

        String houseNumber = input("Enter house number");
        String streetName = input("Enter Street name: ");
        String city = input("Enter City name: ");
        String state = input("Enter state name");
        String country = input("Enter Country: ");

        Address address = new Address(houseNumber, streetName, city);
        directory.editContactAddress(id, address);

        System.out.println("\n ✅ Updated successfully\n");
        editProfile();
    }

    private static void yourInfo() {
        String yourInfo = input("""
                Welcome!
                1:  Add your info
                2:  Edit your info
                                
                0:  Back
                """);
        switch (Integer.parseInt(yourInfo)) {
            case 0 -> menuView();
            case 1 -> addInfo();
            case 2 -> editProfile();
            default -> yourInfo();
        }
    }

    public static void addInfo() {
        String firstName = input("""
                 Be part of the future in the present.
                  
                Kindly provide your accurate info below
                
                Enter First Name""");

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

        print("✅ Added successfully!");
        menuView();
    }

    public static void menuView() {
        String response = input("""
                Welcome to DIS - Dean Information System
                                
                1:  Add your information to our database
                2:  View database
                                
                0:  Exit
                """);
        if (response.equals("0")) {
            System.exit(0);
        }
    }

    private static String input(String prompt) {
        print(prompt);
        return exInput.nextLine();
        //return JOptionPane.showInputDialog(null, prompt);
    }

    private static void print(String prompt) {
        System.out.println(prompt);
        //JOptionPane.showMessageDialog(null, prompt);
    }
}
