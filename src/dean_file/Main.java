package dean_file;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        DeanFile myNotepad = notePadObj();
        menu(myNotepad);

    }

    public static void menu(DeanFile deanFile) {
        String reply = input("""
                1. Write Notes
                2. Exit
                """);
        switch (Integer.parseInt(reply)) {
            case 1 -> deanFile.writeToFile();
            case 2 -> System.exit(0);
        }


    }
    public static DeanFile notePadObj() {
        System.out.println();
        String name = input.nextLine();
        if (name.length() < 1) {
            print("Name cannot be empty");
            notePadObj();
        }
        DeanFile notepad = DeanFile.of("notepad.txt");

        print("Congratulations " + name + "\n\nYour notepad is created successfully");
        return notepad;
    }

    public static void print(String prompt) {
        System.out.println(prompt);
        //JOptionPane.showMessageDialog(null, prompt);
    }

    public static String input(String prompt) {
        System.out.println(prompt);
        return input.nextLine();
        //return JOptionPane.showInputDialog(null, prompt);
    }

    private static void printFile(DeanFile deanFile) {
        List<String> lines = deanFile.readFromFile();
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
