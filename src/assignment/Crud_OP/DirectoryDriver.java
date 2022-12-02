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
